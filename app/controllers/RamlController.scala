package controllers

import com.google.inject.Inject
import play.api.mvc.{Action, Controller}

/**
  * Created by larryf on 5/4/2016.
  */
class RamlController @Inject() (webJarAssets: WebJarAssets)extends Controller {

  def load = Action {
    Ok(views.html.raml(webJarAssets))
  }

}
