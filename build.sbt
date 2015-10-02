lazy val commonSettings = Seq(
  organization := "sbt.error",
  version := "0.1.0",
  scalaVersion := "2.11.7",
  scalacOptions := Seq(
    "-Ybackend:GenBCode"
  )
)

lazy val util = project.settings(commonSettings)

lazy val core = project.settings(commonSettings).dependsOn(util)

lazy val root = (project in file(".")).settings(commonSettings).aggregate(util, core)


