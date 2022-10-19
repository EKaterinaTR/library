plugins {
    id("java")
}

version = "1.0"
group = "ru.katya"


allprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    dependencies {
        // https://mvnrepository.com/artifact/com.intellij/annotations
        implementation("com.intellij:annotations:12.0")
        compileOnly(group = "org.projectlombok", name = "lombok", version = "1.18.24")
        annotationProcessor(group = "org.projectlombok", name = "lombok", version = "1.18.24")
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    }
}



tasks.getByName<Test>("test") {
    useJUnitPlatform()
}