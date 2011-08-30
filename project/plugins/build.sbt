resolvers ++= Seq(
  "sbt-idea-repo" at "http://mpeltonen.github.com/maven/",
  Resolver.url("Typesafe repository", new java.net.URL("http://typesafe.artifactoryonline.com/typesafe/ivy-releases/"))(Resolver.defaultIvyPatterns)
)

libraryDependencies += "com.github.mpeltonen" %% "sbt-idea" % "0.10.0"

libraryDependencies += "com.mojolly.scalate" %% "xsbt-scalate-generator" % "0.0.1"

libraryDependencies <+= sbtVersion(v => "com.eed3si9n" %% "sbt-appengine" % ("sbt" + v + "_0.2"))

//libraryDependencies += "org.fusesource.scalate" % "sbt-scalate-plugin" % "1.5.1"