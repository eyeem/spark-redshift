addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.5")

resolvers += "Spark Package Main Repo" at "https://dl.bintray.com/spark-packages/maven"

addSbtPlugin("org.spark-packages" % "sbt-spark-package" % "0.2.2")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.0")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.0")

addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.4")

libraryDependencies += "org.apache.maven" % "maven-artifact" % "3.3.9"
