<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>onlineshop</title>
    </head>
    <body>
        <h1>Содержимое страницы</h1>

        <ul>
        <#list categories as cat>
            <li>
                <p>${cat.id} - ${cat.name} - ${cat.icon}</p>
            </li>
        </#list>
        </ul>

    </body>
    <script src="/static/js/script.js"></script>
</html>
