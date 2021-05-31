<#include "security.ftlh">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/notification">Notify <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/article">Articles</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/petition">Petitions</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/chatek">Chat Room</a>
            </li>
            <#if !Session.SPRING_SECURITY_CONTEXT??>
            <li class="nav-item">
                <a class="nav-link disabled" href="/login">Login</a>
            </li>
            <#else>
            <li class="nav-item">
                <a class="nav-link disabled" href="/profile">${name}</a>
            </li>
            </#if>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>