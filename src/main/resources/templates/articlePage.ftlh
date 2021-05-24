<#import "parts/common.ftlh" as c>

<html>
<head>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title>Articles</title>
</head>
<body background="../static/dayli_kazan2-3b385340.jpeg" style="background-position: center center; background-repeat: no-repeat; background-size: cover;">
<@c.page>
    <div>
            <small>${message.title}</small>
            <span>${message.content}</span>
            <i>${message.writer.username}</i>
    </div>
    <#list comments as comment>
        <div>
            <span>${comment.creator.username}</span>
            <i>${comment.content}</i>
        </div>
    <#else>
        No message
    </#list>
    <#if user.getUser().isActive()>
    <form action="/article/${message.id}" method="post">
        <div class="form-group">
            <label for="exampleFormControlTextarea1">Example textarea</label>
            <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="content"></textarea>
        </div>
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button type="submit" class="btn btn-primary" style="margin-left: 150px">Submit</button>
    </form>
    </#if>
</@c.page>
</body>
</html>