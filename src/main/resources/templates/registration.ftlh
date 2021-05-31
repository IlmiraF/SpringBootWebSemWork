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
<div style="position: relative; margin-left: 400px; margin-right: 400px; margin-top: -350px; padding-left: 50px; padding-right: 50px">
    <form action="/registration" method="post">
        <div class="form-group" style="margin-bottom: 30px">
            <label for="exampleInputEmail1" style="margin-left: 150px; color: #FFFFFF; font-weight: bold">Username</label>
            <input name="username" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>
        <div class="form-group" style="margin-bottom: 30px">
            <label for="exampleInputPassword1" style="margin-left: 150px; color: #FFFFFF; font-weight: bold">Password</label>
            <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">

        </div>
        <div class="form-group" style="margin-bottom: 30px">
            <label for="exampleInputEmail1" style="margin-left: 150px; color: #FFFFFF; font-weight: bold">Email</label>
            <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button type="submit" class="btn btn-primary" style="margin-left: 150px">Submit</button>
    </form>
</div>
<#--    <#if Session?? && Session.SPRING_SECURITY_LAST_EXCEPTION??>-->
<#--        <div>-->
<#--            ${Session.SPRING_SECURITY_LAST_EXCEPTION.message}-->
<#--        </div>-->
<#--    </#if>-->
</@c.page>
</body>
</html>