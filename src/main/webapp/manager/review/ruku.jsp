<%--
  Created by IntelliJ IDEA.
  User: 17868
  Date: 2020/3/22
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>项目入库</title>
</head>
<body>
<%
    String ids=request.getParameter("ids");
%>
<div class="page-container">
                <form id="send_form" class="form form-horizontal" action=""  method="post">
                    <div class="row cl">
                        <label class="form-label col-xs-4 col-sm-2">项目入库：</label>
                    </div>
                    <div class="row cl">
                        <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>归入项目库类型</label>
                        <div class="formControls col-xs-8 col-sm-9"><span class="select-box">
				                <select name="librarytype" id="librarytype" class="select">
					                <option value="政府投资项目库">政府投资项目库</option>
					                <option value="产业项目库">产业项目库</option>
                                    <option value="重点项目库">重点项目库</option>
                                    <option value="规划储备项目库">规划储备项目库</option>
				                </select>
				                </span>
                        </div>
                    </div>
                    <div class="row cl">
                        <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                            <button  class="btn btn-primary radius" onclick="two()" type="button"><i class="Hui-iconfont">&#xe632;</i>入本级库同时进入本级滚动计划</button>
                            <button  class="btn btn-primary radius" onclick="onlyone()" type="button"><i class="Hui-iconfont">&#xe632;</i>只入本级库</button>
                            <button onClick="history.go(-1)" class="btn btn-default radius" type="button">&nbsp;&nbsp;关闭&nbsp;&nbsp;</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </table>
</div>
<script type="text/javascript" src="<%=basePath %>admin/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript">
    function two() {
    if (window.confirm("你确定要入本级库同时进入本级滚动计划吗？")) {
        var librarytype=document.getElementById('librarytype').value
        window.location.href = "<%=request.getContextPath()%>/review/twoguiku?ids=<%=ids%>&librarytype="+librarytype;
        }
    }
    function onlyone() {
        if (window.confirm("你确定要只入本级库吗？")) {
            var librarytype=document.getElementById('librarytype').value
            window.location.href = "<%=request.getContextPath()%>/review/oneguiku?ids=<%=ids%>&librarytype="+librarytype;
        }
    }
</script>
</body>
</html>