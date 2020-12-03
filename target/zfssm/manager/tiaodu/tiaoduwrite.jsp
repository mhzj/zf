<%--
  Created by IntelliJ IDEA.
  User: 17868
  Date: 2020/3/21
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="Bookmark" href="/favicon.ico" >
    <link rel="Shortcut Icon" href="/favicon.ico" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="<%=basePath %>admin/lib/html5shiv.js"></script>
    <script type="text/javascript" src="<%=basePath %>admin/lib/respond.min.js"></script>

    <![endif]-->
    <link rel="stylesheet" type="text/css" href="<%=basePath %>admin/static/h-ui/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath %>admin/static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath %>admin/lib/Hui-iconfont/1.0.8/iconfont.css" />

    <link rel="stylesheet" type="text/css" href="<%=basePath %>admin/static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="<%=basePath %>admin/static/h-ui.admin/css/style.css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="<%=basePath %>admin/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <!--/meta 作为公共模版分离出去-->
    <link href="<%=basePath %>admin/lib/webuploader/0.1.5/webuploader.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="page-container">
    <form action="${pageContext.request.contextPath }/scheduling/savetiaodu?schedulingid=${sessionScope.scheduling.schedulingid}" method="post" class="form form-horizontal" id="form-article-add" onSubmit="return check(this);" >
        <div class="row cl">
            <label style="margin-left: 136px">项目名称：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="<%=request.getContextPath()%>/review/projectvisit?projectid=${sessionScope.project.projectid}">${sessionScope.project.name}</a></label>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">实施信息：</label>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>实际开工时间：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"  onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd',maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" value="<fmt:formatDate value="${sessionScope.scheduling.reallystart}" pattern="yyyy-MM-dd"/>" name="reallystart" class="input-text Wdate" style="width:180px;">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">实际竣工时间：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"  onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd',minDate:'#F{$dp.$D(\'datemin\')}' })" id="datemax" name="reallyend" value="<fmt:formatDate value="${sessionScope.scheduling.reallyend}" pattern="yyyy-MM-dd"/>" class="input-text Wdate" style="width:180px;">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>招投标方式：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select name="zbtype"  class="select">
                    <option selected="selected" value="${sessionScope.scheduling.zbtype}">${sessionScope.scheduling.zbtype}</option>
					<option value="公开招标">公开招标</option>
					<option value="邀请招标">邀请招标</option>
				</select>
				</span> </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">建设单位：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"  class="input-text" value="${sessionScope.scheduling.buildunit}" placeholder=""  name="buildunit">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">进度详细信息：</label>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>报告期：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"  class="input-text" value="${sessionScope.scheduling.snumber}" placeholder=""  name="snumber">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>形象进度：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select name="imageprogress" class="select" >
                    <option selected="selected" value="${sessionScope.scheduling.imageprogress}">${sessionScope.scheduling.imageprogress}</option>
					<option value="投资审批阶段">投资审批阶段</option>
					<option value="报建阶段">报建阶段</option>
                    <option value="开工建设阶段">开工建设阶段</option>
                    <option value="竣工投产阶段">竣工投产阶段</option>
				</select>
				</span> </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">问题及建议：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <textarea name="question" readonly="readonly" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="$.Huitextarealength(this,200)">${sessionScope.scheduling.question}</textarea>
                <p class="textarea-numberbar"><em class="textarea-length">0</em>/200</p>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">资金到位和完成情况：</label>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>资金类别：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select name="fundtype" class="select">
                    <option value="${sessionScope.project.fundtype}">${sessionScope.project.fundtype}</option>
					<option value="中央预算内投资">中央预算内投资</option>
					<option value="其他中央财政性建设资金">其他中央财政性建设资金</option>
                    <option value="中央专项建设基金">中央专项建设基金</option>
                    <option value="中央水利建设基金">中央水利建设基金</option>
                    <option value="铁路建设专项基金">铁路建设专项基金</option>
                    <option value="民航发展基金">民航发展基金</option>
                    <option value="国家重大水利工程建设基金">国家重大水利工程建设基金</option>
                    <option value="大中型水库移民后期扶持基金">大中型水库移民后期扶持基金</option>
                    <option value="公路建设专项基金">公路建设专项基金</option>
                    <option value="地方预算内投资">地方预算内投资</option>
				</select>
				</span> </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">总投资（万元）：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"  name="allfund"  placeholder="" value="${sessionScope.project.allfund}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">累计下达资金：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"  name="xfund"  placeholder="" value="${sessionScope.project.xfund}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">累计完成投资：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"  name="finvestment"  placeholder="" value="${sessionScope.project.finvestment}" class="input-text">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">本报告期下达：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"  name="sendfund"  placeholder="" value="${sessionScope.scheduling.sendfund}" class="input-text">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">本报告期完成：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"  name="finishfund"  placeholder="" value="${sessionScope.scheduling.finishfund}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                <button  class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存并提交</button>
                <button onClick="history.go(-1)" class="btn btn-default radius" type="button">&nbsp;&nbsp;关闭&nbsp;&nbsp;</button>
            </div>
        </div>
    </form>
</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="<%=basePath %>admin/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->
<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="<%=basePath %>admin/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/lib/webuploader/0.1.5/webuploader.min.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/lib/ueditor/1.4.3/ueditor.config.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/lib/ueditor/1.4.3/ueditor.all.min.js"> </script>
<script type="text/javascript" src="<%=basePath %>admin/lib/ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>
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
</body>
</html>