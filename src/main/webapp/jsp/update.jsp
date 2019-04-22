<%@ taglib prefix="s" uri="/struts-tags" %>

<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019/4/21
  Time: 下午11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<s:form action="exam_updateExam" method="POST">--%>
    <%--<s:textfield name="exam_id" value="exam.exam_id"/>--%>
<%--</s:form>--%>


<form action="exam_updateExam1.action" method="post">


            <input type="hidden" name="exam_id" value="${exam.exam_id}">
    考试日期：<input type="date" name="exam_date" id="exam_date" value="${exam.exam_date}"><br/>
    考试科目：<input type="text" name="exam_subject" id="exam_subject" value="${exam.exam_subject}"><br/>
    最大人数：<input type="text" name="exam_maxPeople" id="exam_maxPeople" value="${exam.exam_maxPeople}"><br/>
    <input type="hidden" name="exam_currPeople" id="exam_currPeople" value="0">
    考场：<input type="text" name="exam_room" id="exam_room" value="${exam.exam_room}"><br/>

    <input type="submit">
</form>
</body>
</html>
