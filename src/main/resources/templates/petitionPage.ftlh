<#import "parts/common.ftlh" as c>

<html>
<head>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title>Petitions</title>
</head>
<body background="../static/dayli_kazan2-3b385340.jpeg" style="background-position: center center; background-repeat: no-repeat; background-size: cover;">
<@c.page>
        <div>
            <small>${petition.title}</small>
            <span>${petition.date}</span>
            <span>${count}</span>
            <#list petition.writers as users>
                <div>${users.username}</div>
            </#list>
            <#if isExist == "false">
                <a href="/petition/${petition.id}/subscribe">Subscribe</a>
            </#if>
        </div>
</@c.page>
</body>
</html>