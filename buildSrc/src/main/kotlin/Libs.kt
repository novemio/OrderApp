import kotlin.String

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Update this file with
 *   `$ ./gradlew buildSrcVersions` */
object Libs {
    const val mock: String = "org.mockito:mockito-core:2.23.4"
	/**
     * http://developer.android.com/tools/extras/support-library.html */
    const val appcompat: String = "androidx.appcompat:appcompat:" + Versions.appcompat

    const val stetho : String ="com.facebook.stetho:stetho:1.5.0"
    /**
     * http://developer.android.com/tools/extras/support-library.html */
    const val cardview: String = "androidx.cardview:cardview:" + Versions.cardview

    /**
     * http://tools.android.com */
    const val constraintlayout: String = "androidx.constraintlayout:constraintlayout:" +
            Versions.constraintlayout

    /**
     * http://developer.android.com/tools/extras/support-library.html */
    const val core_ktx: String = "androidx.core:core-ktx:" + Versions.core_ktx

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html */
    const val lifecycle_extensions: String = "androidx.lifecycle:lifecycle-extensions:" +
            Versions.lifecycle_extensions

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html */
    const val navigation_fragment_ktx: String = "androidx.navigation:navigation-fragment-ktx:" +
            Versions.androidx_navigation

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html */
    const val navigation_ui_ktx: String = "androidx.navigation:navigation-ui-ktx:" +
            Versions.androidx_navigation

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html */
    const val paging_runtime: String = "androidx.paging:paging-runtime:" + Versions.paging_runtime

    /**
     * http://developer.android.com/tools/extras/support-library.html */
    const val recyclerview: String = "androidx.recyclerview:recyclerview:" + Versions.recyclerview

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html */
    const val room_compiler: String = "androidx.room:room-compiler:" + Versions.androidx_room

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html */
    const val room_runtime: String = "androidx.room:room-runtime:" + Versions.androidx_room

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html */
    const val room_rxjava2: String = "androidx.room:room-rxjava2:" + Versions.androidx_room

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html */
    const val room_testing: String = "androidx.room:room-testing:" + Versions.androidx_room

    /**
     * https://developer.android.com/testing */
    const val espresso_core: String = "androidx.test.espresso:espresso-core:" +
            Versions.espresso_core

    /**
     * https://developer.android.com/testing */
    const val androidx_test_core: String = "androidx.test:core:" + Versions.androidx_test

    /**
     * https://developer.android.com/testing */
    const val androidx_test_runner: String = "androidx.test:runner:" + Versions.androidx_test

    /**
     * https://developer.android.com/studio */
    const val com_android_tools_build_gradle: String = "com.android.tools.build:gradle:" +
            Versions.com_android_tools_build_gradle

    /**
     * https://developer.android.com/studio */
    const val lint_gradle: String = "com.android.tools.lint:lint-gradle:" + Versions.lint_gradle

    /**
     * https://github.com/google/auto */
    const val auto_value: String = "com.google.auto.value:auto-value:" + Versions.auto_value
    const val auto_value_annotation: String = "com.google.auto.value:auto-value-annotations:" + Versions
        .auto_value_annotations

    /**
     * https://github.com/google/dagger */
    const val dagger_android_processor: String = "com.google.dagger:dagger-android-processor:" +
            Versions.com_google_dagger

    /**
     * https://github.com/google/dagger */
    const val dagger_android_support: String = "com.google.dagger:dagger-android-support:" +
            Versions.com_google_dagger

    /**
     * https://github.com/google/dagger */
    const val dagger_compiler: String = "com.google.dagger:dagger-compiler:" +
            Versions.com_google_dagger

    /**
     * https://github.com/google/dagger */
    const val dagger: String = "com.google.dagger:dagger:" + Versions.com_google_dagger
    

    /**
     * https://github.com/square/moshi */
    const val moshi_kotlin_codegen: String = "com.squareup.moshi:moshi-kotlin-codegen:" +
            Versions.com_squareup_moshi

    /**
     * https://github.com/square/moshi */
    const val moshi_kotlin: String = "com.squareup.moshi:moshi-kotlin:" +
            Versions.com_squareup_moshi

    /**
     * https://github.com/square/okhttp */
    const val logging_interceptor: String = "com.squareup.okhttp3:logging-interceptor:" +
            Versions.com_squareup_okhttp3

    /**
     * https://github.com/square/okhttp */
    const val okhttp: String = "com.squareup.okhttp3:okhttp:" + Versions.com_squareup_okhttp3

    /**
     * https://github.com/square/retrofit/ */
    const val adapter_rxjava2: String = "com.squareup.retrofit2:adapter-rxjava2:" +
            Versions.com_squareup_retrofit2

    /**
     * https://github.com/square/retrofit/ */
    const val converter_moshi: String = "com.squareup.retrofit2:converter-moshi:" +
            Versions.com_squareup_retrofit2

    /**
     * https://github.com/square/retrofit/ */
    const val retrofit: String = "com.squareup.retrofit2:retrofit:" +
            Versions.com_squareup_retrofit2

    const val de_fayard_buildsrcversions_gradle_plugin: String =
            "de.fayard.buildSrcVersions:de.fayard.buildSrcVersions.gradle.plugin:" +
            Versions.de_fayard_buildsrcversions_gradle_plugin

    /**
     * https://github.com/mannodermaus/android-junit5 */
    const val android_junit5: String = "de.mannodermaus.gradle.plugins:android-junit5:" +
            Versions.android_junit5

    /**
     * https://github.com/mannodermaus/android-junit5 */
    const val android_test_core: String = "de.mannodermaus.junit5:android-test-core:" +
            Versions.de_mannodermaus_junit5

    /**
     * https://github.com/mannodermaus/android-junit5 */
    const val android_test_runner: String = "de.mannodermaus.junit5:android-test-runner:" +
            Versions.de_mannodermaus_junit5

    const val detekt_cli: String = "io.gitlab.arturbosch.detekt:detekt-cli:" +
            Versions.io_gitlab_arturbosch_detekt

    const val io_gitlab_arturbosch_detekt_gradle_plugin: String =
            "io.gitlab.arturbosch.detekt:io.gitlab.arturbosch.detekt.gradle.plugin:" +
            Versions.io_gitlab_arturbosch_detekt

    /**
     * http://mockk.io */
    const val mockk_android: String = "io.mockk:mockk-android:" + Versions.io_mockk

    /**
     * http://mockk.io */
    const val mockk: String = "io.mockk:mockk:" + Versions.io_mockk

    /**
     * http://junit.org */
    const val junit: String = "junit:junit:" + Versions.junit

    /**
     * https://kotlinlang.org/ */
    const val kotlin_android_extensions_runtime: String =
            "org.jetbrains.kotlin:kotlin-android-extensions-runtime:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/ */
    const val kotlin_android_extensions: String =
            "org.jetbrains.kotlin:kotlin-android-extensions:" + Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/ */
    const val kotlin_annotation_processing_gradle: String =
            "org.jetbrains.kotlin:kotlin-annotation-processing-gradle:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/ */
    const val kotlin_gradle_plugin: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/ */
    const val kotlin_stdlib_jdk7: String = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://junit.org/junit5/ */
    const val junit_jupiter_api: String = "org.junit.jupiter:junit-jupiter-api:" +
            Versions.org_junit_jupiter

    /**
     * https://junit.org/junit5/ */
    const val junit_jupiter_engine: String = "org.junit.jupiter:junit-jupiter-engine:" +
            Versions.org_junit_jupiter

    /**
     * https://junit.org/junit5/ */
    const val junit_jupiter_params: String = "org.junit.jupiter:junit-jupiter-params:" +
            Versions.org_junit_jupiter
}