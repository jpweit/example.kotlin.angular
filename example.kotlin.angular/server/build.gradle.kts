import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType

plugins {
    application
}

val version_ktor: String by project

dependencies {

    // need this so that the gradle application-plugin can find the module built by the kotlin-plugin
    runtime( project(path=":server", configuration="jvm8RuntimeElements") )

    // to put the client module (angular code) on the classpath
    jvm8MainImplementation(project(":client"))

    // ktor server modules
    jvm8MainImplementation("io.ktor:ktor-websockets:$version_ktor")
    jvm8MainImplementation("io.ktor:ktor-server-core:$version_ktor")
    jvm8MainImplementation("io.ktor:ktor-server-jetty:$version_ktor")

    commonMainImplementation(project(":gui2core"))
}

// so that the application plugin can find the jars from the kotlin-plugin jvm configuration
val runtimeClasspath by configurations.getting {
    attributes.attribute(KotlinPlatformType.attribute, KotlinPlatformType.jvm)
}

application {
    mainClassName = "net.akehurst.kotlin.example.addressbook.server.ServerKt"

}