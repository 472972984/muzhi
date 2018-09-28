//定时器设置验证码发送间隔时间
var time=null;
var inter=null;
var code=null;
function reduce() {
    if (time == 60) {
        time = time + "s";
        $("#getver").val(time);
    }else{
        time=$("#getver").val();
        time.substring(0,time.length-1);
        time=parseInt(time);
        time--;
        if(time==0){
            $("#getver").val("获取验证码");
            $("#getver").attr("disabled",false);
            clearInterval(inter);
            return false;
        }
        time = time + "s";
        $("#getver").val(time);
    }
}
//验证点击获取验证码时邮箱的合法性并进行Ajax请求
$("#getver").click( function() {
    var email=$("input[name='email']").val();
    var re = /^[A-Za-z\d]+([-_.][A-Za-z\d]+)*@([A-Za-z\d]+[-.])+[A-Za-z\d]{2,4}$/g;
    if (!re.test(email)) {
        $("#checkemail").text("请输入合法的邮箱");
        $("#checkemail").css("color","red");
        $("input[name='email']").css("border","1px solid red");
        return false;
    }
    time=60;
    inter=setInterval("reduce()",1000);
    $("#getver").attr("disabled",true);
    $.ajax({
        type:"get",
        url:"/register/send/email?emailAdd="+email,
        success:function (msg) {
        	if(msg.status==200){
        		code=msg.data;
        	}else{
        		alert("邮箱已被占用！");
        	}
        }
    })
});
//注册信息合法性验证
$(document).ready(function () {
    $("#publish").click(function () {
        //对昵称进行验证
        var username=$("input[name='username']").val();
        if(username.length<=3 || username.length>15){
            $("#checkname").text("昵称长度应该为4-15位");
            $("#checkname").css("color","red");
            $("input[name='username']").css("border","1px solid red");
            return false;
        }
        //对密码进行验证
        var password=$("input[name='password']").val();
        var ps=/[A-Z|0-9|a-z]{6,20}/g;
        if (!ps.test(password)){
            $("#checkpass").text("密码长度应该为6-20位");
            $("#checkpass").css("color","red");
            $("input[name='password']").css("border","1px solid red");
            return false;
        }
        //对邮箱进行验证
        var email=$("input[name='email']").val();
        var re = /^[A-Za-z\d]+([-_.][A-Za-z\d]+)*@([A-Za-z\d]+[-.])+[A-Za-z\d]{2,4}$/g;
        if (!re.test(email)) {
            $("#checkemail").text("请输入合法的邮箱");
            $("#checkemail").css("color","red");
            $("input[name='email']").css("border","1px solid red");
            return false;
        }
      //对验证码是否正确进行验证
        var verificode=$("input[name='verification']").val();
        if(verificode!=code){
            alert("验证码错误");
            return false;
        }
        
        //提交表单
        $.post("/register/save",$("#myform").serialize(), function(data){
			if(data.status == 200){
				alert('用户注册成功，请登录！');
				window.location.href="/login";
			} else {
				alert("注册失败,请检查账号,密码是否使用了特殊字符！");
			}
		});
        
    });
    $("input[name='username']").focus(function () {
        $("#checkname").text("");
        $("#checkname").css("color","white");
        $(this).css("border","1px solid #ddd");
    });
    $("input[name='password']").focus(function () {
        $("#checkpass").text("");
        $("#checkpass").css("color","white");
        $(this).css("border","1px solid #ddd");
    });
    $("input[name='email']").focus(function () {
        $("#checkemail").text("");
        $("#checkemail").css("color","white");
        $(this).css("border","1px solid #ddd");
    });
});