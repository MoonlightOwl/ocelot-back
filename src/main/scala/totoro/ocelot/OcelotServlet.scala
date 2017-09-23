package totoro.ocelot

import org.scalatra.scalate.ScalateSupport

class OcelotServlet extends OcelotStack with ScalateSupport {
  get("/") {
    <html>
      <head>
        <meta charset="UTF-8"></meta>
        <title>ocelot.online</title>
        <link rel="stylesheet" href="css/styles.css"></link>
        <link href="https://fonts.googleapis.com/css?family=Ubuntu+Mono" rel="stylesheet"></link>
      </head>
      <body>
        <div class="splash">
          <div class="titlebar">
            <p class="title">[ocelot.online]</p>
            <img class="logo" src="images/logo.png"></img>
            <div class="profile-panel">
              <p class="button">[login]</p>
              <p class="button">[register]</p>
            </div>
          </div>
          <div class="terminal">
            <pre>                                                                                </pre>
            <pre>  Come meow with us!                                                            </pre>
            <pre>  > _                                                                           </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
            <pre>                                                                                </pre>
          </div>
        </div>
        <!-- Include JavaScript dependencies -->
        <script type="text/javascript" src="/js/ocelot-face-jsdeps.js"></script>
        <!-- Include Scala.js compiled code -->
        <script type="text/javascript" src="/js/ocelot-face-fastopt.js"></script>
      </body>
    </html>
  }
}
