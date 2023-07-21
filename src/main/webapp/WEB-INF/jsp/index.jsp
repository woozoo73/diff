<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@environment.getProperty('site.thema')" var="thema" />
<html>
<head>
    <link rel="stylesheet" href="/css/${thema}.css">
</head>
<body>
    <div>Index</div>
</body>
</html>
