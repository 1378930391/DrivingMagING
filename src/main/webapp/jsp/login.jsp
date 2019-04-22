<%--
  Created by IntelliJ IDEA.
  User: Jarvis
  Date: 2019/3/28
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--<link href="${pageContext.request.contextPath}/css/Style.css" rel="stylesheet" type="text/css">--%>

<head>
    <meta charset="utf-8">
    <%--<meta http-equiv="X-UA-Compatible" content="IE=11;IE=9; IE=8; IE=7; IE=EDGE">--%>

    <title>驾校登录</title>

    <!--http-equiv顾名思义，相当于http的文件头作用，它可以向浏览器传回一些有用的信息-->
    <%--<meta http-equiv="pragma" content="no-cache">--%>
    <%--<!--提供有关页面的元信息-->--%>
    <%--<meta http-equiv="cache-control" content="no-cache">--%>
    <%--<meta http-equiv="expires" content="0">--%>
    <%--<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">--%>
    <%--<meta http-equiv="description" content="This is my page">--%>
    <!--
my<link rel="stylesheet" type="text/css" href="styles.css">
-->
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="${pageContext.request.contextPath}/js/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
</head>

<body>
<div class="container">
    <div class="row"  id="login-box" style="width:480px;margin:10% auto 0 auto;background: #000;opacity: 0.8;padding:10px 60px;border-radius: 6px;color:#fff;">
        <form action="student_login.action" id="info">
            <script>
                function sud() {
                    var IDcard = document.getElementById("stu_identity").value;
                    var phone = document.getElementById("stu_phone").value;
                    if(IDcard == "") {
                        alert("请输入身份证号！");
                    } else if(phone == "") {
                        alert("请输入首选电话号！");

                    } else {
                        document.getElementById("info").submit();
                    }
                }
            </script>
            <h1 class="form-signin-header text-center" style="font-size:18px;">驾校学员管理系统</h1>
            <div class="form-group">
                <div class="input-group">
                    <div class="input-group-addon">登陆权限:</div>
                    <%--<input type="text" class="form-control" name="username" id="username" placeholder="如，ZhangSan">--%>
                    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="acq" value="1" checked="checked" />管理员</td>
                    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="acq" value="0" />学&nbsp;&nbsp;员</td>
                </div>
            </div>
            <div class="form-group">
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
            <button class="btn btn-lg btn-success btn-block" type="button" onclick="sud()">登录</button>
        </form>
        <br>
    </div>
</div>
</body>

</html>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/backstretch/jquery.backstretch.min.js"></script>
<script type="text/javascript">
    $(function(){
        //变换背景图片初始化
        $.backstretch([
            "${pageContext.request.contextPath}/img/licun.jpg",
            "${pageContext.request.contextPath}/img/stars.jpg",
            "${pageContext.request.contextPath}/img/sunshine.jpg"
        ], {
            fade: 750,
            duration: 2000
        });
    });
</script>

