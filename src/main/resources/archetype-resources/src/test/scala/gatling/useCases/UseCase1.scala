package ${package}.gatling.useCases

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

object UseCase1 {


  val steps = exec(http("Request 1")
    .get("/test-service/")
    .header("x-dynaTrace", "TID=${testRunId};PC=UseCase1;NA=Request 1")

}