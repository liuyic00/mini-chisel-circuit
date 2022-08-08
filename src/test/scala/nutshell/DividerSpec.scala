package nutshell

import chisel3._
import chisel3.util._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class DividerSpec extends AnyFlatSpec with ChiselScalatestTester {
  behavior of "Divider"
  it should "could emit low-firrtl" in {
    (new chisel3.stage.ChiselStage)
      .emitFirrtl(new Divider(64), Array("-E", "low", "--target-dir", "test_run_dir/" + getTestName))
  }
}
