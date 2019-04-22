<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
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
            background-color: lightseagreen;
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
        <td height="30" width="100">姓名</td>
        <td height="30" width="600" colspan="5">${teacher.teacher_name}</td>
    </tr>
    <tr>
        <td height="30" width="100">性别</td>
        <td height="30" width="600" colspan="5">${teacher.teacher_gender}</td>
    </tr>
    <tr>
        <td height="30" width="100">手机号码</td>
        <td height="30" width="600" colspan="5">${teacher.teacher_tel}</td>
    </tr>
    <tr>
        <td height="30" width="100">部门</td>
        <td height="30" width="600" colspan="5">${teacher.teacher_department}</td>
    </tr>
    <tr>
        <td height="30" width="100">车号</td>
        <td height="30" width="600" colspan="5">${teacher.teacher_carId}</td>
    </tr>
    <tr>
        <td height="30" width="100">科目</td>
        <td height="30" width="600" colspan="5">${teacher.teacher_level}</td>
    </tr>
</table>
</body>
</html>