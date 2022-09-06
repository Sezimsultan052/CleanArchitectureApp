plugins {
    id (Dependencies.AGP.application)
    id (Dependencies.AGP.kotlinAndroid)
    id (Dependencies.AGP.kapt)
    id (Dependencies.AGP.daggerHiltPl)

}


android {
    compileSdk = Dependencies.ADC.compileSdk

    defaultConfig {
        applicationId = Dependencies.ADC.applicationId
        minSdk =  Dependencies.ADC.minSdk
        targetSdk =  Dependencies.ADC.targetSdk
        versionCode =  Dependencies.ADC.versionCode
        versionName =  Dependencies.ADC.versionName

        testInstrumentationRunner =  Dependencies.ADC.testInstrumentationRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = Dependencies.ADC.isMinifyEnabled
            proguardFiles(getDefaultProguardFile(Dependencies.ADC.defProguardName),Dependencies.ADC.proguardFile)
        }
    }
    compileOptions {
        sourceCompatibility = Dependencies.ADC.sourceCompatibility
        targetCompatibility = Dependencies.ADC.targetCompatibility
    }
    kotlinOptions {
        jvmTarget = Dependencies.ADC.jvmTarget
    }

    buildFeatures {
        viewBinding = true
    }
    buildToolsVersion = Dependencies.ADC.buildToolsVersion
}

dependencies {

    implementation(project(":domain"))
    implementation(project(":core_ui"))
    implementation(project(":core_new"))

    implementation(Dependencies.UI.androidCore)
    implementation(Dependencies.UI.appCompat)
    implementation(Dependencies.UI.material)
    implementation(Dependencies.UI.constraint)
    implementation(Dependencies.UI.navigationFragment)
    testImplementation(Dependencies.UI.testJUnit)
    androidTestImplementation(Dependencies.UI.AndroidJUnit)
    androidTestImplementation(Dependencies.UI.testEspresso)
    implementation(Dependencies.UI.fragment)

    // NavComponents
    implementation(Dependencies.NavComponents.navFragment)
    implementation(Dependencies.NavComponents.navUI)

    //LiveData
    implementation(Dependencies.LiveData.viewModel)
    implementation(Dependencies.LiveData.liveData)
    implementation(Dependencies.LiveData.runtime)

    // KoinDI
    implementation(Dependencies.KoinDI.koin)

    //room
//    implementation "android.arch.persistence.room:runtime:1.0.0"
//    annotationProcessor "android.arch.persistence.room:compiler:1.0.0"

    implementation(Dependencies.Room.runtime)
    kapt(Dependencies.Room.compiler)
    implementation(Dependencies.Room.roomKtx)

    // Coroutines
    implementation(Dependencies.Coroutines.coroutine)

    // Dagger-Hilt
    implementation(Dependencies.DaggerHilt.daggerHilt)
    kapt(Dependencies.DaggerHilt.compiler)

}