plugins {
    java
    application
}

version = "1.0"
group = "ru.katya.main"


application {
    mainClass.set("ru.katya.main.Application")

}


dependencies {
    implementation(project(":models"))
    implementation("com.google.code.gson:gson:2.9.1")
}
tasks.getByName<Test>("test") {
    useJUnitPlatform()
}




