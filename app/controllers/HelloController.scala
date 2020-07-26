package controllers

import javax.inject.Inject
import javax.inject.Singleton
import play.api.mvc.AbstractController
import play.api.mvc.Action
import play.api.mvc.ControllerComponents
import play.api.mvc.Request
import play.api.mvc.AnyContent

@Singleton
class HelloController @Inject() (cc: ControllerComponents)
    extends AbstractController(cc) {
  def plus(a: Option[Boolean], b: Option[Boolean]) =
    Action { implicit request: Request[AnyContent] =>
      Ok {
        a.flatMap(a1 => b.map(b1 => "ok"))
          .getOrElse("""Please give arguments of a and b.""")
      }
    }
}
