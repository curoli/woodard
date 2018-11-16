package woodard.http

import cats.effect.IO
import woodard.model.{VersionResponse, WorkflowSubmitResponse}
import io.circe.generic.auto._
import org.http4s._
import org.http4s.circe.jsonOf

object JsonDecoding {

  implicit val versionResponseDecoder: EntityDecoder[IO, VersionResponse] = jsonOf[IO, VersionResponse]
  implicit val workflowSubmitResponseDecoder: EntityDecoder[IO, WorkflowSubmitResponse] =
    jsonOf[IO, WorkflowSubmitResponse]

}
