<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--
    录入教练信息

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
<h1>录入教练信息</h1>
<form action="teacher_insert.action">
    <input type="hidden" value="123" name="teacher_photo">
<table border="1" cellpadding="0" cellspacing="0" class="table table-bordered">
    <tr>
        <td height="30" width="100">姓名</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" name="teacher_name" type="text" placeholder="请输入教练姓名"></td>
    </tr>
    <tr>
        <td height="30" width="100">性别</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" name="teacher_gender" type="text" placeholder="请输入教练性别"></td>
    </tr>
    <tr>
        <td height="30" width="100">手机号码</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" name="teacher_tel" type="text" placeholder="请输入教练电话"></td>
    </tr>
    <tr>
        <td height="30" width="100">部门</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" name="teacher_department" type="text" placeholder="请输入部门"></td>
    </tr>
    <tr>
        <td height="30" width="100">车号</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" name="teacher_carId" type="text" placeholder="请输入车号"></td>
    </tr>
    <tr>
        <td height="30" width="100">科目</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" name="teacher_level" type="text" placeholder="请输入科目"></td>
    </tr>
    <tr>
        <td height="30" width="100">操作</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" type="submit" value="提交"></td>
    </tr>
</table>
</form>
</body>
</html>