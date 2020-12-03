<%--
  Created by IntelliJ IDEA.
  User: 17868
  Date: 2020/3/15
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>某市政府云服务投资项目管理系统登录页</title>
    <meta name="description" content="particles.js is a lightweight JavaScript library for creating particles.">
    <meta name="author" content="Vincent Garreau" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" media="screen" href="<%=basePath %>resource/login/css/style.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath %>resource/login/css/reset.css"/>
</head>
<script language="JavaScript" type="text/JavaScript">
    function check(form){
        var username = form.username.value;
        if(username.length==0){
            alert("请填写用户名！");
            form.username.focus();
            return false;
        }
        var password = form.password.value;
        if(password.length==0){
            alert("请填写密码！");
            form.password.focus();
            return false;
        }
        var yzmcode = form.yzmcode.value;
        if(yzmcode.length==0){
            alert("请填写验证码！");
            form.yzmcode.focus();
            return false;
        }
    }

</script>
<body>

<div id="particles-js">
    <div class="login">
        <div class="login-top">
            某市政府云服务投资项目管理系统
        </div>
        <form id="loginForm" action="${pageContext.request.contextPath }/user/login" method="post" onSubmit="return check(this);">
        <div class="login-center clearfix">
            <div class="login-center-img"><img src="<%=basePath %>resource/login/img/name.png"/></div>
            <div class="login-center-input">
                <input type="text" name="username" value="" placeholder="请输入您的用户名" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的用户名'"/>
                <div class="login-center-input-text">用户名</div>
            </div>
        </div>
        <div class="login-center clearfix">
            <div class="login-center-img"><img src="<%=basePath %>resource/login/img/password.png"/></div>
            <div class="login-center-input">
                <input type="password" name="password"value="" placeholder="请输入您的密码" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的密码'"/>
                <div class="login-center-input-text">密码</div>
            </div>
        </div>
        <div class="login-center clearfix">
            <div class="login-center-img"><img src="<%=basePath %>resource/login/img/yanzhengma.png" /></div>
            <div class="login-center-input">
                <input style="width: 50%" type="text" name="yzmcode"value="" placeholder="请输入验证码" onfocus="this.placeholder=''" onblur="this.placeholder='请输入验证码'"/>
                <div class="login-center-input-text">验证码</div>
                <a href="javascript:void(0);"  title="点击更换验证码">
                <img src="<%=basePath %>user/createYZM" onclick="reCheckcode(this)" width="110px" height="30px" />
                </a>
            </div>
        </div>
        <font style="margin-left: 75px"; color="red";width="230px";height="25px";font-size: 15px;>
                <%
                    if(request.getAttribute("message")!= null){
                        out.print(request.getAttribute("message"));
                    }
                %>
        </font>

        <div class="login-center clearfix">
            <div class="login-center-img"></div>
            <div class="login-center-input">
                <input style="width: 100px;text-align: center;background-color: dodgerblue;color: white;" type="submit"   name=""value="登录" />
                <a href="<%=basePath%>admin/register.jsp"><input style="width: 100px;margin-left:22px;background-color: dodgerblue;color: white;" type="button"    name=""value="注册" /></a>
            </div>
        </div>
        </form>
    </div>
    <div class="sk-rotating-plane"></div>
</div>

<!-- scripts -->
<script src="<%=basePath %>resource/login/js/particles.min.js"></script>
<script src="<%=basePath %>resource/login/js/app.js"></script>
<script type="text/javascript">

    function reCheckcode(img) {

        //后面跟一个随机数方便每次请求都是一个新的请求，刷新验证码，防止会在缓存中去验证码图片

        img.src="<%=basePath %>user/createYZM?"+Math.random();

    }



</script>

</body>
</html>