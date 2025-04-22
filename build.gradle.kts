plugins {
  alias(libs.plugins.kotlin.jvm)
  alias(libs.plugins.ksp)
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

tasks.withType<Test> {
  useJUnitPlatform()
}

dependencies {
  implementation(kotlin("stdlib"))
  implementation(libs.coroutines.core)
  implementation(libs.arrow.core)
  implementation(libs.arrow.fxCoroutines)
  implementation(libs.arrow.resilience)
  implementation(libs.arrow.optics)

  ksp(libs.arrow.optics.ksp)

  testImplementation(kotlin("test"))
  testImplementation(libs.bundles.testing)
}
