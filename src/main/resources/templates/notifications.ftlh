<#import "parts/common.ftlh" as c>

<html>
<head>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title>Notifications</title>
</head>
<body background="../static/dayli_kazan2-3b385340.jpeg" style="background-position: center center; background-repeat: no-repeat; background-size: cover;">
<@c.page>
    <#list notifies as message>
        <div>
            <b>${message.title}</b>
            <span>${message.content}</span>
            <i>${message.author.username}</i>
        </div>
    <#else>
        No message
    </#list>
    <#if user.getUser().getRole().toString() == "ADMIN">
    <a href="/newNotification">New Notification</a>
    </#if>
</@c.page>
</body>
</html>