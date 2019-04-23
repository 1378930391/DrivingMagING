<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Jarvis
  Date: 2019/4/22
  Time: 8:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="../../js/jquery-1.11.1.min.js">
</script>
<html>
<head>
    <title>学生考试预约</title>
</head>
<style>
    #exam {
        border: 5px solid black;
        width: 600px;
        height: 400px;
        background-color: lemonchiffon;
        opacity: 0.6; /*虚化*/
        position: absolute; /*绝对定位*/
        top: 50%;
        left: 50%;
        margin-left: -300px;
        margin-top: -200px;
        display: none;
    }

    button {
        background-color: #029EB5;
    }
</style>
<body>
    <s:form method="POST" action="">
        <table border="1px">
            <tr>
                <td>考试日期</td>
                <td>考试科目</td>
                <td>当前报考人数</td>
                <td>最大报考人数</td>
                <td>考试地点</td>
                <td>预约考试</td>
            </tr>
            <s:iterator value="list">
                <tr>
                    <td><s:property value="exam_date"/></td>
                    <td><s:property value="exam_subject"/></td>
                    <td><s:property value="exam_currPeople"/></td>
                    <td><s:property value="exam_maxPeople"/></td>
                    <td><s:property value="exam_room"/></td>
                    <td><a href="/student_orderExam.action?exam_id=<s:property value="exam_id"/>">预约考试`</a>
                        <%--<button onclick="getDisplay()">验证</button>--%>
                    </td>
                </tr>
            </s:iterator>
        </table>
        <%--<div id="exam">
            <h3>请输入你的邮箱: </h3>
            <input type="email"/><br>
            <button onclick="getEmail()"><h3>获取邮箱验证码</h3></button>
            <h3>请输入验证码: </h3>
            <input type="text" name="email" id="email"/>
            <input type="submit" value="验证"/>
        </div>--%>
    </s:form>
</body>
<%--<script type="text/javascript">
    function getDisplay() {
        var e = document.getElementById("exam");
        e.style.display="block";
    }
    function getEmail() {
        var email = document.getElementById("email").value;
        $.ajax({
            type: "POST",
            url: "/email.action",  //与xml配置相同
            data: "email="+email,
            success: function (data) {
            }
        });
        var e = document.getElementById("exam");
        e.style.display="none";
    }
</script>--%>
</html>
