
plugins {
    id(Dependencies.AGP.javaLibrary)
    id(Dependencies.AGP.kotlinJvm)
    id(Dependencies.AGP.kotlin)
}

java {
    sourceCompatibility = Dependencies.ADC.sourceCompatibility7
    targetCompatibility = Dependencies.ADC.targetCompatibility7
}

dependencies{

    implementation(project(":core_new"))

    //inject
    implementation(Dependencies.Javax.inject)

    //coroutines
    implementation(Dependencies.Coroutines.coroutine)
}