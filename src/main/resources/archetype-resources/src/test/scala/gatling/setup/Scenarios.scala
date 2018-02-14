package ${package}.gatling.setup

import ${package}.gatling.useCases._
import ${package}.gatling.feeders._
import io.gatling.core.Predef._
import scala.concurrent.duration._

/**
 * This object collects the Scenarios in the project for use in the Simulation. There are two
 * main properties in this object: acceptanceTestScenario and debugScenario. These two are
 * used in the Simulation class to setup the actual tests to run. If you wish to add
 * scenarios to either run, add them here. 
 */
object Scenarios {

  /**
   * These are the scenarios run in 'normal' mode.
   */
  val acceptanceTestScenario = scenario("Acceptance test").feed(SomeDataFeeder.someData)
    .exitBlockOnFail(
      randomSwitch(

        95.0 -> exec(UseCase2.steps),
        5.0 -> exec(UseCase1.steps)

      )
    )

  /**
   * These are the scenarios run in 'debug' mode.
   */
  val debugScenario = scenario("debug").feed(SomeDataFeeder.someData)
    .exitBlockOnFail(
      exec(UseCase2.steps)
      .exec(UseCase1.steps)
    )


}