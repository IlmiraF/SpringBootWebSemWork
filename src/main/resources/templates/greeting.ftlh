<#import "parts/common.ftlh" as c>

<html>
<head>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title>Login Page</title>
</head>
<body style="background-color: #fce5a4; background-position: center center; background-repeat: no-repeat; background-size: cover;">
<@c.page>
    <div class="row" style="margin-right: 300px; margin-top: 50px">
        <div class="col-4">
            <div class="list-group" id="list-tab" role="tablist">
                <a class="list-group-item list-group-item-action active" id="list-home-list" data-toggle="list" href="#list-home" role="tab" aria-controls="home">Мэрия</a>
                <a class="list-group-item list-group-item-action" id="list-profile-list" data-toggle="list" href="#list-profile" role="tab" aria-controls="profile">Мэр Казани</a>
                <a class="list-group-item list-group-item-action" id="list-messages-list" data-toggle="list" href="#list-messages" role="tab" aria-controls="messages">Молодежный парламент</a>
                <a class="list-group-item list-group-item-action" id="list-settings-list" data-toggle="list" href="#list-settings" role="tab" aria-controls="settings">Settings</a>
            </div>
        </div>
        <div class="col-8">
            <div class="tab-content" id="nav-tabContent">
                <div class="tab-pane fade show active" id="list-home" role="tabpanel" aria-labelledby="list-home-list" style="margin-right: 170px">Мэрия города Казани – совокупность органов местного  самоуправления муниципального образования города Казани, объединенных согласованными действиями по решению вопросов местного значения, участию в межмуниципальном и международном сотрудничестве, осуществлению отдельных государственных полномочий, переданных органам местного самоуправления федеральными законами и законами Республики Татарстан, деятельность которых организуется и координируется Мэром города Казани
                    Органы местного самоуправления муниципального образования города Казани - избираемые непосредственно населением и (или) образуемые представительным органом местного самоуправления города Казани органы, наделенные собственными полномочиями по решению вопросов местного значения.
                    Полномочия органов местного самоуправления МО г.Казани определяются Федеральным законом РФ от 6 октября 2003 года №131-ФЗ "Об общих принципах организации местного самоуправления в Российской Федерации" и Уставом города Казани.<img src="../static/DSCN3567.jpg" height="450" width="450" style="margin-left: 470px; margin-top: -470px"></div>
                <div class="tab-pane fade" id="list-profile" role="tabpanel" aria-labelledby="list-profile-list" style="margin-right: 170px">Ильсур Раисович Метшин (тат. Илсур Рәис улы Метшин, род. 24 апреля 1969, Нижнекамск, РСФСР, СССР) — мэр города Казани с 2005 года. Входит в Президентский кадровый резерв России[4].

                    Вместе с казанским сити-менеджером Маратом Загидулловым стал инициатором пилотной в постсоветской России реформы городского транспорта, которая была удостоена национальной премии «Золотая колесница».[5]

                    Инициатор масштабного проведения в Казани всемирных студенческо-молодёжных спортивных игр Универсиада-2013. Под руководством Ильсура Метшина в Казани реализуются программы по предоставлению бесплатных школьных обедов для социально незащищенных детей, созданию магазинов шаговой доступности вместо киосков, микрорайонных спортцентров, проекты «Пятилетка здоровья», «Зеленый рекорд», «100 скверов» и других.<img src="../static/i.png" height="500" width="350" style="margin-left: 540px; margin-top: -370px"></div>
                <div class="tab-pane fade" id="list-messages" role="tabpanel" aria-labelledby="list-messages-list">...</div>
                <div class="tab-pane fade" id="list-settings" role="tabpanel" aria-labelledby="list-settings-list">...</div>
            </div>
        </div>
    </div>
</@c.page>
</body>
</html>