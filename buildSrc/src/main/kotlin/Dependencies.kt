import org.gradle.api.JavaVersion

object Dependencies {

    object AGP{
        const val kotlin = "kotlin"
        const val application = "com.android.application"
        const val library = "com.android.library"
        const val javaLibrary = "java-library"
        const val kotlinAndroid = "org.jetbrains.kotlin.android"
        const val daggerHiltPl = "com.google.dagger.hilt.android"
        const val kotlinJvm = "org.jetbrains.kotlin.jvm"
        const val kapt = "kotlin-kapt"

        const val androidVersion = "7.2.0"
        const val hiltVersion = "2.43"
        const val kotlinVersion = "1.7.0"
    }


    object ADC{
        const val compileSdk = 32
        const val applicationId = "com.example.cleanarchitectureapp"
        const val minSdk = 21
        const val  targetSdk = 32
        const val versionCode = 1
        const val versionName = "1.0"
        const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        const val isMinifyEnabled = false
        const val defProguardName = "proguard-android-optimize.txt"
        const val proguardFile = "proguard-rules.pro"
        val  sourceCompatibility7 = JavaVersion.VERSION_1_7
        val  sourceCompatibility = JavaVersion.VERSION_1_8
        val targetCompatibility7 = JavaVersion.VERSION_1_7
        val targetCompatibility = JavaVersion.VERSION_1_8

        const val  jvmTarget = "1.8"
        const val buildToolsVersion = "32.0.0"
    }

    object UI {
    const val androidCore = "androidx.core:core-ktx:1.8.0"
    const val appCompat = "androidx.appcompat:appcompat:1.4.2"
    const val material = "com.google.android.material:material:1.6.1"
    const val constraint = "androidx.constraintlayout:constraintlayout:2.1.4"
    const val navigationFragment = "androidx.navigation:navigation-fragment:2.3.5"
    const val testJUnit = "junit:junit:4.13.2"
    const val AndroidJUnit = "androidx.test.ext:junit:1.1.3"
    const val testEspresso = "androidx.test.espresso:espresso-core:3.4.0"
    const val fragment = "androidx.fragment:fragment-ktx:1.5.1"
    }

    object NavComponents{
        private const val nav_version = "2.5.1"
        const val navFragment = "androidx.navigation:navigation-fragment-ktx:$nav_version"
        const val navUI = "androidx.navigation:navigation-ui-ktx:$nav_version"
    }

    object LiveData {
        private const val lifecycle_version = "2.5.1"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version"
    }

    object KoinDI{
        private const val koin_version = "3.1.3"
        const val koin = "io.insert-koin:koin-android:$koin_version"
    }

    object Room{
        private const val room_version = "2.4.3"
        const val runtime = "androidx.room:room-runtime:$room_version"
        const val compiler = "androidx.room:room-compiler:$room_version"
        const val roomKtx = "androidx.room:room-ktx:$room_version"
    }

    object Coroutines{
        const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1"
    }

    object DaggerHilt{
        const val daggerHilt= "com.google.dagger:hilt-android:2.43"
        const val compiler = "com.google.dagger:hilt-compiler:2.43"
    }

    object Javax {
        const val inject = "javax.inject:javax.inject:1"
    }
}