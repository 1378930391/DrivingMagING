<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<%--
    列举学生的所有信息, 包括考试时间,参照咱们拟写的需求文档

--%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css">
    <style>
        *{
            margin: 0px;
            padding: 0px;
            background-color: #dbdbdb;
            color: black;
        }
        table{
            margin:0 auto;
            font-size:15px;
            text-align:center;
        }
        h1{
            text-align: center;
            margin: 0px;
        }
    </style>
</head>
<body>
<h1>学生信息</h1>
<table border="1" cellpadding="0" cellspacing="0" class="table table-bordered">
    <tr>
        <td height="30" width="100">姓名</td>
        <td height="30" width="600" colspan="5">${student.stu_name}</td>
        <%--<td height="30" width="600" colspan="5"><s:property value="student"/></td>--%>
    </tr>
    <tr>
        <td height="30" width="100">身份证号</td>
        <td height="30" width="600" colspan="5">${student.stu_identity}</td>
    </tr>
    <tr>
        <td height="30" width="100">手机号码</td>
        <td height="30" width="600" colspan="5">${student.stu_tel}</td>
    </tr>
    <tr>
        <td height="30" width="100">车型</td>
        <td height="30" width="600" colspan="5">${student.stu_level}</td>
    </tr>
    <tr>
        <td height="90" width="100" rowspan="3" style="vertical-align: middle">考试情况</td>
        <td height="30" width="80"></td>
        <td height="30" width="130">科一（驾驶理论）</td>
        <td height="30" width="130">科二（练桩考试）</td>
        <td height="30" width="130">科三（道路考试）</td>
        <td height="30" width="130">科四（安全文明）</td>
    </tr>
    <tr>
        <td>合格情况</td>
        <s:if test="exam.exam_subjct==科一">
            <td>待考</td>
            <td></td>
            <td></td>
            <td></td>
        </s:if>
        <s:elseif test="exam.exam_subjct==科二">
            <td>合格</td>
            <td>待考</td>
            <td></td>
            <td></td>
        </s:elseif>
        <s:elseif test="exam.exam_subjct==科三">
            <td>合格</td>
            <td>合格</td>
            <td>待考</td>
            <td></td>
        </s:elseif>
        <s:elseif test="exam.exam_subjct==科四">
            <td>合格</td>
            <td>合格</td>
            <td>合格</td>
            <td>待考</td>
        </s:elseif>
    </tr>
</table>
</body>
</html>