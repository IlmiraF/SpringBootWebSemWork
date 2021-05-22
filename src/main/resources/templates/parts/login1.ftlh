<#import "common.ftlh" as c>

<@c.page>
<#macro login path isRegisterForm>
    <div style="position: relative; margin-left: 400px; margin-right: 400px; margin-top: -350px; padding-left: 50px; padding-right: 50px">
        <form action="${path}" method="post">
                <div class="form-group" style="margin-bottom: 30px">
                    <label for="exampleInputEmail1" style="margin-left: 150px; color: #FFFFFF; font-weight: bold">Username</label>
                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" name="username">
                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                </div>
                <div class="form-group" style="margin-bottom: 30px">
                    <label for="exampleInputPassword1" style="margin-left: 150px; color: #FFFFFF; font-weight: bold">Password</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="password">
                </div>
                <#if isRegisterForm><div class="form-group" style="margin-bottom: 30px">
                    <label for="exampleInputEmail1" style="margin-left: 150px; color: #FFFFFF; font-weight: bold">Email</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" name="email">
                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                </div></#if>
                <#if !isRegisterForm>
                <div class="form-check" style="margin-bottom: 20px">
                    <input type="checkbox" class="form-check-input" id="exampleCheck1">
                    <label class="form-check-label" for="exampleCheck1" style="color: #FFFFFF; font-weight: bold">Check me out</label>
                </div>
                </#if>
                <input type="hidden" name="_csrf" value="${_csrf.token}" />
                <#if !isRegisterForm><a href="/registration">Add new user</a></#if>
                <button type="submit" class="btn btn-primary" style="margin-left: 150px">Submit</button>
        </form>
    </div>
</#macro>

<#--<#macro login path isRegisterForm>-->
<#--    <form action="${path}" method="post">-->
<#--        <div><label> User Name : <input type="text" name="username"/> </label></div>-->
<#--        <div><label> Password: <input type="password" name="password"/> </label></div>-->
<#--        <#if !isRegisterForm><div><td>Remember Me:</td><td><input type="checkbox" name="remember-me" /></td></div></#if>-->
<#--        <#if isRegisterForm><div><label> Email: <input type="email" name="email"/> </label></div></#if>-->
<#--        <input type="hidden" name="_csrf" value="${_csrf.token}" />-->
<#--        <#if !isRegisterForm><a href="/registration">Add new user</a></#if>-->
<#--        <div><input type="submit" value="Sign In"/></div>-->
<#--    </form>-->
<#--</#macro>-->

<#macro logout>
    <form action="/logout" method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <input type="submit" value="Sign Out"/>
    </form>
</#macro>
</@c.page>