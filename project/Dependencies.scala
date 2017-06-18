import sbt._

object Dependencies {
  def dependencies() = {
    Seq(
      // "com.nativelibs4java" %% "scalaxy-streams" % "0.3.4" % "provided",
      "org.spire-math" %% "jawn-ast" % "0.10.4",
      "com.propensive" %% "rapture-json" % "2.0.0-M8",
      "com.propensive" %% "rapture-json-jawn" % "2.0.0-M8",
      "org.seleniumhq.selenium" % "selenium-java" % "2.53.1" intransitive(),
      "org.seleniumhq.selenium" % "selenium-firefox-driver" % "2.53.1",
      "me.tongfei" % "progressbar" % "0.5.5",
      "org.scalatest" %% "scalatest" % "3.0.3",
      "org.scala-lang.modules" %% "scala-xml" % "1.0.6",
      "com.github.pathikrit" %% "better-files" % "2.17.1",

      // Added for imgur upload, could be removed later
      "org.apache.httpcomponents" % "httpmime" % "4.5.3"
    )
  }
}

