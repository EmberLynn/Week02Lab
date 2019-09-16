<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 12, 2019, 4:55:06 PM
    Author     : 738634
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1> 
        <form action="calc" method="POST">
        <label>First</label>
        <input type="text" name="first" value="${num1}" /><br>
        <label>Second</label>
        <input type="text" name="second" value="${num2}" /><br>
        <input type="submit" value="+" name="add" />
        <input type="submit" value="-" name="sub" />
        <input type="submit" value="*" name="multi" />
        <input type="submit" value="%" name="mod" /><br>
        <p>${calcResults}
    </body>
</html>
