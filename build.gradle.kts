plugins {
    kotlin("jvm") version "2.1.20"
    `java-library`
}

allprojects {
    apply(plugin = "kotlin")
    apply(plugin = "java-library")

    group = "wtf.file"
    version = "1.0.0"

    repositories {
        mavenCentral()
    }
}

tasks.jar {
    subprojects.forEach { sub ->
        dependsOn(sub.tasks.jar)
    }

    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
}

dependencies {
    api(project(":api"))
    api(project(":impl"))
}

kotlin {
    jvmToolchain(22)
}
