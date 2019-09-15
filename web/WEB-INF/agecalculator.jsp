<%-- 
    Document   : agecalculator
    Created on : Sep 12, 2019, 4:14:19 PM
    Author     : 738634
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <form action="age" method="post">
        <h1>Age Calculator</h1>
        <label>Enter your age:</label>
        <input type="text" name="age" value="" /><br>
        <input type="submit" value="Age Next Birthday" name="ageButton" /><br>
        <p>${ageResults}</p>
        <a href="/calc">Arithmetic Calculator
    </body>
</html>
