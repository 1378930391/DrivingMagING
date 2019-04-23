<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>插入学生</title>
    <script type="text/javascript" src="../../js/jquery-1.11.1.min.js"></script>
    <style>
        * {
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

    <script type="text/javascript">
        $(function () {
            //异步加载客户信息
            $.post("class_findAllClass.action", {}, function (data) {
                $(data).each(function (i, n) {
                    $("#stu_class_type").append("<option value='" + n.class_id + "'>" + n.class_type + "</option>");
                })
            }, "json")
        });
        $(function () {
            //异步加载客户信息
            $.post("teacher_findAllTeacher.action", {}, function (data) {
                $(data).each(function (i, n) {
                    $("#stu_teacher_name").append("<option value='" + n.teacher_id + "'>" + n.teacher_name + "</option>");
                })
            }, "json")
        });
    </script>
</head>
<body>
<h1>录入学生信息</h1>
<form action="/student_insert.action" target="_parent">
    <table border="1" cellpadding="0" cellspacing="0" class="table table-bordered">
        <tr>
            <td height="30" width="100">姓名</td>
            <td height="30" width="600" colspan="5">
                <input height="30" width="600" name="stu_name" type="text" placeholder="请输入姓名">
            </td>
        </tr>
        <tr>
            <td height="30" width="100">性别</td>
            <td height="30" width="600" colspan="5">
                <input height="30" width="600" name="stu_gender" type="text" placeholder="请输入性别">
            </td>
        </tr>
        <tr>
            <td height="30" width="100">手机号码</td>
            <td height="30" width="600" colspan="5">
                <input height="30" width="600" name="stu_tel" type="text" placeholder="请输入电话">
            </td>
        </tr>
        <tr>
            <td height="30" width="100">生日</td>
            <td height="30" width="600" colspan="5">
                <input height="30" width="600" name="stu_birthday" type="date" placeholder="请输入生日">
            </td>
        </tr>
        <tr>
            <td height="30" width="100">年龄</td>
            <td height="30" width="600" colspan="5">
                <input height="30" width="600" name="stu_age" type="text" placeholder="请输入年龄">
            </td>
        </tr>
        <tr>
            <td height="30" width="100">身份证</td>
            <td height="30" width="600" colspan="5">
                <input height="30" width="600" name="stu_identity" type="text" placeholder="请输入身份证">
            </td>
        </tr>
        <tr>
            <td height="30" width="100">籍贯</td>
            <td height="30" width="600" colspan="5">
                <input height="30" width="600" name="stu_nativeplace" type="text" placeholder="请输入籍贯">
            </td>
        </tr>
        <tr>
            <td height="30" width="100">驾照等级</td>
            <td height="30" width="600" colspan="5">
                <select name="stu_level">
                    <option value="C1">C1</option>
                    <option value="C2">C2</option>
                </select>
            </td>
        </tr>
        <tr>
            <td height="30" width="100">学员照片</td>
            <td height="30" width="600" colspan="5">
                <input height="30" width="600" name="stu_photo" type="file" placeholder="学员照片">
            </td>
        </tr>
        <tr>
            <td height="30" width="100">班级类型</td>
            <td height="30" width="600" colspan="5">
                <select id="stu_class_type" name="stu_class_type.class_id">
                    <option value="">-请选择-</option>
                </select>
            </td>
        </tr>
        <tr>
            <td height="30" width="100">教练姓名</td>
            <td height="30" width="600" colspan="5">
                <select id="stu_teacher_name" name="stu_teacher_name.teacher_id">
                    <option value="">-请选择-</option>
                </select>
            </td>
        </tr>
        <tr>
            <td height="30" width="600" colspan="6">
                <input height="30" width="600" type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>