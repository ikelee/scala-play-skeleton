package controllers

import javax.inject._

import play.api.mvc._
import services.FacebookEventService

import scala.concurrent.ExecutionContext.Implicits.global

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents, eventService: FacebookEventService) extends AbstractController(cc) {

  def status = Action {
    Ok("Hi")
  }

}
