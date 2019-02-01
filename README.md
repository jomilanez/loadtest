# loadtest


Maven project using the gatling-maven-plugin for load testing audio-api-gateway.

To test it out, simply execute the following command:

    $mvn gatling:test -Dgatling.simulationClass=com.jomilanez.loadtest.BasicSimulation

or simply:

    $mvn gatling:test
