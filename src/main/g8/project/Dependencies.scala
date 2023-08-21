import sbt._

object Dependencies {

   object Versions {

    // functional programming
    val cats          = "2.10.0"
    val catsEffect    = "3.5.1"
    val catsMeowMtl   = "0.5.0"
    val catsRetry     = "3.1.0"
    val circe         = "0.14.5"
    val ciris         = "3.2.0"
    val fs2           = "3.8.0"

    // http
    val http4s        = "0.23.3"
    val http4sJwtAuth = "0.0.4"
    val sttp          = "3.3.15"

    // config
    val pureconfig    = "0.16.0"

    // logging
    val log4cats      = "2.1.1"

    // Mis
    val newtype       = "0.4.4"
    val refined       = "0.9.27"
    val redis4cats    = "0.11.0"
    val squants       = "1.8.3"
    val monocle       = "3.0.0"
    val tapir         = "0.18.3"

    // db
    val skunk         = "0.2.2"
    val quill         = "3.9.0"
    val doobie        = "1.0.0"


    // generic programming
    val shapeless      = "2.3.7"

    // compiler plugins
    val betterMonadicFor = "0.3.1"
    val kindProjector    = "0.13.2"
    val logback          = "1.2.6"

    //test
    val scalaCheck    = "1.15.4"
    val scalaTest     = "3.2.10"
    val munit         = "0.7.29"
  }

  object Libraries {
    def circe(artifact: String): ModuleID  = "io.circe"   %% artifact % Versions.circe
    def ciris(artifact: String): ModuleID  = "is.cir"     %% artifact % Versions.ciris
    def http4s(artifact: String): ModuleID = "org.http4s" %% artifact % Versions.http4s
    def meow(artifact: String): ModuleID   = "com.olegpy" %% artifact % Versions.catsMeowMtl

    val cats        = "org.typelevel"    %% "cats-core"     % Versions.cats
    val catsEffect  = "org.typelevel"    %% "cats-effect"   % Versions.catsEffect
    val catsRetry   = "com.github.cb372" %% "cats-retry"    % Versions.catsRetry
    val squants     = "org.typelevel"    %% "squants"       % Versions.squants
    val fs2         = "co.fs2"           %% "fs2-core"      % Versions.fs2

    val catsMeowMtl = meow("meow-mtl-core")
    val catsMeowMtlEffects = meow("meow-mtl-effects")
    val catsMeowMtlMonix = meow("meow-mtl-monix")

    val circeCore    = circe("circe-core")
    val circeGeneric = circe("circe-generic")
    val circeParser  = circe("circe-parser")
    val circeRefined = circe("circe-refined")

    // configuration
    val cirisCore    = ciris("ciris")

    val cirisEnum    = ciris("ciris-enumeratum")
    val cirisRefined = ciris("ciris-refined")

    val http4sDsl    = http4s("http4s-dsl")
    val http4sServer = http4s("http4s-blaze-server")
    val http4sClient = http4s("http4s-blaze-client")
    val http4sCirce  = http4s("http4s-circe")

    val http4sJwtAuth = "dev.profunktor" %% "http4s-jwt-auth" % Versions.http4sJwtAuth

    val refinedCore = "eu.timepit" %% "refined"      % Versions.refined
    val refinedCats = "eu.timepit" %% "refined-cats" % Versions.refined

    val log4cats = "io.chrisdavenport" %% "log4cats-slf4j" % Versions.log4cats
    val newtype  = "io.estatico"       %% "newtype"        % Versions.newtype

    val redis4catsEffects  = "dev.profunktor" %% "redis4cats-effects"  % Versions.redis4cats
    val redis4catsLog4cats = "dev.profunktor" %% "redis4cats-log4cats" % Versions.redis4cats

    val doobie =   "org.tpolecat" %% "doobie-core" % Versions.doobie
    val doobieH2 = "org.tpolecat" %% "doobie-h2"        % Versions.doobie          // H2 driver 1.4.200 + type mappings.
    val doobieHikari = "org.tpolecat" %% "doobie-hikari"    % Versions.doobie          // HikariCP transactor.
    val doobiePostgres = "org.tpolecat" %% "doobie-postgres"  % Versions.doobie          // Postgres driver 42.2.9 + type mappings.
    val doobieQuill = "org.tpolecat" %% "doobie-quill"     % Versions.doobie          // Support for Quill 3.4.10
    val doobieSpec2 = "org.tpolecat" %% "doobie-specs2"    % Versions.doobie % "test" // Specs2 support for typechecking statements.
    val doobieScalaTest = "org.tpolecat" %% "doobie-scalatest" % Versions.doobie % "test" 

    val quill = "io.getquill" %% "quill-core" % Versions.quill

    val skunkCore  = "org.tpolecat" %% "skunk-core"  % Versions.skunk
    val skunkCirce = "org.tpolecat" %% "skunk-circe" % Versions.skunk

    val monocleCore = "com.github.julien-truffaut" %% "monocle-core" % Versions.monocle
    val monocleMacro = "com.github.julien-truffaut" %% "monocle-macro" % Versions.monocle

    val tapir = "com.softwaremill.sttp.tapir" %% "tapir-core" % Versions.tapir

    // shapeless
    val shapeless = "com.chuusai" %% "shapeless" % Versions.shapless

    // Compiler plugins
    val betterMonadicFor = "com.olegpy"    %% "better-monadic-for" % Versions.betterMonadicFor
    val kindProjector    = "org.typelevel" % "kind-projector"      % Versions.kindProjector

    // Runtime
    val logback = "ch.qos.logback" % "logback-classic" % Versions.logback

    // Test
    val munit         = "org.scalameta" %% "munit" % Versions.munit % Test

    val sttp = "com.softwaremill.sttp.client3" %% "core" % Versions.sttp
    val sttpAsync = "com.softwaremill.sttp.client3" %% "async-http-client-backend-fs2-ce2" % Versions.sttp

    val pureConfig = "com.github.pureconfig" %% "pureconfig" % Versions.pureconfig
  }

  object Resolvers {

    val snapshots = Resolver.sonatypeRepo("snapshots")
    val release = Resolver.sonatypeRepo("release")

    val moreResolvers = Seq(
        "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
        "Secured Central Repository" at "https://repo1.maven.org/maven2",
    )
  }
}
