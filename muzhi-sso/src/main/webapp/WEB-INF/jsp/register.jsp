<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册界面</title>
    <link rel="stylesheet" href="/css/public.css">
    <link rel="stylesheet" href="/css/register.css">
</head>
<body>
<nav id="nav">
    <div class="nav_main">
        <div class="nav_left">
            <h1>牧之</h1>
            <b>欢迎注册</b>
        </div>
    </div>
</nav>
<section id="register">
    <div class="register">
        <div class="title_line">
            <span class="tit">注册</span>
        </div>
        <div class="form">
            <form action="/register/save" method="post" id="myform">
                <input type="text" placeholder="昵称" name="username" autocomplete="off">
                <p id="checkname"></p>
                <input type="password" name="password" placeholder="密码(6-20个字符组成，区分大小写)">
                <p id="checkpass"></p>
                <input type="text" name="email" placeholder="邮箱" autocomplete="off">
                <p id="checkemail"></p>
                <input type="text" name="verification" id="verification" placeholder="请输入邮箱验证码" autocomplete="off">
                <input type="button" value="点击获取" id="getver">
                <input type="button" value="注册" id="publish">
            </form>
            <a href="/login">已有账号，直接登录></a>
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
<script src="/js/register.js"></script>
</body>
</html>