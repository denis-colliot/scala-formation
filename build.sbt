val scalaTest = "org.scalatest" %% "scalatest" % "2.2.6"
val scalaSpec = "org.specs2" %% "specs2" % "3.7"
val akkaActor = "com.typesafe.akka" %% "akka-actor" % "2.4.6"

lazy val root = (project in file(".")).
  settings(
    name := "formationScala",
    version := "0.0.1",
    scalaVersion := "2.11.7",
    libraryDependencies += scalaTest,
    libraryDependencies += scalaSpec,
    libraryDependencies += akkaActor
  )