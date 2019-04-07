<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

    <h1 style="color:red;text-align:center">WishMessage Page</h1>
    
    sayTo:::${requestScope.WishMsg}<br>
    Date::${requestScope.sysDate}
    <br>
    <br>
    <a href="welcome.htm">home</a>