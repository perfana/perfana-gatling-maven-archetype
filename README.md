# perfana-gatling-maven-archetype

Maven archetype to generate template Gatling script that can be used together with the perfana-gatling-maven plugin and the Perfana performance test dashboard.

## Install
To install the archetype, clone this repo and run:

```mvn clean install```

## Generate template script
To generate a template script run this command from a directory where you want to store the script:

```
mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate -B \
-DarchetypeGroupId=io.perfana \
-DarchetypeArtifactId=perfana-gatling-maven-archetype \
-DarchetypeVersion=0.0.8 \
-DgroupId=io.perfana \
-DartifactId=gatling-example-application \
-Dversion=1.0-SNAPSHOT \
-Dpackage=io.perfana.example.application \
-DsimulationClassName=ExampleApplication \
-Dapplication=ExampleApplication \
-DapplicationRelease=1.0
```

on Windows:  

```
mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate -B ^
-DarchetypeGroupId=io.perfana ^
-DarchetypeArtifactId=perfana-gatling-maven-archetype ^
-DarchetypeVersion=0.0.8 ^
-DgroupId=io.perfana ^
-DartifactId=gatling-example-application ^
-Dversion=1.0-SNAPSHOT ^
-Dpackage=io.perfana.example.application ^
-DsimulationClassName=ExampleApplication ^
-Dapplication=ExampleApplication ^
-DapplicationRelease=1.0
```

simulationClassName should be in PascalCase (first character Capitalized) and simulation class name is alphanumeric characters only and no special characters like hyphens and underscores.
