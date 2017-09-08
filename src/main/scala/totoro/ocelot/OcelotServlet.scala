package totoro.ocelot

import org.scalatra.scalate.ScalateSupport

class OcelotServlet extends OcelotStack with ScalateSupport {
  get("/") {
    <html>
    <head>
      <meta charset="UTF-8"></meta>
      <link rel="stylesheet" href="/assets/css/styles.css"></link>
      <link href="https://fonts.googleapis.com/css?family=Ubuntu+Mono" rel="stylesheet"></link>
      <title>Ocelot.Online</title>
    </head>
    <body>
      <div class="splash">
        <img src="/assets/images/logo.png"></img>
        <p>{ "{ Ocelot.Online }" }</p>
      </div>
      <!-- Include JavaScript dependencies -->
      <script type="text/javascript" src="/assets/js/ocelot-face-jsdeps.js"></script>
      <!-- Include Scala.js compiled code -->
      <script type="text/javascript" src="/assets/js/ocelot-face-fastopt.js"></script>
    </body>
    </html>
  }
}
