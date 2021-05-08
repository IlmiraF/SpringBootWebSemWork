<#import "parts/common.ftlh" as c>
<#import "parts/login1.ftlh" as l>

<html>
<head>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title>Login Page</title>
</head>
<body background="../static/e83bf6eb86095ca118193f9665d120ae_original.jpg" style="background-position: center center; background-repeat: no-repeat; background-size: cover;">
<@c.page>
<#--    <center style="font-weight: bold; margin-top: 100px; position: absolute">Login Page</center>-->
    <div style="-webkit-filter: blur(90px); background: burlywood; padding : 200px ; position: center; margin-left: 400px; margin-right: 400px; margin-top: 100px"></div>
    <#if Session?? && Session.SPRING_SECURITY_LAST_EXCEPTION??>
        <div>
            ${Session.SPRING_SECURITY_LAST_EXCEPTION.message}
        </div>
    </#if>
    <@l.login "/registration" true/>
</@c.page>
</body>
</html>