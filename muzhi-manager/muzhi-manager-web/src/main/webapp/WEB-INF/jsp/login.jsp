<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/login.css">
</head>
<body>
<div class="container">
    <div class="form row">
        <div class="form-horizontal col-md-offset-3" id="login_form">
            <h3 class="form-title">管理员登录</h3>
            <div class="col-md-9">
                <form>
                <div class="form-group">
                    <i class="fa fa-user fa-lg"></i>
                    <input class="form-control required" type="text" placeholder="Username" id="username" name="username" autofocus="autofocus" maxlength="20" autocomplete="off"/>
                </div>
                <div class="form-group">
                    <i class="fa fa-lock fa-lg"></i>
                    <input class="form-control required" type="password" placeholder="Password" id="password" name="password" maxlength="8"/>
                </div>
                <div class="form-group">
                    <label class="checkbox">
                        <input type="checkbox" name="remember" value="1"/>记住我
                    </label>
                </div>
                <div class="form-group col-md-offset-9">
                    <button type="button" class="btn btn-success pull-right" name="submit">登录</button>
                </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
<script src="/js/jquery-3.3.1.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script>
    $(document).ready(function(){
        $("button[type='button']").click(function(){
            var names=$("input[type='text']").val();
            var psd=$("input[type='password']").val();
            if(!names || !psd){
                alert("用户名和年龄不能为空");
                return false;
            }
            $.ajax({
                type:"post",
                url:"../datebase/logining.php",
                data:{"names":names,"psd":psd},
                success:function (msg) {
                    if(msg=="success"){
                        window.location.href="main.html"
                    }else{
                        alert(msg);
                    }
                }
            });
        });
    });
</script>
</html>