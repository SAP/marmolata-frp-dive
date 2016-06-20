package react.debug

import scala.scalajs.js

trait EnsureLargeEnoughStackTrace {
  if (js.Error.asInstanceOf[js.Dynamic].stackTraceLimit.isInstanceOf[Int]) {
    val errorDynamic = js.Error.asInstanceOf[js.Dynamic]
    if (errorDynamic.stackTraceLimit.asInstanceOf[Int] < 30) {
      errorDynamic.stackTraceLimit = 30
    }
  }
}
