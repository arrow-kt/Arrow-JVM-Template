plugins {
  kotlin("jvm") version "2.1.20"
  id("io.kotest.multiplatform") version "6.0.0-LOCAL"
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
  implementation("io.arrow-kt:arrow-core:2.1.0")
  implementation("io.arrow-kt:arrow-optics:2.1.0")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
  implementation("io.arrow-kt:arrow-fx-coroutines:2.1.0")

  testImplementation("io.kotest:kotest-property:5.8.0")
  testImplementation("io.kotest:kotest-assertions-core:5.8.0")
  testImplementation("io.kotest.extensions:kotest-assertions-arrow:2.0.0")
  testImplementation("io.kotest.extensions:kotest-property-arrow:2.0.0") // optional
  testImplementation("io.kotest.extensions:kotest-property-arrow-optics:2.0.0") // optional
  testImplementation("io.kotest:kotest-runner-junit5-jvm:5.8.0")
}
