package controllers

import javax.inject._
import models.Task
import play.api.i18n._
import play.api.mvc._

@Singleton
class GetTaskController @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {

  def index(taskId: Long): Action[AnyContent] = Action { implicit request =>
    val task = Task.findById(taskId).get
    Ok(views.html.show(task))
  }

}
