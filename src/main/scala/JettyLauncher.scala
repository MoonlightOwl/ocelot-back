import org.eclipse.jetty.server.{Server, ServerConnector}
import org.eclipse.jetty.webapp.WebAppContext
import org.scalatra.servlet.ScalatraListener
import totoro.ocelot.Config

object JettyLauncher {
  def main(args: Array[String]) {
    val server = new Server()
    val http = new ServerConnector(server)
    http.setHost(Config.HostName)
    http.setPort(Config.Port)
    server.addConnector(http)

    val context = new WebAppContext()
    context.setContextPath("/")
    context.setResourceBase(".")
    context.setEventListeners(Array(new ScalatraListener))
    server.setHandler(context)

    server.start()
    server.join()
  }
}
