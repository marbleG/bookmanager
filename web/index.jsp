<%--
  Created by IntelliJ IDEA.
  User: marble
  Date: 2020/4/6
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <style>

        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
        }
    </style>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div>
    <h3><a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/book/allBook">进入书籍页面</a></h3>
</div>
<div class="container">
    <div class="jumbotron" class="btn-primary">
        <h1>欢迎登陆页面！</h1>
        <h2><a href="${pageContext.request.contextPath}/book/allBook" class="btn btn-primary btn-lg" role="button">进入书籍页面</a>
        </h2>
    </div>
</div>

</body>
</html>
