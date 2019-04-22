
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="exam_insertExam.action" method="post">

    考试日期：<input type="date" name="exam_date" id="exam_date"><br/>
    考试科目：<input type="text" name="exam_subject" id="exam_subject"><br/>
    最大人数：<input type="text" name="exam_maxPeople" id="exam_maxPeople"><br/>
            <input type="hidden" name="exam_currPeople" id="exam_currPeople" value="0">
    考场：<input type="text" name="exam_room" id="exam_room"><br/>

    <input type="submit">
</form>

</body>
</html>
