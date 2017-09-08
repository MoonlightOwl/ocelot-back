import org.scalatra.sbt._
import ScalateKeys._

val ScalatraVersion = "2.5.1"

ScalatraPlugin.scalatraSettings
scalateSettings

organization := "totoro"
name := "ocelot"
version := "0.1.2"

scalaVersion := "2.12.3"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalate" % ScalatraVersion,
  "org.scalatra" %% "scalatra-specs2" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.5" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.15.v20160210" % "compile;container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
)

scalateTemplateConfig in Compile := {
  val base = (sourceDirectory in Compile).value
  Seq(
    TemplateConfig(
      base / "webapp" / "WEB-INF" / "templates",
      Seq.empty,  /* default imports should be added here */
      Seq(
        Binding("context", "_root_.org.scalatra.scalate.ScalatraRenderContext", importMembers = true, isImplicit = true)
      ),  /* add extra bindings here */
      Some("templates")
    )
  )
}

enablePlugins(JettyPlugin)
enablePlugins(JavaAppPackaging)

mappings in Universal ++= {
  val base = baseDirectory.value
  val confDir = base / "src" / "main" / "webapp" / "assets"
  for {
    (file, relativePath) <-  (confDir.*** --- confDir) x relativeTo(confDir)
  } yield file -> s"assets/$relativePath"
}
