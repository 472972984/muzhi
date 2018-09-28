//对输入的用户名密码进行合法性验证
var verifyCode = new GVerify("v_container");
$(document).ready(function () {
	
	//点击注册
	$("#register").click(function(){
		window.location.href="/register";
	})
	
	//点击登录
    $("#publish").click(function () {
        var re = /^[A-Za-z\d]+([-_.][A-Za-z\d]+)*@([A-Za-z\d]+[-.])+[A-Za-z\d]{2,4}$/g;
        var email=$("input[name='email']").val();
        if (!re.test(email)) {
            $("#checkemail").text("请输入合法的邮箱地址");
            $("#checkemail").css("color","red");
            $("input[name='email']").css("border","1px solid red");
            return false;
        }
        var password=$("input[name='password']").val();
        var ps=/[A-Z|0-9|a-z]{6,20}/g;
        if (!ps.test(password)){
            $("#checkpass").text("密码长度应该为6-20位");
            $("#checkpass").css("color","red");
            $("input[name='password']").css("border","1px solid red");
            return false;
        }
        var res = verifyCode.validate($("#code_input").val());
        if(!res){
            $("#verification").text("验证码错误");
            $("#verification").css("color","red");
            $("#code_input").val("");
            return false;
        }
       
        
        
        //提交表单
        $.post("/login/user",$("#myform").serialize(), function(data){
			if(data.status == 200){
				 alert("登录成功！")
				 alert("假装跳转！");
//				window.location.href="/login";
				window.location.href="https://www.baidu.com";
			} else {
				alert("邮箱或密码错误！");
			}
		});
        
        
        
    });
    //再次点击输入框时，输入框清空
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
    $("#code_input").focus(function () {
        $("#verification").text("");
        $("#verification").css("color","white");
    });
});