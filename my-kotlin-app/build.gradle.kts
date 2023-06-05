// build.gradle.kts
dependencies {
	implementation(kotlin("stdlib-js"))
	implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.7.2")
	implementation("io.quarkus:quarkus-core:${quarkusVersion}")
	implementation("io.quarkus:quarkus-kotlin:${quarkusVersion}")
	implementation("io.quarkus:quarkus-resteasy:${quarkusVersion}")
	implementation("io.quarkus:quarkus-jackson:${quarkusVersion}")
}
