
plugins {
    id(Dependencies.AGP.library)
    id(Dependencies.AGP.kotlinAndroid)
    id(Dependencies.AGP.kapt)
}

android {
    compileSdk = Dependencies.ADC.compileSdk

    defaultConfig {
        minSdk = Dependencies.ADC.minSdk
        targetSdk = Dependencies.ADC.targetSdk

        testInstrumentationRunner = Dependencies.ADC.testInstrumentationRunner
        consumerProguardFiles(Dependencies.ADC.proguardFile)
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
        sourceCompatibility =Dependencies.ADC.sourceCompatibility
        targetCompatibility = Dependencies.ADC.targetCompatibility
    }
    kotlinOptions {
        jvmTarget = Dependencies.ADC.jvmTarget
    }
}

dependencies {

    //domain
    implementation(project(":domain"))
    //core_new
    implementation(project(":core_new"))

    //ui
    implementation(Dependencies.UI.androidCore)
    implementation(Dependencies.UI.appCompat)
    implementation(Dependencies.UI.material)

    //test
    testImplementation(Dependencies.UI.testJUnit)
    androidTestImplementation(Dependencies.UI.AndroidJUnit)
    androidTestImplementation(Dependencies.UI.testEspresso)

    //dagger-hilt
    implementation(Dependencies.DaggerHilt.daggerHilt)
    kapt(Dependencies.DaggerHilt.compiler)

    //room
    implementation(Dependencies.Room.runtime)
    kapt(Dependencies.Room.compiler)
    implementation(Dependencies.Room.roomKtx)
}