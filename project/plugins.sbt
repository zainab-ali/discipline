val sbtTlVersion = "0.8.6-54-5014100-20260909T123545Z-SNAPSHOT"

addSbtPlugin("org.typelevel" % "sbt-typelevel" % sbtTlVersion)
addSbtPlugin("org.typelevel" % "sbt-typelevel-mergify" % sbtTlVersion)
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.22.0")
addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.5.11")
