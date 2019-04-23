<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019/4/22
  Time: 下午11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table class="table table-hover" >
    <thead>
    <tr>
        <th>学生ID</th>
        <th>学生姓名</th>
        <th>性别</th>
        <th>生日</th>
        <th>年龄</th>
        <th>电话</th>
        <th>身份证号</th>
        <th>地址</th>
        <th>驾照等级</th>
        <th>注册日期</th>
    </tr>
    </thead>
    <tbody>

    <s:iterator value="students">
        <tr>
            <td><s:property value="stu_id"/></td>
            <td><s:property value="stu_name"/></td>
            <td><s:property value="stu_gender"/></td>
            <td><s:property value="stu_birthday"/></td>
            <td><s:property value="stu_age"/></td>
            <td><s:property value="stu_tel"/></td>
            <td><s:property value="stu_identity"/></td>
            <td><s:property value="stu_nativeplace"/></td>
            <td><s:property value="stu_level"/></td>
            <td><s:property value="stu_createtime"/></td>
        </tr>
    </s:iterator>

    <%----%>
    <%--<c:forEach items="${exams}" var="exam">--%>
    <%--<tr>--%>
    <%--<td><c:out value="${exam.exam_id}"></c:out></td>--%>
    <%--<td><c:out value="${exam.exam_date}"></c:out></td>--%>
    <%--<td><c:out value="${exam.exam_subject}"></c:out></td>--%>
    <%--<td><c:out value="${exam.exam_currPeople}"></c:out></td>--%>
    <%--<td><c:out value="${exam.exam_maxPeople}"></c:out></td>--%>
    <%--<td><c:out value="${exam.exam_room}"></c:out></td>--%>
    <%--<td><a href="exam_updateExamJump.action?exam_id=${exam.exam_id}">修改</a></td>--%>
    <%--<td><a href="exam_deleteExam.action?exam_id=${exam.exam_id}">删除</a></td>--%>
    <%--</tr>--%>
    <%--</c:forEach>--%>
    </tbody>
</table>
</body>
</html>
