<#import "parts/common.ftlh" as c>

<html>
<head>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title>New Petition</title>
</head>
<body background="../static/dayli_kazan2-3b385340.jpeg" style="background-position: center center; background-repeat: no-repeat; background-size: cover;">
<@c.page>
    <div style="-webkit-filter: blur(90px); background: burlywood; padding : 200px ; position: center; margin-left: 400px; margin-right: 400px; margin-top: 100px"></div>
    <div style="position: relative; margin-left: 400px; margin-right: 400px; margin-top: -350px; padding-left: 50px; padding-right: 50px">
        <form action="/newPetition" method="post">
            <div class="form-group">
                <label for="exampleFormControlTextarea1">Example textarea</label>
                <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="title"></textarea>
            </div>
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <button type="submit" class="btn btn-primary" style="margin-left: 150px">Submit</button>
        </form>
    </div>
</@c.page>
</body>
</html>