<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019/4/20
  Time: 下午3:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="student_login.action">  <div class="form-group">
        <div class="input-group">
            <div class="input-group-addon">身份证号:</div>
            <input type="text" class="form-control" name="stu_identity" id="stu_identity" placeholder="请输入身份证号">
        </div>
    </div>
    <div class="form-group">
        <div class="input-group">
            <div class="input-group-addon">首选电话:</div>
            <input type="text" class="form-control" name="stu_phone" id="stu_phone" placeholder="请输入首选电话">
        </div>
    </div>
    <div class="form-group">
        <div class="pull-right"></div>
    </div>
    <input type="submit" class="btn btn-lg btn-success btn-block" value="登陆">
</form>


</body>
</html>
