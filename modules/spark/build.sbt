import Dependencies.Version._

crossScalaVersions := Seq(scala212, scala213)

libraryDependencies ++= Seq("org.apache.spark" %% "spark-sql" % "3.4.0" % "provided")
mdocLibraryDependencies ++= Seq("org.apache.spark" %% "spark-sql" % "3.4.0")
