package controllers

import javax.inject._
import models.Task
import play.api.mvc._
import play.api.i18n._

@Singleton
class GetTasksController @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {

  def index: Action[AnyContent] = Action { implicit request =>
    val result = Task.findAll()
    Ok(views.html.index(result))
  }
}
