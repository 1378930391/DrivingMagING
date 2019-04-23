<%--
  Created by IntelliJ IDEA.
  User: Jarvis
  Date: 2019/4/23
  Time: 4:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>学生信息列表</title>
</head>
<body>
<s:form>
    <table border="1">
        <tr>
            <td>姓名</td>
            <td>性别</td>
            <td>生日</td>
            <td>年龄</td>
            <td>联系电话</td>
            <td>身份证号码</td>
            <td>籍贯</td>
            <td>驾照等级</td>
            <td>创建时间</td>
            <td>是否有效</td>
            <td>班级类型</td>
            <td>教练姓名</td>
            <td>进度信息</td>
            <td>考试信息</td>
            <td>修改学生信息</td>
        </tr>
        <s:iterator value="list">
            <tr>
                <td><s:property value="stu_name"/></td>
                <td><s:property value="stu_gender"/></td>
                <td><s:property value="stu_birthday"/></td>
                <td><s:property value="stu_age"/></td>
                <td><s:property value="stu_tel"/></td>
                <td><s:property value="stu_identity"/></td>
                <td><s:property value="stu_nativeplace"/></td>
                <td><s:property value="stu_level"/></td>
                <td><s:property value="stu_createtime"/></td>
                <td><s:property value="stu_effective"/></td>
                <td><s:property value="stu_class_type.class_type"/></td>
                <td><s:property value="stu_teacher_name.teacher_name"/></td>
                <td><s:property value="stu_schedule_info.schedule_info"/></td>
                <td><s:property value="stu_exam_id.exam_date"/>,
                    <s:property value="stu_exam_id.exam_subject"/>,
                    <s:property value="stu_exam_id.exam_room"/>
                </td>
                <td>
                    <a href="/student_toUpdate.action?stu_id=<s:property value="stu_id" />">修改</a>
                </td>
            </tr>
        </s:iterator>
    </table>
</s:form>
</body>
</html>
