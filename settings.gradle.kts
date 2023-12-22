dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
        maven("https://jitpack.io")
    }
}

rootProject.name = "Aniyomi Extensions Inspector"
include(":server")
include(":AndroidCompat")
include(":AndroidCompat:Config")
