<#import "parts/common.ftlh" as c>
<#import "parts/login1.ftlh" as l>

<@c.page>
    <#if Session.SPRING_SECURITY_CONTEXT??>
        <div>
            <@l.logout />
        </div>
    <#else>
        <a href="/login">Login</a>
    </#if>
    <div>Список сообщений</div>
</@c.page>