plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.kapt)
    antlr
}

kotlin {
    jvmToolchain(25)
    compilerOptions {
        freeCompilerArgs.addAll("-Xno-param-assertions", "-Xno-call-assertions", "-Xno-receiver-assertions")
    }
}

dependencies {
    antlr(libs.antlr.tool)
    implementation(libs.antlr.runtime)
    implementation(libs.gson)
    implementation(libs.truffle.api)
    kapt(libs.truffle.dsl.processor)
}

// The antlr plugin leaks the full ANTLR tool onto the runtime classpath; only the runtime is needed.
configurations.api {
    setExtendsFrom(extendsFrom.filterNot { it.name == "antlr" })
}

// Package the host library as a resource; the FFM bridge extracts it once per JVM.
val nativeRoot = rootDir.parentFile.resolve("native")
val nativeTarget = layout.buildDirectory.dir("native")
val nativeLibrary = nativeTarget.map { it.file("release/${System.mapLibraryName("dllreader")}") }
val buildDllReader by tasks.registering(Exec::class) {
    workingDir(nativeRoot)
    commandLine("cargo", "build", "--release", "--locked", "--target-dir", nativeTarget.get().asFile.absolutePath)
    inputs.files(fileTree(nativeRoot) { exclude("**/target/**") })
    outputs.file(nativeLibrary)
}

tasks.processResources {
    dependsOn(buildDllReader)
    from(nativeLibrary) { into("native") }
}

tasks.generateGrammarSource {
    arguments.addAll(listOf("-visitor", "-package", "Cil"))
}

// Kotlin sources (and kapt stubs) reference the generated parser.
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    dependsOn(tasks.generateGrammarSource)
}
