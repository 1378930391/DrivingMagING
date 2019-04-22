<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
    <title>顶部</title>
</head>
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!--circle-chart-->
<link rel="stylesheet" href="//at.alicdn.com/t/font_w4g89r3vtodvaemi.css">

<body>
    <nav class="navbar navbar-inverse" role="navigation">
        <div class="container">
            <div class="container-fluid">
                <div class="navbar-header">
                    <h3 style="color: white; margin-top: 10px;">驾校学员管理系统</h3>
                </div>
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="#"><span class="glyphicon glyphicon-user">当前用户：<s:property value="name"></s:property></span></a>
                    </li>
                    <li>
                        <s:debug>debug</s:debug>
                        <a href="logout.action" ><span class="glyphicon glyphicon-log-in"></span> 注销</a>
                    </li>
                </ul>
            </div>


        </div>
    </nav>
</body>
</html>
