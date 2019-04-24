<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
</head>
<body>
<h1>教练对应学员信息查询</h1>
<table border="1" cellpadding="0" cellspacing="0" class="table table-bordered">
    <tr>
        <td height="30" width="100">教练</td>
        <td height="30" width="100">学员名字</td>
        <td height="30" width="100">学员性别</td>
        <td height="30" width="100">学员年龄</td>
        <td height="30" width="100">学员电话</td>
        <td height="30" width="100">学员住址</td>
    </tr>


  <%--  <s:iterator value="allStudentByTeacher" id="entry">
        <s:property value="#entry"/>{
       &lt;%&ndash; key: <s:property value="key"/>
        value:<s:property value="value"/>}&ndash;%&gt;
        <s:iterator value="value" id="column">
        <td height="30" width="100"><s:property value="key"/></td>


        </s:iterator>

    </s:iterator>--%>

    <s:iterator value="allStudentByTeacher" id="listid">
        <s:iterator value="#listid.value" id="listidsub">
            <tr>
                <td><s:property value="key"/></td>
                <td><s:property value="stu_name"/></td>
                <td><s:property value="stu_gender"/></td>
                <td><s:property value="stu_age"/></td>
                <td><s:property value="stu_tel"/></td>
                <td><s:property value="stu_nativeplace"/></td>
            </tr>
        </s:iterator>
    </s:iterator>


</table>
</body>
</html>