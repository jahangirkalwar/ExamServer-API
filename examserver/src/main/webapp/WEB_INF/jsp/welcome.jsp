<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Create an account</title>
    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

    <h1>Login page</h1>

    <p>
        <c:if test="${error == true}">
            <b class="error">Invalid login or password.</b>
        </c:if>
    </p>
  <div class="container">

             <form  action="<c:url value='/generate-token'/>" method = "POST" >
                Username: <input type = "text" name = "username" id="username">
                 <br />
                Password: <input type = "password" name = "password" id="password" />
                 <br>
                 <input type = "submit"  value="Login"/>
              </form>

  </div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>