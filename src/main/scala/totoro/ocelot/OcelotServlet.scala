package totoro.ocelot

import org.scalatra.scalate.ScalateSupport

class OcelotServlet extends OcelotStack with ScalateSupport {
  get("/") {
    <html>
      <head>
        <meta charset="UTF-8"></meta>
        <title>ocelot.online</title>
        <link rel="stylesheet" href="assets/css/styles.css"></link>
        <link href="https://fonts.googleapis.com/css?family=Ubuntu+Mono" rel="stylesheet"></link>
      </head>
      <body>
        <div class="splash">
          <div class="titlebar">
            <p class="title">[ocelot.online]</p>
            <img class="logo" src="assets/images/logo.png"></img>
            <div class="profile-panel">
              <p class="button">[login]</p>
              <p class="button">[register]</p>
            </div>
          </div>
          <div class="terminal">
            <pre class="l1">                                                                                </pre>
            <pre class="l2">                                                                                </pre>
            <pre class="l3">                                                                                </pre>
            <pre class="l4">                                                                                </pre>
            <pre class="l5">                                                                                </pre>
            <pre class="l6">                                                                                </pre>
            <pre class="l7">                                                                                </pre>
            <pre class="l8">                                                                                </pre>
            <pre class="l9">                                                                                </pre>
            <pre class="l10">                                                                                </pre>
            <pre class="l11">                                                                                </pre>
            <pre class="l12">                                                                                </pre>
            <pre class="l13">                                                                                </pre>
            <pre class="l14">                                                                                </pre>
            <pre class="l15">                                                                                </pre>
            <pre class="l16">                                                                                </pre>
            <pre class="l17">                                                                                </pre>
            <pre class="l18">                                                                                </pre>
            <pre class="l19">                                                                                </pre>
            <pre class="l20">                                                                                </pre>
            <pre class="l21">                                                                                </pre>
            <pre class="l22">                                                                                </pre>
            <pre class="l23">                                                                                </pre>
            <pre class="l24">                                                                                </pre>
            <pre class="l25">                                                                                </pre>
          </div>
        </div>
        <!-- Include JavaScript dependencies -->
        <script type="text/javascript" src="assets/js/ocelot-face-jsdeps.js"></script>
        <!-- Include Scala.js compiled code -->
        <script type="text/javascript" src="assets/js/ocelot-face-fastopt.js"></script>
      </body>
    </html>
  }
}
