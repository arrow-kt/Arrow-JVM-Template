plugins {
  kotlin("jvm") version "1.6.20"
  id("io.kotest.multiplatform") version "5.2.3"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib"))
  implementation("io.arrow-kt:arrow-core:1.0.1")
  implementation("io.arrow-kt:arrow-optics:1.0.1")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
  implementation("io.arrow-kt:arrow-fx-coroutines:1.0.1")

  testImplementation("io.kotest:kotest-property:5.2.2")
  testImplementation("io.kotest:kotest-assertions-core:5.2.2")
  testImplementation("io.kotest.extensions:kotest-assertions-arrow:1.2.4")
  testImplementation("io.kotest.extensions:kotest-property-arrow:1.2.4") // optional
  testImplementation("io.kotest.extensions:kotest-property-arrow-optics:1.2.4") // optional
  testImplementation("io.kotest:kotest-runner-junit5-jvm:5.2.2")
}
