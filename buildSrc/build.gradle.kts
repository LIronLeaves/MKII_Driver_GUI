// Lars Eisenblaetter, 01.07.2022
// setup gradle.dsl to be able to use it
import org.gradle.kotlin.dsl.`kotlin-dsl`

repositories {
    mavenCentral()
}

plugins {
    `kotlin-dsl`
}