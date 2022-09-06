plugins {
    id(Dependencies.AGP.library)
    id(Dependencies.AGP.kotlinAndroid)
}

android {
    compileSdk = Dependencies.ADC.compileSdk

    defaultConfig {
        minSdk = Dependencies.ADC.minSdk
        targetSdk = Dependencies.ADC.targetSdk

        testInstrumentationRunner = Dependencies.ADC.testInstrumentationRunner
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(Dependencies.ADC.defProguardName),
                Dependencies.ADC.proguardFile
            )
        }
    }
    compileOptions {
        sourceCompatibility = Dependencies.ADC.sourceCompatibility
        targetCompatibility = Dependencies.ADC.targetCompatibility
    }
    kotlinOptions {
        jvmTarget = Dependencies.ADC.jvmTarget
    }
}

dependencies {

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

    //LiveData
    implementation (Dependencies.LiveData.viewModel)
    implementation (Dependencies.LiveData.liveData)
    implementation (Dependencies.LiveData.runtime)
}