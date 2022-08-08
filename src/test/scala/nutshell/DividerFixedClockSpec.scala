package nutshell

import chisel3._
import chisel3.util._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class DividerFixedClockSpec extends AnyFlatSpec with ChiselScalatestTester {
  behavior of "DividerFixedClock"
  it should "could emit low-firrtl" in {
    (new chisel3.stage.ChiselStage)
      .emitFirrtl(new DividerFixedClock(64), Array("-E", "low", "--target-dir", "test_run_dir/" + getTestName))
  }
}
