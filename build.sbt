import sbtassembly.Plugin._
import sbtassembly.Plugin.AssemblyKeys._
import sun.tools.jar.resources.jar

lazy val root = (project in file(".")).enablePlugins(PlayScala)

name := "reactive-scales"

version := "1.0"

