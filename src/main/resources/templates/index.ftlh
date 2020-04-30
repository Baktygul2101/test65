<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Lesson 65. JPA & ORM</title>
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
        <script src="/js/script.js"></script>
    </body>
</html>
