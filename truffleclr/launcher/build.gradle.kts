plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

kotlin {
    jvmToolchain(25)
}

dependencies {
    implementation(project(":language"))
    implementation(libs.polyglot)
    compileOnly(libs.truffle.api)
    implementation(libs.clikt)
    runtimeOnly(libs.truffle.runtime)

    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
}

val truffleJvmArgs = listOf("--enable-native-access=ALL-UNNAMED", "--sun-misc-unsafe-memory-access=allow")

application {
    mainClass = "AppKt"
    applicationDefaultJvmArgs = truffleJvmArgs
}

tasks.test {
    useJUnitPlatform()
    workingDir = rootDir
    // The parameterized suite discovers these fixtures at runtime.
    inputs.files(fileTree(rootDir.resolve("test")) { include("*.il", "expected/*.out") })
    jvmArgs(truffleJvmArgs)
}
