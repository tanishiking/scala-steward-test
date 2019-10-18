name := "scala-steward-test"

version := "0.1"

scalaVersion := "2.12.10"

libraryDependencies := Seq(
  "org.scalatest" %% "scalatest" % "3.0.7" % "test", // scala-steward:off
  "org.scalactic" %% "scalactic" % "3.0.7",
)
