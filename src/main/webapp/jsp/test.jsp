<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019/4/20
  Time: 下午3:17
  To change this template use File | Settings | File Templates.
--%>
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
            <a href="/jsp/submit.jsp">添加</a>
<form action="student_login.action">  <div class="form-group">
        <div class="input-group">
            <div class="input-group-addon">身份证号:</div>
            <input type="text" class="form-control" name="stu_identity" id="stu_identity" placeholder="请输入身份证号">
        </div>
    </div>
    <div class="form-group">
        <div class="input-group">
            <div class="input-group-addon">首选电话:</div>
            <input type="text" class="form-control" name="stu_phone" id="stu_phone" placeholder="请输入首选电话">
        </div>
    </div>
    <div class="form-group">
        <div class="pull-right"></div>
    </div>
    <input type="submit" class="btn btn-lg btn-success btn-block" value="登陆">
</form>


</body>
</html>
