<%--
  Created by IntelliJ IDEA.
  User: Jarvis
  Date: 2019/3/28
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js" ></script>
<style type="text/css">
    a{
        width:180px;
        height: 50px;
        margin: 50px 60px;
    }

</style>
<body bgcolor="#7777CC">
    <a href="/exam_queryAllExams.action" target="main" class="btn btn-primary" >
        <h4>个人信息</h4>
    </a>
    <a href="teacher_findAll.action" target="main" class="btn btn-primary" >
        <h4>教练信息查看</h4>
    </a>
    <a href="student_study.action" target="main" class="btn btn-primary" >
        <h4>在线学习</h4>
    </a>
    <a href="http://www.baidu.com" target="main" class="btn btn-primary" >
        <h4>关于驾校</h4>
    </a>
    </body>
</html>
