plugins {
  kotlin("jvm") version "1.7.10"
  id("io.kotest.multiplatform") version "5.4.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib"))
  implementation("io.arrow-kt:arrow-core:1.1.3-rc.1")
  implementation("io.arrow-kt:arrow-optics:1.1.3-rc.1")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
  implementation("io.arrow-kt:arrow-fx-coroutines:1.1.3-rc.1")

  testImplementation("io.kotest:kotest-property:5.4.2")
  testImplementation("io.kotest:kotest-assertions-core:5.4.2")
  testImplementation("io.kotest.extensions:kotest-assertions-arrow:1.2.5")
  testImplementation("io.kotest.extensions:kotest-property-arrow:1.2.5") // optional
  testImplementation("io.kotest.extensions:kotest-property-arrow-optics:1.2.5") // optional
  testImplementation("io.kotest:kotest-runner-junit5-jvm:5.4.2")
}
