<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
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
<h1>教练信息</h1>
<table border="1" cellpadding="0" cellspacing="0" class="table table-bordered">
    <tr>
        <td height="30" width="100">按科目查询</td>
        <td height="30" width="100"><button><a href="teacher_findByLevel.action?teacher_level=科一">科一</a></button></td>
        <td height="30" width="100"><button><a href="teacher_findByLevel.action?teacher_level=科二">科二</a></button></td>
        <td height="30" width="100"><button><a href="teacher_findByLevel.action?teacher_level=科三">科三</a></button></td>
        <td height="30" width="100"><button><a href="teacher_findByLevel.action?teacher_level=科四">科四</a></button></td>
    </tr>
    <tr>
        <td height="30" width="100">按部门查询</td>
        <td height="30" width="100"><button><a href="teacher_findByDepartment.action?teacher_department=A1">A1</a></button></td>
        <td height="30" width="100"><button><a href="teacher_findByDepartment.action?teacher_department=A2">A2</a></button></td>
        <td height="30" width="100"><button><a href="teacher_findByDepartment.action?teacher_department=C1">C1</a></button></td>
        <td height="30" width="100"><button><a href="teacher_findByDepartment.action?teacher_department=C2">C2</a></button></td>
    </tr>
    <tr>
        <td height="30" width="100">姓名</td>
        <td height="30" width="100">性别</td>
        <td height="30" width="100">手机号码</td>
        <td height="30" width="100">部门</td>
        <td height="30" width="100">车号</td>
        <td height="30" width="100">科目</td>
        <td height="30" width="200">操作</td>
    </tr>

    <s:iterator  value="teacherList">
        <tr>
            <td height="30" width="100"><s:property value="teacher_name"/></td>
            <td height="30" width="100"><s:property value="teacher_gender"/></td>
            <td height="30" width="100"><s:property value="teacher_tel"/></td>
            <td height="30" width="100"><s:property value="teacher_department"/></td>
            <td height="30" width="100"><s:property value="teacher_carId"/></td>
            <td height="30" width="100"><s:property value="teacher_level"/></td>
            <td height="30" width="200">
                <a href="teacher_findOne.action?teacher_id=<s:property value="teacher_id"/>">修改</a>
                <a href="teacher_delete.action?teacher_id=<s:property value="teacher_id"/>">删除</a>
            </td>
        </tr>
    </s:iterator>
</table>
</body>
</html>