plugins {
  kotlin("jvm") version "1.9.25"
  id("io.kotest.multiplatform") version "5.9.1"
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
  implementation("io.arrow-kt:arrow-core:1.2.4")
  implementation("io.arrow-kt:arrow-optics:1.2.4")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
  implementation("io.arrow-kt:arrow-fx-coroutines:1.2.4")

  testImplementation("io.kotest:kotest-property:5.9.1")
  testImplementation("io.kotest:kotest-assertions-core:5.9.1")
  testImplementation("io.kotest.extensions:kotest-assertions-arrow:1.4.0")
  testImplementation("io.kotest.extensions:kotest-property-arrow:1.4.0") // optional
  testImplementation("io.kotest.extensions:kotest-property-arrow-optics:1.4.0") // optional
  testImplementation("io.kotest:kotest-runner-junit5-jvm:5.9.1")
}
