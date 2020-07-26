lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.12"

libraryDependencies += guice
