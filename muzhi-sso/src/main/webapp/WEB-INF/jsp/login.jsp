<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录界面</title>
    <link rel="stylesheet" href="/css/public.css">
    <link rel="stylesheet" href="/css/login.css">
</head>
<body>
<nav id="nav">
    <div class="nav_main">
        <div class="nav_left">
            <h1>牧之</h1>
            <b>欢迎登录</b>
        </div>
    </div>
</nav>
<section id="login">
    <div class="login">
        <div class="title_line">
            <span class="tit">登录</span>
        </div>
        <div class="login_left">
            <img src="./image/show.png">
            <h3>扫描二维码登录</h3>
            <p>请使用<a href="#">牧之客户端</a></p>
            <p>扫码登录</p>
            <p>或扫码下载APP</p>
        </div>
        <div class="login_right">
            <form action="/login/user" method="post" id="myform">
                <input type="text" name="email" placeholder="你的邮箱" autocomplete="off">
                <p id="checkemail"></p>
                <input type="password" name="password" placeholder="密码">
                <p id="checkpass"></p>
                <div>
                    <input type="text" id="code_input" value="" placeholder="请输入验证码" autocomplete="off"/>
                    <div id="v_container"></div>
                    <span id="verification"></span>
                    <div class="clear"></div>
                </div>
                <h3><input type="checkbox">记住我<b>不是自己的电脑上不要勾选</b><a>无法验证?</a><a>忘记密码?</a></h3>
                <input type="button" value="登录" id="publish">
                <input type="button" value="注册" id="register">
                <h4><a id="weibo">微博账号登录</a> <a id="qq">QQ账号登录</a></h4>
            </form>
        </div>
        <div class="clear">

        </div>
    </div>
</section>
<footer id="footer">
    <div class="footer">
        <ul>
            <li><a href="#">关于我们</a></li><li>|</li>
            <li><a href="#">联系我们</a></li><li>|</li>
            <li><a href="#">人才招聘</a></li><li>|</li>
            <li><a href="#">商家入驻</a></li><li>|</li>
            <li><a href="#">手机牧之</a></li><li>|</li>
            <li><a href="#">牧之社区</a></li><li>|</li>
            <li><a href="#">牧之论坛</a></li><li>|</li>
            <li><a href="#">牧之公益</a></li><li>|</li>
            <li><a href="#">English Site</a></li>
        </ul>
        <p>Copyright © 2015-2018  牧之MZ.com 版权所有</p>
    </div>
</footer>
<script src="/js/jquery-3.3.1.js"></script>
<script src="/js/Verification.js"></script>
<script src="/js/checked.js"></script>
</body>
</html>