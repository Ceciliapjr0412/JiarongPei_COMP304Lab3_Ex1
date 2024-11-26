// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        //noinspection GradlePluginVersion,GradlePluginVersion,GradlePluginVersion,GradlePluginVersion,GradlePluginVersion
        classpath(libs.gradle)
        //noinspection UseTomlInstead,UseTomlInstead,UseTomlInstead,UseTomlInstead,UseTomlInstead,UseTomlInstead
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.48")
    }
}