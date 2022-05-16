<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
<head>
    <title>Struts Form</title>
</head>
<body>
<h1>Struts : Form</h1>
<html:form action="/submit">
    Name: <html:text property="name"/>
    Email: <html:text property="email"/>
    <html:submit value="Submit"/>
</html:form>
</body>
</html>
