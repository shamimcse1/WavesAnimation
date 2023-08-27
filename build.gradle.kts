
buildscript {
    repositories {
        google()
        mavenCentral()

        maven(url = "https://jitpack.io")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.3.1")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
        classpath ("com.vanniktech:gradle-maven-publish-plugin:0.24.0")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.7.20")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }


}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.22" apply false
}