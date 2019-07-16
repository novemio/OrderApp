import com.android.build.gradle.internal.tasks.factory.dependsOn
import de.mannodermaus.gradle.plugins.junit5.junitPlatform
import naming.FormatAppName
import resources.Resources
import tasks.CreateRelease
import tasks.IncrementBuildNumber
import tasks.IncrementPatchNumber

plugins {
	id("com.android.application")
	kotlin("android")
	kotlin("android.extensions")
	kotlin("kapt")
	id("de.mannodermaus.android-junit5")
	
}


android {
	
	testOptions {
		junitPlatform {
			// Here it is!
			unitTests.isReturnDefaultValues = true
		}
		unitTests.isReturnDefaultValues = true
	}
	
	sourceSets {
		getByName("main").res.run {
			srcDirs(Resources.dirs)
		}
	}
	
	// 4) JUnit 5 will bundle in files with identical paths; exclude them
	packagingOptions {
		exclude("META-INF/LICENSE*")
	}
	
	// 3) Java 8 is required
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
	
	
	compileSdkVersion(Config.Android.compileSdkVersion)
	defaultConfig {
		minSdkVersion(Config.Android.minSdkVersion)
		targetSdkVersion(Config.Android.targetVersion)
		testInstrumentationRunner = Config.Android.instrumentationRunner
		testInstrumentationRunnerArgument("runnerBuilder", "de.mannodermaus.junit5.AndroidJUnit5Builder")
		applicationId = Config.Android.applicationId
		Config.Android.versioning(rootProject).run {
			versionCode = appVersionCode
			versionName = appVersionName
		}
		
	}
	buildTypes {
		getByName("release") {
			isMinifyEnabled = false
			proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
		}
	}
	
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
	
	
	flavorDimensions("app")
	productFlavors {
		create("dev") {
			dimension = "app"
			applicationIdSuffix = ".dev"
		}
		
		
		create("prod") {
			dimension = "app"
		}
	}
	
	android.applicationVariants.all {
		FormatAppName.format(this)
	}
	//	android.applicationVariants.all { variant ->
	//		//		FormatAppName.format(variant)
	//	}
	
}

dependencies {
	implementation(project(":core"))
	
	implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
	implementation(Libs.kotlin_stdlib_jdk7)
	implementation(Libs.appcompat)
	implementation(Libs.core_ktx)
	
	//Android libs
	implementation(Libs.constraintlayout)
	implementation(Libs.recyclerview)
	implementation(Libs.cardview)
	
	//Navigation
	implementation(Libs.navigation_fragment_ktx)
	implementation(Libs.navigation_ui_ktx)
	
	//Stetho
	
	//Room database
	implementation(Libs.room_rxjava2)
	implementation(Libs.room_runtime)
	testImplementation(Libs.room_testing)
	
	//Retrofit
	implementation(Libs.retrofit)
	implementation(Libs.adapter_rxjava2)
	implementation(Libs.converter_moshi)
	
	//ok http
	implementation(Libs.okhttp)
	implementation(Libs.logging_interceptor)
	
	//dagger
	implementation(Libs.dagger)
	implementation(Libs.dagger_android_support)
	kapt(Libs.dagger_android_processor)
	kapt(Libs.dagger_compiler)
	
	//Moshi
	implementation(Libs.moshi_kotlin)
	kapt(Libs.moshi_kotlin_codegen)
	
	//Tests
	
	//JUnit 5
	testImplementation(Libs.junit_jupiter_params)
	testImplementation(Libs.junit_jupiter_api)
	androidTestImplementation(Libs.junit_jupiter_api)
	
	testRuntimeOnly(Libs.junit_jupiter_engine)
	androidTestRuntimeOnly(Libs.junit_jupiter_engine)
	
	testImplementation(Libs.mockk)
	//	testImplementation(Libs.mock)
	androidTestImplementation(Libs.mockk_android)
	
	androidTestImplementation(Libs.androidx_test_runner)
	androidTestImplementation(Libs.androidx_test_core)
	
	androidTestImplementation(Libs.espresso_core)
	
	androidTestImplementation("de.mannodermaus.junit5:android-test-core:1.0.0")
	androidTestRuntimeOnly("de.mannodermaus.junit5:android-test-runner:1.0.0")
}

configurations.all {
	resolutionStrategy.force("org.jetbrains.kotlin:kotlin-reflect:1.3.40")
	
}

tasks {
	val incrementPatchNumber by register("incrementPatchNumber", IncrementPatchNumber::class)
	val incrementBuildNumber by register("incrementBuildNumber", IncrementBuildNumber::class)
	val incrementPatchAndBuildNumber by register("incrementPatchAndBuildNumber", IncrementBuildNumber::class).apply {
		dependsOn(incrementPatchNumber)
	}
	
	val createRelease by register("createRelease", CreateRelease::class).apply {
		dependsOn(incrementPatchAndBuildNumber)
	}

}
