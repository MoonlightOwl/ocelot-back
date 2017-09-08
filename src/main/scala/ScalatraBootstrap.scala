import totoro.ocelot._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new OcelotServlet, "/*")

    context.initParameters("org.scalatra.environment") = "production"
    context.initParameters("org.scalatra.Port") = Config.Port.toString
    context.initParameters("org.scalatra.HostName") = Config.HostName
  }
}
