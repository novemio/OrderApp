import org.gradle.api.Project
import versioning.AppVersion

object Config  {
	
	object Android{
		const val compileSdkVersion = 28
		const val minSdkVersion = 21
		const val targetVersion = 28
		const val instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
		const val applicationId =     "com.novemio.app.test"
		
		fun versioning(project:Project)= AppVersion(project)
		
	}
}

