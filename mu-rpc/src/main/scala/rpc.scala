package metrifier
package rpc

import cats.effect.{ConcurrentEffect, ContextShift, IO}

trait PersonServiceRuntime {

  val EC: scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global

  implicit val CS: ContextShift[IO] = IO.contextShift(EC)
  implicit val CE: ConcurrentEffect[IO] = IO.ioConcurrentEffect

}
