// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0-beta02" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
}

    ext {
        val appCompatVersion: String by extra("1.6.1")
        val materialVersion: String by extra("1.8.0")
        val coreKtxVersion: String by extra("1.9.0")
    }