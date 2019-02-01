package com.jomilanez.loadtest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class BasicSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("http://localhost:8080")
    .acceptHeader("application/json")
    .userAgentHeader("Gatling")

  val scn = scenario("API GATEWAY")
    .exec(http("get_content")
      .get("/api/v1/content"))
    .pause(7)
    .exec(http("get_user")
      .get("/api/v1/user"))

  setUp(scn.inject(rampUsersPerSec(10) to 50 during(30 seconds)).protocols(httpProtocol))

}
