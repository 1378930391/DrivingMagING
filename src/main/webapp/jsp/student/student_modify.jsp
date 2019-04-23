<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>学生修改</title>
    <script type="text/javascript" src="../../js/jquery-1.11.1.min.js"></script>
    <style>
        * {
            margin: 0px;
            padding: 0px;
            background-color: #dbdbdb;
            color: black;
        }

        table {
            margin: 0 auto;
            font-size: 15px;
            text-align: center;
        }

        h1 {
            text-align: center;
            margin: 0px;
        }
    </style>

    <script type="text/javascript">
        $(function () {
            //异步加载班级类型信息
            $.post("class_findAllClass.action", {}, function (data) {
                $(data).each(function (i, n) {
                    $("#stu_class_type").append("<option value='" + n.class_id + "'>" + n.class_type + "</option>");
                })
                //使用EL获取值栈数据
                $("#stu_class_type option[value='${model.stu_class_type.class_id}']").prop("selected", "selected");
            }, "json")
        });
        $(function () {
            //异步加载教练信息
            $.post("teacher_findAllTeacher.action", {}, function (data) {
                $(data).each(function (i, n) {
                    $("#stu_teacher_name").append("<option value='" + n.teacher_id + "'>" + n.teacher_name + "</option>");
                })
                $("#stu_teacher_name option[value='${model.stu_teacher_name.teacher_id}']").prop("selected", "selected");
            }, "json")
        });
        $(function () {
            //异步加载进度信息
            $.post("schedule_findAllSchedule.action", {}, function (data) {
                $(data).each(function (i, n) {
                    $("#stu_schedule_info").append("<option value='" + n.schedule_id + "'>" + n.schedule_info + "</option>");
                })
                $("#stu_schedule_info option[value='${model.stu_schedule_info.schedule_id}']").prop("selected", "selected");
            }, "json")
        });
        $(function () {
            //异步加载考试信息
            $.post("exam_findExamAll.action", {}, function (data) {
                $(data).each(function (i, n) {
                    $("#stu_exam_id").append("<option value='" + n.exam_id + "'>" + n.exam_date + n.exam_subject + "</option>");
                })
                $("#stu_exam_id option[value='${model.stu_exam_id.exam_id}']").prop("selected", "selected");
            }, "json")
        });
    </script>
</head>
<body>
<h1>修改学生信息</h1>
    <form action="/student_update.action?stu_id=<s:property value="%{model.stu_id}" />" target="_parent" method="post">
        <table border="1" cellpadding="0" cellspacing="0" class="table table-bordered">
            <tr>
                <td height="30" width="100">姓名</td>
                <td height="30" width="600" colspan="5">
                    <s:textfield name="stu_name" value="%{model.stu_name}"/>
                </td>
            </tr>
            <tr>
                <td height="30" width="100">性别</td>
                <td height="30" width="600" colspan="5">
                    <s:textfield name="stu_gender" value="%{model.stu_gender}" readonly="true"/>
                </td>
            </tr>
            <tr>
                <td height="30" width="100">生日</td>
                <td height="30" width="600" colspan="5">
                    <s:textfield name="stu_birthday" value="%{model.stu_birthday}" readonly="true"/>
                </td>
            </tr>
            <tr>
                <td height="30" width="100">手机号码</td>
                <td height="30" width="600" colspan="5">
                    <s:textfield name="stu_tel" value="%{model.stu_tel}"/>
                </td>
            </tr>
            <tr>
                <td height="30" width="100">年龄</td>
                <td height="30" width="600" colspan="5">
                    <s:textfield name="stu_age" value="%{model.stu_age}"/>
                </td>
            </tr>
            <tr>
                <td height="30" width="100">身份证</td>
                <td height="30" width="600" colspan="5">
                    <s:textfield name="stu_identity" value="%{model.stu_identity}"/>
                </td>
            </tr>
            <tr>
                <td height="30" width="100">籍贯</td>
                <td height="30" width="600" colspan="5">
                    <s:textfield name="stu_nativeplace" value="%{model.stu_nativeplace}"/>
                </td>
            </tr>
            <tr>
                <td height="30" width="100">学员照片</td>
                <td height="30" width="600" colspan="5">
                    <input height="30" width="600" name="stu_photo" type="file" placeholder="学员照片"/>
                </td>
            </tr>
            <tr>
                <td height="30" width="100">创建时间</td>
                <td height="30" width="600" colspan="5">
                    <s:textfield name="stu_createtime" value="%{model.stu_createtime}" readonly="true"/>
                </td>
            </tr>
            <tr>
                <td height="30" width="100">驾照是否有效</td>
                <td height="30" width="600" colspan="5">
                    <s:textfield name="stu_effective" value="%{model.stu_effective}"/>
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
                <td height="30" width="100">进度信息</td>
                <td height="30" width="600" colspan="5">
                    <select id="stu_schedule_info" name="stu_schedule_info.schedule_id">
                        <option value="">-请选择-</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td height="30" width="100">考试信息</td>
                <td height="30" width="600" colspan="5">
                    <select id="stu_exam_id" name="stu_exam_id.exam_id">
                        <option value="">-请选择-</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td height="30" width="600" colspan="6">
                    <input height="30" width="600" type="submit" value="修改">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>