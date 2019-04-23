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
<h1>更新班级信息</h1>
<form action="class_updateClass.action">
    <input type="hidden" value="${findClassById.class_id}" name="class_id">
    <table border="1" cellpadding="0" cellspacing="0" class="table table-bordered">
        <tr>
            <td height="30" width="100">班级类型</td>
            <td height="30" width="600" colspan="5"><input name="class_type" type="class_type" placeholder="请输入教练姓名"  value="${findClassById.class_type}"></td>
        </tr>
        <tr>
            <td height="30" width="100">班级费用</td>
            <td height="30" width="600" colspan="5"><input name="class_cost" type="class_cost" placeholder="请输入教练性别"  value="${findClassById.class_cost}"></td>
        </tr>

        <tr>
            <td height="30" width="100">操作</td>
            <td height="30" width="600" colspan="5"><input height="30" width="600" type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>