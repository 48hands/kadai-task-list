package controllers

import javax.inject._

import models.Task
import play.api.i18n._
import play.api.mvc._
import scalikejdbc.AutoSession

@Singleton
class DeleteTaskController @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {

  def delete(taskId: Long): Action[AnyContent] = Action {
    implicit val session = AutoSession
    val result           = Task.deleteById(taskId)
    if (result > 0) Redirect(routes.GetTasksController.index())
    else InternalServerError(Messages("DeleteTaskError"))
  }

}
