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
    <form class="form-inline my-2 my-lg-0" method="get" action="/article">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="filter" value="${filter!}">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
</@c.page>
</body>
</html>