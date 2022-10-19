plugins {
    java
}

version = "1.0"
group = "ru.katya.library"

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}


