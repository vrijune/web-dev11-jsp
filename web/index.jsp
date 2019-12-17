<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Landing page for Lab 11</title>
        <style type="text/css">
            body {
                width: 600px;
                margin: 6em auto;
                color: #444;
                text-align: justify;
                font-family: sans-serif;
                font-size: 14pt;
                line-height: 150%;
            }

            h1, h2 {
                text-decoration: lightgrey underline;
                color: #222;
            }

            h2 {
                margin-top: 2em;
            }

            code {
                background-color: rgba(255, 167, 182, 0.41);
                color: darkred;
                font-family: monospace;
                border: 1px solid darkred;
                padding: 1px 5px;
            }

            a:visited, a:active, a {
                color: dodgerblue;
                text-decoration: none;
            }

            a:hover {
                text-decoration: underline;
            }
        </style>
    </head>
    <body>
        <h1>Web Lab 11 landing page</h1>
        <p>By default when you run a Java Servlet application, IntelliJ will open your chosen browser to the 'root' of
            the web application. If you do not have a servlet with a urlPattern of <code>/</code> then you will get a
            404 error as the Tomcat server does not know what to display for you. To avoid this error you can configure
            what file to display by default by specifying file names in the (optional) <code>&lt;welcome-file-list&gt;</code>
            tag in your <code>WEB-INF/web.xml</code> file. If this is not specified, Tomcat will by default try to serve
            you a file named <code>index.html</code> or <code>index.jsp</code>.
        </p>

        <h2>Exercise file links</h2>

        <jsp:include page="/WEB-INF/nav/nav.jsp" />
    </body>
</html>
