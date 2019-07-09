/**
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version. */
object Versions {
	const val appcompat: String = "1.0.2"
	
	const val cardview: String = "1.0.0"
	
	const val constraintlayout: String = "1.1.3"
	
	const val core_ktx: String = "1.0.2"
	
	const val lifecycle_extensions: String = "2.0.0"
	
	const val androidx_navigation: String = "2.0.0"
	
	const val paging_runtime: String = "2.1.0"
	
	const val recyclerview: String = "1.0.0"
	
	const val androidx_room: String = "2.1.0"
	
	const val espresso_core: String = "3.2.0"
	
	const val androidx_test: String = "1.2.0"
	
	const val com_android_tools_build_gradle: String = "3.4.1"
	
	const val lint_gradle: String = "26.4.1"
	
	const val auto_value: String = "1.6.5"
	const val auto_value_annotations = "1.6.3"
	const val com_google_dagger: String = "2.22.1"
	
	const val checknamingconvention: String = "0.1.0"
	
	const val com_squareup_moshi: String = "1.8.0"
	
	const val com_squareup_okhttp3: String = "3.14.2" // available: "4.0.0"
	
	const val com_squareup_retrofit2: String = "2.6.0"
	
	const val de_fayard_buildsrcversions_gradle_plugin: String = "0.3.2"
	
	const val android_junit5: String = "1.4.2.1"
	
	const val de_mannodermaus_junit5: String = "1.0.0"
	
	const val io_gitlab_arturbosch_detekt: String = "1.0.0-RC15"
	
	const val io_mockk: String = "1.9" // available: "1.9.3"
	
	const val junit: String = "4.12"
	
	const val org_jetbrains_kotlin: String = "1.3.40"
	
	const val org_junit_jupiter: String = "5.5.0"
	
	/**
	 *
	 *   To update Gradle, edit the wrapper file at path:
	 *      ./gradle/wrapper/gradle-wrapper.properties
	 */
	object Gradle {
		const val runningVersion: String = "5.4.1"
		
		const val currentVersion: String = "5.5"
		
		const val nightlyVersion: String = "5.6-20190702000118+0000"
		
		const val releaseCandidate: String = ""
	}
}
