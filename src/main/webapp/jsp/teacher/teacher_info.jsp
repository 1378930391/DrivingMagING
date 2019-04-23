<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
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
<body>
<h1>更新教练信息</h1>
<form action="teacher_update.action">
    <input type="hidden" value="${teacher.teacher_id}" name="teacher_id">
    <input type="hidden" value="${teacher.teacher_photo}" name="teacher_photo">
    <table border="1" cellpadding="0" cellspacing="0" class="table table-bordered">
        <tr>
            <td height="30" width="100">姓名</td>
            <td height="30" width="600" colspan="5"><input name="teacher_name" type="teacher_name" placeholder="请输入教练姓名"  value="${teacher.teacher_name}"></td>
        </tr>
        <tr>
            <td height="30" width="100">性别</td>
            <td height="30" width="600" colspan="5"><input name="teacher_gender" type="teacher_gender" placeholder="请输入教练性别"  value="${teacher.teacher_gender}"></td>
        </tr>
        <tr>
            <td height="30" width="100">手机号码</td>
            <td height="30" width="600" colspan="5"><input name="teacher_tel" type="teacher_tel" placeholder="请输入教练电话"  value="${teacher.teacher_tel}"></td>
        </tr>
        <tr>
            <td height="30" width="100">部门</td>
            <td height="30" width="600" colspan="5"><input name="teacher_department" type="teacher_department" placeholder="请输入部门"  value="${teacher.teacher_department}"></td>
        </tr>
        <tr>
            <td height="30" width="100">车号</td>
            <td height="30" width="600" colspan="5"><input name="teacher_carId" type="teacher_carId" placeholder="请输入车号"  value="${teacher.teacher_carId}"></td>
        </tr>
        <tr>
            <td height="30" width="100">科目</td>
            <td height="30" width="600" colspan="5"><input name="teacher_level" type="teacher_level" placeholder="请输入科目"  value="${teacher.teacher_level}"></td>
        </tr>
        <tr>
            <td height="30" width="100">操作</td>
            <td height="30" width="600" colspan="5"><input height="30" width="600" type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>