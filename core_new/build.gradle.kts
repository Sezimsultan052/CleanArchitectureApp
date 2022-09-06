plugins {
    id(Dependencies.AGP.javaLibrary)
    id(Dependencies.AGP.kotlinJvm)
}

java {
    sourceCompatibility = Dependencies.ADC.sourceCompatibility7
    targetCompatibility =  Dependencies.ADC.targetCompatibility7
}

dependencies{

    //Coroutines
    implementation(Dependencies.Coroutines.coroutine)
}