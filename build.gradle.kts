// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id (Dependencies.AGP.application) version Dependencies.AGP.androidVersion apply false
    id (Dependencies.AGP.library) version Dependencies.AGP.androidVersion apply false
    id (Dependencies.AGP.kotlinAndroid) version Dependencies.AGP.kotlinVersion apply false
    id (Dependencies.AGP.daggerHiltPl) version Dependencies.AGP.hiltVersion apply false
    id("org.jetbrains.kotlin.jvm") version "1.7.0" apply false
}
