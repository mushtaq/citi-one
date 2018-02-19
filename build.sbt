import Dependencies._

lazy val commonSettings = Seq(
  organization := "com.example",
  scalaVersion := "2.12.4",
  version      := "0.1.0-SNAPSHOT",
)

lazy val agg1 = project
  .dependsOn(module1, module2)
  .enablePlugins(JavaAppPackaging)
  .settings(
    libraryDependencies += scalaTest % Test
  )

lazy val module1 = project
  .settings(
    libraryDependencies += scalaTest
  )

lazy val module2 = project
