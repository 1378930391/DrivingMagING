<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--
    学习模块,右面分成四部分,科一科二科三科四
    一和四跳转到官网题库学习, 二和三点击之后各5个视频及一段技巧简介(貌似需要在新加一个页面)
--%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css">
    <title>Document</title>
    <style>
        *{
            margin: 0px;
            padding: 0px;
        }
        html body{
            width: 100%;
            height: 100%;
        }
        body{
            background-image: url("timg (1).jpg");
            background-size: 100%;
        }
        .box{
            position: relative;
            margin: 0 auto;
            width: 800px;
            height: 500px;
            border-radius: 100px;
            border: 1px solid dodgerblue;
        }
        .bl{
            position:relative;
            left: 100px;
            float: left;
            width: 200px;
            height: 150px;
            background-color: dodgerblue;
            color: white;
            font-size: 25px;
            text-align: center;
            line-height: 150px;
            margin: 50px;
            border-radius: 100px;
            opacity: 0.8;
        }
        h1{
            text-align: center;
            margin: 0px;
        }

    </style>

</head>
<body>
<h1>在线学习模块</h1>
<div class="box">
    <a href="http://www.jiakaobaodian.com/mnks/kemu1/car.html" class="bl glyphicon glyphicon-arrow-right" style="text-decoration: none">科目一</a>
    <a href="http://www.jiakaobaodian.com/mnks/kemu2/car.html" class="bl glyphicon glyphicon-arrow-right" style="text-decoration: none">科目二</a>
    <a href="http://www.jiakaobaodian.com/mnks/kemu3/car.html" class="bl glyphicon glyphicon-arrow-right" style="text-decoration: none">科目三</a>
    <a href="http://www.jiakaobaodian.com/mnks/kemu4/car.html" class="bl glyphicon glyphicon-arrow-right" style="text-decoration: none">科目四</a>
</div>
</body>
</html>