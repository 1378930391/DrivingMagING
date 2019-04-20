<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--
    驾校简介页面,简单介绍一下驾校
--%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css">
    <style>
        *, body, html, h2, h3, h4, p {
            padding: 0;
            margin: 0;
        }

        a {
            text-decoration: none;
            color: #000000;
        }

        .NavBar {
            width: 100%;
            height: 60px;
            line-height: 60px;
            text-align: center;
            background: #153146;
            border-bottom: 0.5px solid #999;
        }
        .NavBar_buju {
            overflow: hidden;
            margin: 0 auto;
            width: 1200px;
            height: 60px;
            line-height: 60px;
        }

        .NavBar .left {
            float: left;
            height: 60px;
            line-height: 60px;
        }

        .NavBar .left a {
            color: #fff;
            font-family: "微软雅黑";
            font-size: 18px;
        }
        .NavBar .left a > img {
            vertical-align: middle;
            position: relative;
            bottom: 2px;

        }
        .NavBar .right {
            float: right;
        }

        .NavBar .right a {
            color: #fff;
        }
        .NavBar .right a > img {
            vertical-align: middle;
            background-size: cover;
            position: relative;
            bottom: 2px;
        }
        .banner_img img { width: 100%; max-width: 1920px; min-width: 1200px; }
        .banner_background { width: 100%; background: url("banner-bg.jpg") no-repeat center; background-size: cover; }
        .banner_img { position: relative; width: 1200px; margin: 0 auto; }
        .neirong1{
            padding-top: 70px;
            text-align: center;
            height: 33%;
            width: 100%;
            color: white;
            font-size: 100px;
            font-family: 微软雅黑;
        }
        .neirong2{
            padding-top: 35px;
            text-align: center;
            height: 33%;
            width: 100%;
            color: white;
            font-size: 85px;
            font-family: 微软雅黑;
        }
        .neirong3{
            padding-top: 10px;
            text-align: center;
            height: 33%;
            width: 100%;
            color: white;
            font-size: 65px;
            font-family: 微软雅黑;
        }
        .online{ position:fixed; top:30%; width:122px; right:10px; height:225px; background:url("online-bg.png") no-repeat top;}
        .online-con{ position:relative;width:124px;  height:207px; }
        .zixun-online{position:absolute; top:50px; line-height:30px; color:#1a98ff; font-size:18px; font-weight:bold; width:100%; text-align:center}
        .phone-online{position:absolute; top:150px; line-height:10px; color:#fff; font-size:18px; font-weight:bold; width:100%; text-align:center}
        .online-tel {
            font-size: 0.9em !important;
        }
        #a_close{ float: right;
            margin-right: 5px;
            font-size: 0.8em;
            margin-top: 3px;
            color: #1a98ff;
        }
        .phone-online p{
            font-weight:normal;
            margin:0 0 13px 0;
            margin-top:5px;
        }
    </style>
</head>
<body>
<div>
    <div class="NavBar">
        <div class="NavBar_buju">
            <div class="left">
                <a id="fl" class="fl">
                    <a style="margin-right: 10px;font-family: 微软雅黑;font-size: 30px;text-decoration: none">快速考驾照</a>
                </a>
                <a style="margin-left: 10px;cursor:default;text-decoration: none">我学车 我做主</a>
            </div>
            <div class="right ">
                <a style="cursor:default;">
                    <span class="glyphicon glyphicon-earphone"></span>
                </a>
                <a style="margin-left: 10px;font-family: '微软雅黑';font-size: 18px;text-decoration: none">4000050282</a>
            </div>
        </div>
    </div>
</div>

<div class="banner_background" id="banner_background1">
    <div class="banner_img">
        <div style="height: 683px;width: 1200px">
            <div class="neirong1">快捷<a style="color:#ff9900">直营</a>驾校招生</div>
            <div class="neirong2">百分百帮扶 <a style="color:#ff9900">一对一</a>练车</div>
            <div class="neirong3">价格公道 品质服务 信誉第一 35天取证</div>
        </div>
    </div>
</div>
<div class="online" id="online">
    <div class="online-con">
        <span id="a_close" onclick="closediv()" style="height: 35px;cursor:pointer!important">关闭</span>
        <a href="javascript:showchat();" class="tiaozhuanJS">
            <div style="width:100%;height:44%;right:10px;">
                <div class="zixun-online">24小时咨询</div>
            </div>
        </a>
        <div class="phone-online">
            <p style="font-size:18px;font-weight:bold;">电话咨询</p>
            <p class="online-tel">4000050282</p>
            <p style="font-size:12px;">08:00-21:00</p>
        </div>
    </div>
</div>
<script type="text/javascript">
    function closediv() {
        document.getElementById("online").style.display = "none";
    }
</script>
</body>
</html>