package versioning

import org.gradle.api.Project

/**
 * Created by novemio on 7/16/19.
 */
class AppVersion(private val vp: VersionProperties) {
	
	val appVersionCode: Int
	val appVersionName: String
	val appVersionShort: String
	
	init {
		appVersionCode = initVersionCode()
		appVersionName = initVersionName()
		appVersionShort = initVersionShort()
	}
	
	private fun initVersionShort(): String = "${vp.versionMajor}.${vp.versionMinor}.${vp.versionPatch}"
	
	constructor(rootProject: Project) : this(VersionProperties(rootProject.file("config/version.properties")))
	
	private fun initVersionCode() = vp.versionMajor * 1000000 + vp.versionMinor * 10000 + vp.versionPatch * 100 -
		if (vp.versionRcBuild > 0) 100 + vp.versionRcBuild else 0
	
	private fun initVersionName(): String =
		if (vp.versionRcBuild > 0) {
			"${vp.versionMajor}.${vp.versionMinor}.${vp.versionPatch}-RC${vp.versionRcBuild}"
		} else {
			"${vp.versionMajor}.${vp.versionMinor}.${vp.versionPatch}"
		}
	
}