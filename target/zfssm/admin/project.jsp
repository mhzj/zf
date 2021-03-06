<%--
  Created by IntelliJ IDEA.
  User: 17868
  Date: 2020/3/22
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
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
    <title>图片列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 项目管理 <span class="c-gray en">&gt;</span> 填报区 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div >
        <form action="<%=request.getContextPath()%>/project/searchproject" method="post">
        项目名称:<input type="text" name="name" id=""  style="width:170px" class="input-text">
        项目类型：<input type="text" name="type" id=""  style="width:170px" class="input-text">
        建设性质：<input type="text" name="property" id=""  style="width:170px" class="input-text">
        <%--拟开工日期：--%>
        <%--<input type="text" name="start" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}' })" id="logmin" class="input-text Wdate" style="width:170px;">--%>
        <%--至--%>
        <%--<input type="text" name="end" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d' })" id="logmax" class="input-text Wdate" style="width:170px;">--%>
        <button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 查询</button>
        <button name="" id="" class="btn btn-success" type="reset"><i class="Hui-iconfont">&#xe665;</i> 重置</button>
        </form>
    </div>
    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <a href="javascript:;" onclick="projectadd()" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 新增</a>
             <a href="javascript:;" onclick="projectsend()" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 报送</a>
            <a class="btn btn-primary radius" onclick="delmore()" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 批量删除</a></span>
        <span class="r">共有数据：<strong>${fn:length(projectlist)}</strong> 条</span>
    </div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-bg table-hover table-sort">
            <thead>
            <tr class="text-c">
                <th width="30"><input name="" type="checkbox" value=""></th>
                <th width="30">ID</th>
                <th width="100">项目名称</th>
                <th width="50">项目类型</th>
                <th width="50">填报状态</th>
                <th width="50">建设性质</th>
                <th width="50">建设地点</th>
                <th width="60">国标行业</th>
                <th width="60">所属行业</th>
                <th width="70">总投资(万元)</th>
                <th width="100">主要建设内容</th>
                <th width="60">拟开工日期</th>
                <th width="60">拟建成日期</th>
                <th width="100">操作</th>
            </tr>
            </thead>
            <c:forEach items="${sessionScope.projectlist }" var="i" varStatus="suoyin1">
                <tbody>
                <tr class="text-c">
                    <td><input name="id${suoyin1.index+1 }" type="checkbox" value="${suoyin1.index+1 }"></td>
                    <td>${i.projectid }<input type="hidden" name="projectid${suoyin1.index+1 }" value="${i.projectid }"/></td>
                    <td>${i.name}</td>
                    <td>${i.type}</td>
                    <td>${i.sendstatus}</td>
                    <td>${i.property}</td>
                    <td>${i.site}</td>
                    <td>${i.gbindustry}</td>
                    <td>${i.industry}</td>
                    <td>${i.investment}</td>
                    <td>${i.content}</td>
                    <%--<td>${i.startyear}</td>--%>
                    <%--<td>${i.endyear}</td>--%>
                    <td><fmt:formatDate value="${i.startyear}" pattern="yyyy-MM-dd"/>
                    </td>
                    <td><fmt:formatDate value="${i.endyear}" pattern="yyyy-MM-dd"/>
                    </td>
                    <td>
                        <a  class="btn btn-primary radius" href="<%=request.getContextPath()%>/project/updateproject?projectid=${i.projectid }">修改</a>
                        <a  class="btn btn-primary radius" href="#" onclick="delproject(${i.projectid})"> 删除</a>
                    </td>
                </tr>
                </tbody>
            </c:forEach>
        </table>
    </div>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="<%=basePath %>admin/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="<%=basePath %>admin/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
    $('.table-sort').dataTable({
        "aaSorting": [[ 1, "desc" ]],//默认第几个排序
        "bStateSave": true,//状态保存
        "aoColumnDefs": [
            //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
            {"orderable":false,"aTargets":[0,12]}// 制定列不参与排序
        ]
    });

    function projectadd() {
        window.location.href = "<%=basePath %>admin/projectadd.jsp";

    }
    function projectsend() {
        window.location.href = "<%=basePath %>admin/projectsend.jsp";
    }
    function delproject(projectid) {
        if (window.confirm("你确定要删除该新闻信息吗？")) {
            window.location.href = "<%=request.getContextPath()%>/project/delproject?projectid=" + projectid;
        }
    }

    function delmore() {
        if (window.confirm("你确定要删除这些新闻信息吗？")) {
            window.location.href = "<%=request.getContextPath()%>/project/delmore";
        }
    }
</script>
</body>
</html>