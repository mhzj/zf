<%--
  Created by IntelliJ IDEA.
  User: 17868
  Date: 2020/3/21
  Time: 12:01
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
    <link rel="stylesheet" media="screen" href="<%=basePath %>resource/register/css/style.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath %>resource/register/css/reset.css"/>
</head>
<script language="JavaScript" type="text/JavaScript">
    function check(form){
        var username = form.username.value;
        if(username.length==0){
            alert("请填写登录名名！");
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
    <div class="register">
        <div class="register-top">
            某市政府云服务投资项目管理系统
        </div>
        <form id="registerForm" action="<%=basePath%>user/register" method="post" onSubmit="return check(this);">
            <div class="register-group">
                <input type="text" name="institutionname" class="regin-center-input" placeholder="请输入单位名称" autocomplete="off"/>
            </div><br/>
            <div class="register-group" >
                <select id="certificatetype" name="certificatetype" class="regin-center-input">
                    <option value="企业营业执照">企业营业执照</option>
                    <option value="社会信用代码">社会信用代码</option>
                    <option value="组织机构代码">组织机构代码</option>
                    <option value="其他">其他</option>
                </select>
            </div><br/>
            <div>
                <input id="submitDept" name="reviewdepartment" type="text" class="regin-center-input" placeholder="请输入审核部门"   />
            </div><br/>
            <div>
                <input type="text" name="username" class="regin-center-input" placeholder="请输入登录名" autocomplete="new-password" oncontextmenu="return false" onpaste="return false" />
            </div><br/>
            <div>
                <input type="text" name="contactpersonname" class="regin-center-input" placeholder="请输入联系人姓名" oncontextmenu="return false" onpaste="return false" />
            </div><br/>
            <div>
                <input type="text" name="telphone" class="regin-center-input" placeholder="请输入手机" oncontextmenu="return false" onpaste="return false" />
            </div><br/>
            <div>
                <input type="email" name="email" class="regin-center-input" placeholder="请输入邮箱" oncontextmenu="return false" onpaste="return false" />
            </div><br/>
            <div>
                <input type="password" name="password" class="regin-center-input" placeholder="请输入密码" autocomplete="new-password" oncontextmenu="return false" onpaste="return false" />
            </div><br/>
            <div>
                <input type="password" name="confirm_password" class="regin-center-input" placeholder="请再次输入密码" oncontextmenu="return false" onpaste="return false" />
            </div><br/>
            <div>
                <input style="margin-left:80px;width:140px;height:30px;" type="text" name="yzmcode"value="" placeholder="请输入验证码" />
                <a href="javascript:void(0);"  title="点击更换验证码">
                    <img src="<%=basePath %>user/createYZM" onclick="reCheckcode(this)" width="87px" height="34px" />
                </a>
            </div><br/>
            <%--<div>--%>
                <%--<label>角色</label>--%>
                <%--<select id="roleid" name="roleid" >--%>
                    <%--<option value="0">管理员</option>--%>
                    <%--<option value="1">市发改部门</option>--%>
                    <%--<option value="2">区县发改部门</option>--%>
                    <%--<option value="3">项目责任单位</option>--%>
                <%--</select>--%>
            <%--</div>--%>
                <div class="login-center-input">
                    <input style="width: 100px;margin-left:80px;background-color: dodgerblue;color: white;" type="submit"   name=""value="注册" />
                    <input style="width: 100px;margin-left:32px;background-color: dodgerblue;color: white;" type="reset" name=""value="重置" />
                </div><br/>
                <div>
                    <a href="<%=basePath %>admin/login.jsp"><p class="end">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;已有账户点此登录</p></a>
                </div>
            </div>
        </form>
    </div>
    <div class="sk-rotating-plane"></div>
</div>
<!-- scripts -->
<script src="<%=basePath %>resource/register/js/particles.min.js"></script>
<script src="<%=basePath %>resource/register/js/app.js"></script>
<script type="text/javascript">
    function reCheckcode(img) {
        //后面跟一个随机数方便每次请求都是一个新的请求，刷新验证码，防止会在缓存中去验证码图片
        img.src="<%=basePath %>user/createYZM?"+Math.random();
    }
</script>
</body>
</html>
