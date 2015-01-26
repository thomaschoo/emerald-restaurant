package controllers

import play.api.mvc.{Action, Controller}

import helpers.Utilities.isAjax
import models.MenuSupport

object Dine extends Controller with MenuSupport {
  def index = Action { implicit request =>
    val content = views.html.dine()
    if (isAjax) Ok(content)
    else Ok(views.html.index(Some(content)))
  }
}
