name := "$name$"

organization := "$organization$"

lazy val root = project.in(file("."))
  .aggregate($name$JS, $name$JVM)

lazy val $name$ = crossProject.in(file("."))
  .settings(
    name := "$name$",
    version := "$version$",
    scalaVersion := "$scalaVersion$",
    testFrameworks += new TestFramework("utest.runner.Framework"),
    libraryDependencies ++= Seq(
        "com.lihaoyi" %%% "utest" % "0.3.0" % "test",
        "org.scalatest" %%% "scalatest" % "3.0.0-SNAP5"
    )
  ).jvmSettings(
  ).jsSettings(
  )

lazy val $name$JVM = $name$.jvm
lazy val $name$JS = $name$.js
