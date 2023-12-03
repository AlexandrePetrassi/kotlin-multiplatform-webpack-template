plugins {
    kotlin("multiplatform") version "1.9.21"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
    js {
        browser {
            webpackTask {}
            testRuns { }
        }
        binaries.executable()
    }
    sourceSets {
        jsMain {}
        jsTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
