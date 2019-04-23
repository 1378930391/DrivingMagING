<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="S" uri="/struts-tags" %>
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
<h1>教练学生信息</h1>
<s:debug>

</s:debug>
<table border="1" cellpadding="0" cellspacing="0" class="table table-bordered">
    <tr>
        <td height="30" width="100">班级序号</td>
        <td height="30" width="100">班级类型</td>
        <td height="30" width="100">班级费用</td>
    </tr>
    <%-- <S:debug>

     </S:debug>--%>
    <s:iterator  value="findAllClass">
        <tr>
            <td height="30" width="100"><s:property value="class_id"/></td>
            <td height="30" width="100"><s:property value="class_type"/></td>
            <td height="30" width="100"><s:property value="class_cost"/></td>
            <td height="30" width="200">
                <a href="class_findClassById.action?class_id=<s:property value="class_id"/>">修改</a>
                <a href="class_findClassById.action?class_id=<s:property value="class_id"/>">删除</a>
            </td>
        </tr>
    </s:iterator>
</table>
</body>
</html>