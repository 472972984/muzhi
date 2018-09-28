<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>关于我们编辑</title>
    <link href="/css/bootstrap.css" rel="stylesheet" />
    <link href="/css/base.css" rel="stylesheet" />
    <link href="/css/about_editor.css" rel="stylesheet">
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
    <div class="col-md-10 col-md-offset-2">
    
        <form action="/add/item" method="post" id="SubForm"  enctype="multipart/form-data">
            <div class="about_editor">
                <span>商品类别：</span>
                <select class="select_body">
                    <option>服饰</option>
                    <option>国画</option>
                    <option>雕刻</option>
                    <option>编制</option>
                    <option>饰品</option>
                </select>
                <select class="select_second">
                    <option>汉服</option>
                    <option>唐装</option>
                    <option>旗袍</option>
                    <option>民族服饰</option>
                </select><br>
                <span>商品名称：</span><input type="text" autocomplete="off" id="name" name="names"><br>
                <span>商品价格：</span><input type="text" autocomplete="off" id="price" name="price"><br>
                <span>商品折扣：</span><input type="text" autocomplete="off" id="discount" name="discount"><br>
                <span>商品库存：</span><input type="text" autocomplete="off" id="nums" name="nums"><br>
                <div class="box">
                </div>
                <span>详细内容：</span>
                <textarea id="editor_id" name="desc">
            </textarea>
                <button type="button" class="btn btn-primary clin" id="publish"><span>添加</span></button>
                <button type="button" class="btn btn-primary clin"><span>重置</span></button>
            </div>
        </form>
    </div>
</div>


<script src="/js/jquery-3.3.1.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script charset="utf-8" src="/kindeditor-master/kindeditor-all.js"></script>
<script charset="utf-8" src="/kindeditor-master/lang/zh-CN.js"></script>
<script src="/js/imgFileupload.js"></script>
<script src="/js/public.js"></script>
<script>

	

     var options = {
        resizeType: 0,
        uploadJson: "/pic/uploadPic", //指定图片上传的url路径，server端写一个视图来处理上传的图片
        filePostName  : "uploadFile", //表单提交中file组件的名称
        extraFileUploadParams: {
            "csrfmiddlewaretoken": "{{ csrf_token }}"
        }
     };
     
	var	itemAddEditor = KindEditor.create("#editor_id", options); //为指定元素创建富文本编辑器 
    
   $("#publish").click(function(){
	    //将编辑器中的内容同步到隐藏多行文本中
   		itemAddEditor.sync();
   		//表单提交
   		$("#SubForm").submit();
   })
    
    
</script>

</body>
</html>

