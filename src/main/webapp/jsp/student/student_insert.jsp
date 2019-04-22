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
<h1>录入学生信息</h1>
<form action="studnet_insert.action">
    <input type="hidden" value="123" name="teacher_photo">
<table border="1" cellpadding="0" cellspacing="0" class="table table-bordered">
    <tr>
        <td height="30" width="100">姓名</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" name="stu_name" type="text" placeholder="请输入姓名"></td>
    </tr>
    <tr>
        <td height="30" width="100">性别</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" name="stu_gender" type="text" placeholder="请输入性别"></td>
    </tr>
    <tr>
        <td height="30" width="100">手机号码</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" name="stu_tel" type="text" placeholder="请输入电话"></td>
    </tr>
    <tr>
        <td height="30" width="100">生日</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" name="stu_birthday" type="text" placeholder="请输入生日"></td>
    </tr>
    <tr>
        <td height="30" width="100">年龄</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" name="stu_age" type="text" placeholder="请输入年龄"></td>
    </tr>
    <tr>
        <td height="30" width="100">身份证</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" name="stu_identity" type="text" placeholder="请输入身份证"></td>
    </tr>
    <tr>
        <td height="30" width="100">籍贯</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" name="stu_nativeplace" type="text" placeholder="请输入籍贯"></td>
    </tr>
    <tr>
        <td height="30" width="100">是否有效</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" name="stu_effective" type="text" placeholder="请输入籍贯"></td>
    </tr>
    <tr>
        <td height="30" width="100">籍贯</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" name="stu_nativeplace" type="text" placeholder="请输入籍贯"></td>
    </tr>
    <tr>
        <td height="30" width="100">操作</td>
        <td height="30" width="600" colspan="5"><input height="30" width="600" type="submit" value="提交"></td>
    </tr>
</table>
</form>
</body>
</html>