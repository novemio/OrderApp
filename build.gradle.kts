import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
	repositories {
		google()
		jcenter()
		mavenCentral()
		maven { setUrl("https://www.jitpack.io") }
		
	}
	dependencies {
		classpath(Libs.com_android_tools_build_gradle)
		classpath(Libs.kotlin_gradle_plugin)
		classpath(Libs.android_junit5)
		classpath("com.google.gms:google-services:4.3.0")
	}
}
repositories {
	jcenter()
	google()
	maven { setUrl("https://maven.google.com") }
}

plugins {
	id("de.fayard.buildSrcVersions") version Versions.de_fayard_buildsrcversions_gradle_plugin
	id("io.gitlab.arturbosch.detekt") version Versions.io_gitlab_arturbosch_detekt
}

allprojects {
	repositories {
		google()
		jcenter()
		
	}
}

tasks {
	val clean by registering(Delete::class) {
		delete(buildDir)
	}
	
}



subprojects {
	
	// Junit 5 For Kotlin
	tasks.withType<KotlinCompile>().all {
		kotlinOptions {
			jvmTarget = "1.8"
		}
	}
	
}


