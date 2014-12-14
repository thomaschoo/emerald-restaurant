package controllers

import helpers.Utilities
import models.MenuSupport
import play.api.mvc._

object Takeout extends Controller with MenuSupport {

  def index = Action {
    implicit request =>
      val content = views.html.takeout()
      if (Utilities.isAjax) Ok(content)
      else Ok(views.html.index(Some(content)))
  }
}