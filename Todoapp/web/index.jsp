<%--
  Created by IntelliJ IDEA.
  User: Gosienka
  Date: 21.07.2019
  Time: 09:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>TonariNoTotoro</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/css/styles.css" type="text/css">
  </head>
  <body>
  <% if (session.getAttribute("user") != null){
    response.sendRedirect("todos.jsp");
  }%>
  <div class="container login-container">
    <div class="row">
      <div class="col-md-6 login-form-1">
  <form action="login" method="post">
    <div class="form-group">
      <input name="login" type="text" class="form-control" placeholder="Login *" value="" />
    </div>
    <div class="form-group">
      <input name="password" type="password" class="form-control" placeholder="Your Password *" value="" />
    </div>
    <div class="form-group">
      <input type="submit" class="btnSubmit" value="Login" />
    </div>
    <div class="form-group">
      <a href="#" class="ForgetPwd">Forget Password?</a>
    </div>
  </form>
      </div>
    </div>
  </div>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>
