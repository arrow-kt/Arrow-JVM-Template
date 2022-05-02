plugins {
  kotlin("jvm") version "1.6.21"
  id("io.kotest.multiplatform") version "5.3.0"
  id("com.google.devtools.ksp") version "1.6.21-1.0.5"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib"))
  implementation("io.arrow-kt:arrow-core:1.1.2")
  implementation("io.arrow-kt:arrow-optics:1.1.2")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
  implementation("io.arrow-kt:arrow-fx-coroutines:1.1.2")
  ksp("io.arrow-kt:arrow-optics-ksp-plugin:1.1.2")

  testImplementation("io.kotest:kotest-property:5.3.0")
  testImplementation("io.kotest:kotest-assertions-core:5.3.0")
  testImplementation("io.kotest.extensions:kotest-assertions-arrow:1.2.5")
  testImplementation("io.kotest.extensions:kotest-property-arrow:1.2.5") // optional
  testImplementation("io.kotest.extensions:kotest-property-arrow-optics:1.2.5") // optional
  testImplementation("io.kotest:kotest-runner-junit5-jvm:5.3.0")
}

kotlin {
  sourceSets.main {
    kotlin.srcDir("build/generated/ksp/main/kotlin")
  }
  sourceSets.test {
    kotlin.srcDir("build/generated/ksp/test/kotlin")
  }
}
