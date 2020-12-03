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
    <form action="<%=basePath %>projectlibrary/save?projectid=${sessionScope.updateproject.projectid}&librarytype=${sessionScope.projectsend.librarytype}" method="post" class="form form-horizontal" id="form-project-save" name="form-project-save">
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目基本信息：</label>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目编码(国家)：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${sessionScope.updateproject.countryid}" placeholder=""  name="countryid">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目编码(地方)：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${sessionScope.updateproject.placeid}" placeholder=""  name="placeid">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>项目名称：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${sessionScope.updateproject.name}" placeholder=""  name="name">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目类型：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
                      <select name="type" class="select" >
                                <option value="${sessionScope.updateproject.type}">${sessionScope.updateproject.type}</option>
                                <c:set var="projecttype" scope="session" value="${sessionScope.updateproject.type}"/>
                                <c:if test="${projecttype!='审批'}">
                                    <option value="审批">审批</option></c:if>
                                <c:if test="${projecttype!='核准'}">
                                    <option value="核准">核准</option></c:if>
                      </select>
				</span> </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>建设性质：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select name="property" class="select">
					<option value="${sessionScope.updateproject.property}">${sessionScope.updateproject.property}</option>
					<c:if test="${sessionScope.updateproject.property!='新建'}">
                        <option value="新建">新建</option></c:if>
                    <c:if test="${sessionScope.updateproject.property!='扩建'}">
                        <option value="扩建">扩建</option></c:if>
                    <c:if test="${sessionScope.updateproject.property!='改建'}">
                        <option value="改建">改建</option></c:if>
				</select>
				</span> </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">国别：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select name="country" class="select">
					<option value="${sessionScope.updateproject.country}">${sessionScope.updateproject.country}</option>
					<c:if test="${sessionScope.updateproject.property!='中国'}">
                        <option value="中国">中国</option></c:if>
                    <c:if test="${sessionScope.updateproject.property!='巴基斯坦'}">
                        <option value="巴基斯坦">巴基斯坦</option></c:if>
                    <c:if test="${sessionScope.updateproject.property!='俄国'}">
                        <option value="俄国">俄国</option></c:if>
				</select>
				</span> </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>项目(法人)单位：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${sessionScope.updateproject.institution}" placeholder="" id="" name="institution">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>建设地点：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select name="site" class="select">
                    <option value="${sessionScope.updateproject.site}">${sessionScope.updateproject.site}</option>
                     <c:if test="${sessionScope.updateproject.sitedetail!='南昌市'}">
                         <option value="南昌市">南昌市</option></c:if>
				</select>
				</span> </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>建设地点详情：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select name="sitedetail" class="select">
					<option value="${sessionScope.updateproject.sitedetail}">${sessionScope.updateproject.sitedetail}</option>
                    <c:if test="${sessionScope.updateproject.sitedetail!='西湖区'}">
                        <option value="西湖区">西湖区</option></c:if>
                    <c:if test="${sessionScope.updateproject.sitedetail!='东湖区'}">
					    <option value="东湖区">东湖区</option></c:if>
                    <c:if test="${sessionScope.updateproject.sitedetail!='青云谱区'}">
                    <option value="青云谱区">青云谱区</option></c:if>
                    <c:if test="${sessionScope.updateproject.sitedetail!='青山湖区'}">
                    <option value="青山湖区">青山湖区</option></c:if>
                    <c:if test="${sessionScope.updateproject.sitedetail!='湾里区'}">
                    <option value="湾里区">湾里区</option></c:if>
                    <c:if test="${sessionScope.updateproject.sitedetail!='南昌县'}">
                    <option value="南昌县">南昌县</option></c:if>
                    <c:if test="${sessionScope.updateproject.sitedetail!='进贤县'}">
                    <option value="进贤县">进贤县</option></c:if>
                    <c:if test="${sessionScope.updateproject.sitedetail!='新建县'}">
                    <option value="新建县">新建县</option></c:if>
                    <c:if test="${sessionScope.updateproject.sitedetail!='安义县'}">
                    <option value="安义县">安义县</option></c:if>
				</select>
				</span> </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>建设详细地址：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="address" id="" placeholder="" value="${sessionScope.updateproject.address}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>国标行业：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select name="gbindustry" class="select">
				<option value="${sessionScope.updateproject.gbindustry}">${sessionScope.updateproject.gbindustry}</option>
                    <c:if test="${sessionScope.updateproject.gbindustry!='农业'}">
                        <option value="农业">农业</option></c:if>
                     <c:if test="${sessionScope.updateproject.gbindustry!='采矿业'}">
                         <option value="采矿业">采矿业</option></c:if>
                     <c:if test="${sessionScope.updateproject.gbindustry!='制造业'}">
                         <option value="制造业">制造业</option></c:if>
                     <c:if test="${sessionScope.updateproject.gbindustry!='林业'}">
                         <option value="林业">林业</option></c:if>
                     <c:if test="${sessionScope.updateproject.gbindustry!='牧业'}">
                         <option value="牧业">牧业</option></c:if>
                     <c:if test="${sessionScope.updateproject.gbindustry!='渔业'}">
                         <option value="渔业">渔业</option></c:if>
                     <c:if test="${sessionScope.updateproject.gbindustry!='建筑业'}">
                         <option value="建筑业">建筑业</option></c:if>
                     <c:if test="${sessionScope.updateproject.gbindustry!='交通运输业'}">
                         <option value="交通运输业">交通运输业</option></c:if>
                     <c:if test="${sessionScope.updateproject.gbindustry!='住宿和餐饮业'}">
                         <option value="住宿和餐饮业">住宿和餐饮业</option></c:if>
				</select>
				</span> </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>所属行业：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select name="industry" class="select">
                    <option value="${sessionScope.updateproject.industry}">${sessionScope.updateproject.industry}</option>
                    <c:if test="${sessionScope.updateproject.industry!='农业'}">
                        <option value="农业">农业</option></c:if>
                     <c:if test="${sessionScope.updateproject.industry!='采矿业'}">
                         <option value="采矿业">采矿业</option></c:if>
                     <c:if test="${sessionScope.updateproject.industry!='制造业'}">
                         <option value="制造业">制造业</option></c:if>
                     <c:if test="${sessionScope.updateproject.industry!='林业'}">
                         <option value="林业">林业</option></c:if>
                     <c:if test="${sessionScope.updateproject.industry!='牧业'}">
                         <option value="牧业">牧业</option></c:if>
                     <c:if test="${sessionScope.updateproject.industry!='渔业'}">
                         <option value="渔业">渔业</option></c:if>
                     <c:if test="${sessionScope.updateproject.industry!='建筑业'}">
                         <option value="建筑业">建筑业</option></c:if>
                     <c:if test="${sessionScope.updateproject.industry!='交通运输业'}">
                         <option value="交通运输业">交通运输业</option></c:if>
                     <c:if test="${sessionScope.updateproject.industry!='住宿和餐饮业'}">
                         <option value="住宿和餐饮业">住宿和餐饮业</option></c:if>
				</select>
				</span> </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">总投资（万元）：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="investment" id="" placeholder="" value="${sessionScope.updateproject.investment}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">拟开工年份：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="date" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd',maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" name="startyear" value="<fmt:formatDate value="${sessionScope.updateproject.startyear}" pattern="yyyy-MM-dd"/>" readonly class="input-text Wdate" style="width:180px;">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">拟建成年份：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="date" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd',minDate:'#F{$dp.$D(\'datemin\')}' })" id="datemax" name="endyear" value="<fmt:formatDate value="${sessionScope.updateproject.endyear}" pattern="yyyy-MM-dd"/>" readonly class="input-text Wdate" style="width:180px;">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>主要建设规模：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <textarea name="buildscale"  cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="$.Huitextarealength(this,200)">${sessionScope.updateproject.buildscale}</textarea>
                <p class="textarea-numberbar"><em class="textarea-length">0</em>/200</p>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">量化建设规模：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="quantifyscale" id="" placeholder="" value="${sessionScope.updateproject.quantifyscale}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>主要建设内容：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <textarea name="content"  cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="$.Huitextarealength(this,200)">${sessionScope.updateproject.content}</textarea>
                <p class="textarea-numberbar"><em class="textarea-length">0</em>/200</p>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目责任人：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="dutyperson" id="" placeholder="" value="${sessionScope.updateproject.dutyperson}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目责任人联系电话：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="dutypersontel" id="" placeholder="" value="${sessionScope.updateproject.dutypersontel}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目联系人：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="conperson" id="" placeholder="" value="${sessionScope.updateproject.conperson}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目联系人联系电话：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="conpersontel" id="" placeholder="" value="${sessionScope.updateproject.conpersontel}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>填报状态：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select name="sendstatus" class="select">
					<option value="${sessionScope.updateproject.sendstatus}">${sessionScope.updateproject.sendstatus}</option>
					<c:if test="${sessionScope.updateproject.sendstatus!='待上报'}">
                        <option value="待上报">待上报</option></c:if>
                    <c:if test="${sessionScope.updateproject.sendstatus!='已上报'}">
                        <option value="已上报">已上报</option></c:if>
                    <c:if test="${sessionScope.updateproject.sendstatus!='被退回'}">
                        <option value="被退回">被退回</option></c:if>
				</select>
				</span> </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目投资情况：</label>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>资金类别：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select name="fundtype" class="select">
                    <option value="${sessionScope.updateproject.fundtype}">${sessionScope.updateproject.fundtype}</option>
                    <c:if test="${sessionScope.updateproject.fundtype!='中央预算内投资'}">
					<option value="中央预算内投资">中央预算内投资</option></c:if>
                    <c:if test="${sessionScope.updateproject.fundtype!='其他中央财政性建设资金'}">
					<option value="其他中央财政性建设资金">其他中央财政性建设资金</option></c:if>
                    <c:if test="${sessionScope.updateproject.fundtype!='中央专项建设基金'}">
                    <option value="中央专项建设基金">中央专项建设基金</option></c:if>
                    <c:if test="${sessionScope.updateproject.fundtype!='中央水利建设基金'}">
                    <option value="中央水利建设基金">中央水利建设基金</option></c:if>
                    <c:if test="${sessionScope.updateproject.fundtype!='铁路建设专项基金'}">
                    <option value="铁路建设专项基金">铁路建设专项基金</option></c:if>
                    <c:if test="${sessionScope.updateproject.fundtype!='民航发展基金'}">
                    <option value="民航发展基金">民航发展基金</option></c:if>
                    <c:if test="${sessionScope.updateproject.fundtype!='国家重大水利工程建设基金'}">
                    <option value="国家重大水利工程建设基金">国家重大水利工程建设基金</option></c:if>
                    <c:if test="${sessionScope.updateproject.fundtype!='大中型水库移民后期扶持基金'}">
                    <option value="大中型水库移民后期扶持基金">大中型水库移民后期扶持基金</option></c:if>
                    <c:if test="${sessionScope.updateproject.fundtype!='公路建设专项基金'}">
                    <option value="公路建设专项基金">公路建设专项基金</option></c:if>
                    <c:if test="${sessionScope.updateproject.fundtype!='地方预算内投资'}">
                    <option value="地方预算内投资">地方预算内投资</option></c:if>
				</select>
				</span> </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">总投资（万元）：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="allfund" id="" placeholder="" value="${sessionScope.updateproject.allfund}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">累计下达资金：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="xfund" id="" placeholder="" value="${sessionScope.updateproject.xfund}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">累计完成投资：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="finvestment" id="" placeholder="" value="${sessionScope.updateproject.finvestment}" class="input-text">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">申请资金：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="sfund" id="" placeholder="" value="${sessionScope.updateproject.sfund}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">项目前期工作：</label>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>审批事项：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select name="reviewthing" class="select">
                    <option value="${sessionScope.updateproject.reviewthing}">${sessionScope.updateproject.reviewthing}</option>
                    <c:if test="${sessionScope.updateproject.reviewthing!='建设项目用地预审'}">
					<option value="建设项目用地预审">建设项目用地预审</option></c:if>
                    <c:if test="${sessionScope.updateproject.reviewthing!='选址意见书'}">
					<option value="选址意见书">选址意见书</option></c:if>
                    <c:if test="${sessionScope.updateproject.reviewthing!='环境影响评价批复'}">
                    <option value="环境影响评价批复">环境影响评价批复</option></c:if>
                    <c:if test="${sessionScope.updateproject.reviewthing!='节能评估和审查'}">
                    <option value="节能评估和审查">节能评估和审查</option></c:if>
                    <c:if test="${sessionScope.updateproject.reviewthing!='项目建议书批复'}">
                    <option value="项目建议书批复">项目建议书批复</option></c:if>
                    <c:if test="${sessionScope.updateproject.reviewthing!='可行性研究报告'}">
                    <option value="可行性研究报告">可行性研究报告</option></c:if>
                    <c:if test="${sessionScope.updateproject.reviewthing!='初步设计及概算'}">
                    <option value="初步设计及概算">初步设计及概算</option></c:if>
                    <c:if test="${sessionScope.updateproject.reviewthing!='项目核准'}">
                    <option value="项目核准">项目核准</option></c:if>
                    <c:if test="${sessionScope.updateproject.reviewthing!='项目备案'}">
                    <option value="项目备案">项目备案</option></c:if>
                    <c:if test="${sessionScope.updateproject.reviewthing!='资金申请报告'}">
                    <option value="资金申请报告">资金申请报告</option></c:if>
                    <c:if test="${sessionScope.updateproject.reviewthing!='开工许可证'}">
                    <option value="开工许可证">开工许可证</option></c:if>
                    <c:if test="${sessionScope.updateproject.reviewthing!='施工许可证'}">
                    <option value="施工许可证">施工许可证</option></c:if>
				</select>
				</span> </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">批复单位：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="reviewinstitution" id="" placeholder="" value="${sessionScope.updateproject.reviewinstitution}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">批复时间：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd',maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemax" name="reviewtime"  value="<fmt:formatDate value="${sessionScope.updateproject.reviewtime}" pattern="yyyy-MM-dd"/>" readonly class="input-text Wdate" style="width:180px;">

            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">批复文件标题：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="reviewname" id="" placeholder="" value="${sessionScope.updateproject.reviewname}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">批复文号：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" name="reviewnumber" id="" placeholder="" value="${sessionScope.updateproject.reviewnumber}" class="input-text">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">批复状态：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select name="reviewstatus" class="select">
                    <option value="${sessionScope.updateproject.reviewstatus}">${sessionScope.updateproject.reviewstatus}</option>
                    <c:if test="${sessionScope.updateproject.reviewstatus!='批准'}">
                        <option value="批准">批准</option></c:if>
                    <c:if test="${sessionScope.updateproject.reviewstatus!='评审'}">
                        <option value="评审">评审</option></c:if>
				</select>
				</span> </div>
        </div>
        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                <button  class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存并提交</button>
                <button onClick="history.go(-1)" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
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