plugins {
	kotlin("multiplatform") version "1.7.20"
	// KSP support needed for Lens generation
	id("com.google.devtools.ksp") version "1.7.20-1.0.6"
}

repositories {
	mavenCentral()
}

val fritz2Version = "1.0-RC4"

//group = "my.fritz2.app"
//version = "0.0.1-SNAPSHOT"

kotlin {
	jvm()
	js(IR) {
		browser()
	}.binaries.executable()

	sourceSets {
		val commonMain by getting {
			dependencies {
				implementation("dev.fritz2:core:$fritz2Version")
				// implementation("dev.fritz2:headless:$fritz2Version") // optional headless comp
			}
		}
		val jvmMain by getting {
			dependencies {
			}
		}
		val jsMain by getting {
			dependencies {
			}
		}
	}
}

/**
 * KSP support for Lens generation - start
 */
dependencies {
	add("kspCommonMainMetadata", "dev.fritz2:lenses-annotation-processor:$fritz2Version")
}
kotlin.sourceSets.commonMain { kotlin.srcDir("build/generated/ksp/metadata/commonMain/kotlin") }
tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinCompile<*>>().all {
	if (name != "kspCommonMainKotlinMetadata") dependsOn("kspCommonMainKotlinMetadata")
}
/**
 * KSP support - end
 */
