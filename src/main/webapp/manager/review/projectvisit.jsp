<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: 17868
  Date: 2020/3/21
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <form action="" method="post" class="form form-horizontal" id="form-project-save" name="form-project-save">
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目基本信息：</label>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目编码(国家)：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${sessionScope.updateproject.countryid}" placeholder="" id="" name="countryid" readonly="readonly">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目编码(地方)：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${sessionScope.updateproject.placeid}" placeholder="" id="" name="placeid" readonly="readonly">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>项目名称：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${sessionScope.updateproject.name}" placeholder="" id="" name="name" readonly="readonly">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目类型：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${sessionScope.updateproject.type}" placeholder="" id="" name="type" readonly="readonly">
			 </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>建设性质：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${sessionScope.updateproject.property}" placeholder="" id="" name="property" readonly="readonly">
			</div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">国别：</label>
            <div class="formControls col-xs-8 col-sm-9">
                  <input type="text" class="input-text" value="${sessionScope.updateproject.country}" placeholder="" id="" name="country" readonly="readonly">
				 </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>项目(法人)单位：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" readonly="readonly" value="${sessionScope.updateproject.institution}" placeholder="" id="" name="institution">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>建设地点：</label>
            <div class="formControls col-xs-8 col-sm-9">

                       <input type="text" class="input-text" value="${sessionScope.updateproject.site}" placeholder="" id="" name="site" readonly="readonly">
				</div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>建设地点详情：</label>
            <div class="formControls col-xs-8 col-sm-9">
              <input type="text" class="input-text" value="${sessionScope.updateproject.sitedetail}" placeholder="" id="" name="sitedetail" readonly="readonly">
			</div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>建设详细地址：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="address" readonly="readonly" id="" placeholder="" value="${sessionScope.updateproject.address}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>国标行业：</label>
            <div class="formControls col-xs-8 col-sm-9">
              <input type="text" class="input-text" value="${sessionScope.updateproject.gbindustry}" placeholder="" id="" name="gbindustry" readonly="readonly">
			 </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>所属行业：</label>
            <div class="formControls col-xs-8 col-sm-9">
                       <input type="text" class="input-text" value="${sessionScope.updateproject.industry}" placeholder="" id="" name="industry" readonly="readonly">
				 </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">总投资（万元）：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="investment" readonly="readonly" id="" placeholder="" value="${sessionScope.updateproject.investment}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">拟开工年份：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="date" readonly="readonly" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd',maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" name="startyear" value="<fmt:formatDate value="${sessionScope.updateproject.startyear}" pattern="yyyy-MM-dd"/>"  class="input-text Wdate" style="width:180px;">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">拟建成年份：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="date" readonly="readonly" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd',minDate:'#F{$dp.$D(\'datemin\')}' })" id="datemax" name="endyear" value="<fmt:formatDate value="${sessionScope.updateproject.endyear}" pattern="yyyy-MM-dd"/>"  class="input-text Wdate" style="width:180px;">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>主要建设规模：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <textarea name="buildscale" readonly="readonly" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="$.Huitextarealength(this,200)">${sessionScope.updateproject.buildscale}</textarea>
                <p class="textarea-numberbar"><em class="textarea-length">0</em>/200</p>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">量化建设规模：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" readonly="readonly" name="quantifyscale" id="" placeholder="" value="${sessionScope.updateproject.quantifyscale}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>主要建设内容：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <textarea name="content" readonly="readonly" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="$.Huitextarealength(this,200)">${sessionScope.updateproject.content}</textarea>
                <p class="textarea-numberbar"><em class="textarea-length">0</em>/200</p>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目责任人：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="dutyperson" readonly="readonly" id="" placeholder="" value="${sessionScope.updateproject.dutyperson}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目责任人联系电话：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="dutypersontel" readonly="readonly" id="" placeholder="" value="${sessionScope.updateproject.dutypersontel}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目联系人：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="conperson" readonly="readonly" id="" placeholder="" value="${sessionScope.updateproject.conperson}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目联系人联系电话：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="conpersontel" readonly="readonly" id="" placeholder="" value="${sessionScope.updateproject.conpersontel}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目投资情况：</label>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>资金类别：</label>
            <div class="formControls col-xs-8 col-sm-9">
                       <input type="text" class="input-text" value="${sessionScope.updateproject.fundtype}" placeholder="" id="" name="fundtype" readonly="readonly">
			</div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">总投资（万元）：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="allfund" readonly="readonly" id="" placeholder="" value="${sessionScope.updateproject.allfund}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">累计下达资金：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="xfund" readonly="readonly" id="" placeholder="" value="${sessionScope.updateproject.xfund}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">累计完成投资：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="finvestment" readonly="readonly" id="" placeholder="" value="${sessionScope.updateproject.finvestment}" class="input-text">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">申请资金：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="sfund" readonly="readonly" id="" placeholder="" value="${sessionScope.updateproject.sfund}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目前期工作：</label>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>审批事项：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="reviewthing" readonly="readonly" id="" placeholder="" value="${sessionScope.updateproject.reviewthing}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">批复单位：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="reviewinstitution"  readonly="readonly" id="" placeholder="" value="${sessionScope.updateproject.reviewinstitution}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">批复时间：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"  readonly="readonly" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd',maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemax" name="reviewtime"  value="<fmt:formatDate value="${sessionScope.updateproject.reviewtime}" pattern="yyyy-MM-dd"/>" readonly class="input-text Wdate" style="width:180px;">

            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">批复文件标题：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"  readonly="readonly" name="reviewname" id="" placeholder="" value="${sessionScope.updateproject.reviewname}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">批复文号：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"  readonly="readonly" name="reviewnumber" id="" placeholder="" value="${sessionScope.updateproject.reviewnumber}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">批复状态：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text"  readonly="readonly" name="reviewstatus" id="" placeholder="" value="${sessionScope.updateproject.reviewstatus}" class="input-text">

            </div>
        </div>
        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                <button  onClick="history.go(-1)" class="btn btn-primary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 关闭</button>
                <%--<button onClick="history.go(-1)" class="btn btn-default radius" type="button">&nbsp;&nbsp;关闭&nbsp;&nbsp;</button>--%>
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
<script type="text/javascript">

</script>
</body>
</html>