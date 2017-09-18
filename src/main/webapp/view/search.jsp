<%--@elvariable id="name" type="java"--%>
<%@ page contentType="text/html" %>
<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Search Page</title>
</head>
<body>
    <h1>What would you like to cook?</h1>
    <form method="POST" action="">
        <input type="text" name="search" placeholder="Tell me what you want">
        <input type="submit" value="Confirm">
    </form>
    <p>
        ${searchResults}
    </p>
</body>
</html>