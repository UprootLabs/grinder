
name := "grinder"

version := "1.3.3"

scalaVersion := "2.12.8"

// resolvers += Resolver.sonatypeRepo("releases"),

libraryDependencies ++= Dependencies.dependencies()

scalacOptions ++= Seq("-optimise")
