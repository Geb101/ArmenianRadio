plugins {
    kotlin("jvm") version "1.9.22"
}

group = "org.geb101.kotlin.armenianradio"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("dev.kord:kord-core:0.13.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}