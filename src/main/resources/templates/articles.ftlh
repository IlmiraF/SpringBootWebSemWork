<#import "parts/common.ftlh" as c>

<html>
<head>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title>Articles</title>
</head>
<body background="../static/dayli_kazan2-3b385340.jpeg" style="background-position: center center; background-repeat: no-repeat; background-size: cover;">
<@c.page>
    <#list articles as message>
        <div>
            <a href="/article/${message.id}">${message.title}</a>
            <span>${message.content}</span>
            <i>${message.writer.username}</i>
        </div>
    <#else>
        No message
    </#list>
</@c.page>
</body>
</html>