name := "scala-challenge"

version := "0.1"

scalaVersion := "2.13.6"

idePackagePrefix := Some("me.lycheng")

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.12" % Test,
  "org.scalatest" %% "scalatest" % "3.0.8" % "test"
)