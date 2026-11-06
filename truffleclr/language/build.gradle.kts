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
    implementation(libs.truffle.api)
    kapt(libs.truffle.dsl.processor)
}

// The antlr plugin leaks the full ANTLR tool onto the runtime classpath; only the runtime is needed.
configurations.api {
    setExtendsFrom(extendsFrom.filterNot { it.name == "antlr" })
}

tasks.generateGrammarSource {
    arguments.addAll(listOf("-visitor", "-package", "Cil"))
}

// Kotlin sources (and kapt stubs) reference the generated parser.
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    dependsOn(tasks.generateGrammarSource)
}
