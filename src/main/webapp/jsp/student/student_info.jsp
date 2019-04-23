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
<h1>驾照考试进度信息</h1>
<table border="1" cellpadding="0" cellspacing="0" class="table table-bordered">
    <tr>
        <td height="30" width="100">姓名</td>
        <td height="30" width="600" colspan="5">${sessionScope.studnet.stu_name}</td>
    </tr>
    <tr>
        <td height="30" width="100">身份证号</td>
        <td height="30" width="600" colspan="5">${sessionScope.studnet.stu_identity}</td>
    </tr>
    <tr>
        <td height="30" width="100">手机号码</td>
        <td height="30" width="600" colspan="5">${sessionScope.studnet.stu_photo}</td>
    </tr>
    <tr>
        <td height="30" width="100">车型</td>
        <td height="30" width="600" colspan="5">C1</td>
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
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td height="30" width="100"></td>
        <td height="30" width="600" colspan="5" >您目前处于培训阶段。在您之前还有 &nbsp <a></a>人等待排队练车</td>
    </tr>
    <tr>
        <td height="30" width="100">科二分车情况</td>
        <td height="30" width="600" colspan="5"></td>
    </tr>
    <tr>
        <td height="30" width="100">科三分车情况</td>
        <td height="30" width="600" colspan="5"></td>
    </tr>
</table>
</body>
</html>