<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>后台首页</title>
    <link href="/css/bootstrap.css" rel="stylesheet" />
    <link href="/css/base.css" rel="stylesheet" />
</head>
<body>
    <div class="container-fluid">
        <nav class="navbar navbar-default row navbar-fixed-top">
            <div class="container-fluid">	
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#nav-list-left" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">牧之后台管理系统</a>
                </div>

                <div class="collapse navbar-collapse pull-right" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href="#">
                            <img class="img-circle pull-left img-responsive nav-user-img" src="/img/user/user.jpg" /><span class="pull-left nav-username">&nbsp;管理员</span></a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="row" style="margin-top:70px">
            <div class="  nav-left col-md-2 no-padding" id="nav-list-left">
                <div class="user-panel">
                    <img src="/img/user/user.jpg" class="img-circle center-block" />
                </div>
                <div class="nav-list">
                    <ul id="list-down">
                        <li class="nav-left-dropdown">
                            <a href="#">商品管理</a>
                            <ul class="nav-left-dropdown-menu">
                                <li><a href="#">添加商品</a></li>
                                <li><a href="#">查询商品</a></li>
                                <li><a href="#">修改商品</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#">客户管理</a>
                        </li>
                        <li>
                            <a href="#">订单管理</a>
                        </li>
                        <li>
                            <a href="#">收入管理</a>
                        </li>
                        <li>
                            <a href="#">系统设置</a>
                        </li>
                        <li>
                            <a href="#">广告管理</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="main-right  col-md-10 col-md-offset-2">
            <h2>欢迎来到后台主页</h2>
        </div>
    </div>
    <script src="/js/jquery-3.3.1.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
</body>
</html>

