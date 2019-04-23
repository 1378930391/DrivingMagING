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
            background-color: #ffffff;
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
<body style="text-align: center">
<h1>教练信息</h1>
<table border="1" cellpadding="0" cellspacing="0" class="table table-bordered">
    <tr>
    <form action="teacher_findByLevel.action" method="post">
        按科目查询：<select name="teacher_level">
        <option value="科一">科一</option>
        <option value="科二">科二</option>
        <option value="科三">科三</option>
        <option value="科四">科四</option>
    </select>
        <input type="submit">
    </form>
    <form action="teacher_findByDepartment.action" method="post">
        按部门查询：<select name="teacher_department">
        <option value="A1">A1</option>
        <option value="A2">A2</option>
        <option value="C1">C1</option>
        <option value="C2">C2</option>
    </select>
        <input type="submit">
    </form>
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
<a href="/jsp/teacher/teacher_insert.jsp" style="text-align: center">添加教练</a>
</body>
</html>