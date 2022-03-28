package org.example

import arrow.optics.optics
import kotlin.time.Duration

@optics
data class OpticsTest(
  val time: Duration
) {
  companion object
}
