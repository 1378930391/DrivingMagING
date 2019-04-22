<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="exam_findBySubject.action" method="post">
    科目名：<select name="exam_subject">
    <option value="科一">科一</option>
    <option value="科二">科二</option>
    <option value="科三">科三</option>
    <option value="科四">科四</option>
</select>
    <input type="submit">
</form>

<table class="table table-hover" >
    <thead>
    <tr>
        <th>考试ID</th>
        <th>考试日期</th>
        <th>考试科目</th>
        <th>当前约考人数</th>
        <th>最大人数</th>
        <th>考试地点</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>

    <s:iterator value="exams">
        <tr>
            <td><s:property value="exam_id"/></td>
            <td><s:property value="exam_date"/></td>
            <td><s:property value="exam_subject"/></td>
            <td><s:property value="exam_currPeople"/></td>
            <td><s:property value="exam_maxPeople"/></td>
            <td><s:property value="exam_room"/></td>
            <td><a href="exam_updateExamJump.action?exam_id=<s:property value="exam_id"/>">修改</a></td>
            <td><a href="exam_deleteExam.action?exam_id=<s:property value="exam_id"/>">删除</a></td>
            <td><a href="exam_queryAllStudent.action?exam_id=<s:property value="exam_id"/>">查看参加考生</a></td>
        </tr>
    </s:iterator>
    </tbody>
</table>
<a href="/jsp/submit.jsp">添加</a>

</body>
</html>
