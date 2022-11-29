plugins {
  kotlin("jvm") version "1.7.22"
  id("io.kotest.multiplatform") version "5.5.4"
  id("com.google.devtools.ksp") version "1.7.22-1.0.8"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
  maven {
    url = uri("https://oss.sonatype.org/content/repositories/snapshots")
  }
  // for kotest snapshots
  maven {
    url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
  }
}

dependencies {
  implementation(kotlin("stdlib"))
  implementation("io.arrow-kt:arrow-core:1.1.3")
  implementation("io.arrow-kt:arrow-optics:1.1.3")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
  implementation("io.arrow-kt:arrow-fx-coroutines:1.1.3")
  ksp("io.arrow-kt:arrow-optics-ksp-plugin:1.1.3")

  testImplementation("io.kotest:kotest-property:5.5.4")
  testImplementation("io.kotest:kotest-assertions-core:5.5.4")
  testImplementation("io.kotest.extensions:kotest-assertions-arrow:1.3.0")
  testImplementation("io.kotest.extensions:kotest-property-arrow:1.3.0") // optional
  testImplementation("io.kotest.extensions:kotest-property-arrow-optics:1.3.0") // optional
  testImplementation("io.kotest:kotest-runner-junit5-jvm:5.5.4")
}

tasks.withType<Test> {
  useJUnitPlatform()
}

kotlin {
  sourceSets.main {
    kotlin.srcDir("build/generated/ksp/main/kotlin")
  }
  sourceSets.test {
    kotlin.srcDir("build/generated/ksp/test/kotlin")
  }
}
