plugins {
  kotlin("jvm") version "1.6.10"
  id("io.kotest.multiplatform") version "5.2.1"
  id("com.google.devtools.ksp") version "1.6.10-1.0.4"
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
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
  implementation("io.arrow-kt:arrow-fx-coroutines:1.0.1")
  ksp("io.arrow-kt:arrow-optics-ksp-plugin:1.0.3-alpha.29")

  testImplementation("io.kotest:kotest-property:5.2.1")
  testImplementation("io.kotest:kotest-assertions-core:5.2.0")
  testImplementation("io.kotest.extensions:kotest-assertions-arrow:1.2.3")
  testImplementation("io.kotest.extensions:kotest-property-arrow:1.2.3") // optional
  testImplementation("io.kotest.extensions:kotest-property-arrow-optics:1.2.3") // optional
  testImplementation("io.kotest:kotest-runner-junit5-jvm:5.2.0")
}

kotlin {
  sourceSets.main {
    kotlin.srcDir("build/generated/ksp/main/kotlin")
  }
  sourceSets.test {
    kotlin.srcDir("build/generated/ksp/test/kotlin")
  }
}
