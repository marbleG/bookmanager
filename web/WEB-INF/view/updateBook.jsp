<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: marble
  Date: 2020/4/6
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <!-- 引入 Bootstrap -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-4 column">
            <form action="${pageContext.request.contextPath}/book/update" method="post">
                <div class="form-group">
                    <input type="hidden" class="form-control" name="bookID" value="${book.bookID}">
                    <label for="bookName">书籍名称</label>
                    <input type="text" class="form-control" name="bookName" id="bookName" value="${book.bookName}"
                           required>
                    <label for="bookCounts">书籍数量</label>
                    <input type="text" class="form-control" name="bookCounts" id="bookCounts" value="${book.bookCounts}"
                           required>
                    <label for="detail">书籍描述</label>
                    <input type="text" class="form-control" name="detail" id="detail" value="${book.detail}" required>
                </div>
                <button type="submit" class="btn btn-default">修改书籍</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
