<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019/4/22
  Time: 下午9:17
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

    <s:iterator value="students">
    <tr>
        <td><s:property value="stu_id"/></td>

    </tr>
    </s:iterator>
</body>
</html>
