name := "$name$"

organization := "$organization$"

lazy val root = project.in(file("."))
  .aggregate($name$JS, $name$JVM)

lazy val $name$ = crossProject.in(file("."))
  .settings(
    name := "$name$",
    version := "$version",
    scalaVersion := "$scalaVersion$",
  ).jvmSettings(
    // Add JVM-specific settings here
  ).jsSettings(
    // Add JS-specific settings here
  )

lazy val $name$JVM = $name$.jvm
lazy val $name$JS = $name$.js
