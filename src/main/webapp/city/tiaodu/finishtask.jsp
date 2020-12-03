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
    <%--<link rel="stylesheet" type="text/css" href="<%=basePath %>admin/lib/bootstrap.min.css">--%>
    <!--[if IE 6]>
    <script type="text/javascript" src="<%=basePath %>admin/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>调度项目列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 项目调度<span class="c-gray en">&gt;</span> 项目调度管理 <span class="c-gray en">&gt;</span> 填报区 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div >
        <form action="<%=request.getContextPath()%>/project/searchproject" method="post">
            任务名称:<input type="text" name="name" id=""  style="width:170px" class="input-text">
            任务期号：<input type="text" name="type" id=""  style="width:170px" class="input-text">
            建设地点：<input type="text" name="site" id=""  style="width:170px" class="input-text">
            <button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 查询</button>
            <button name="" id="" class="btn btn-success" type="reset"><i class="Hui-iconfont">&#xe665;</i> 重置</button>
        </form>
    </div>
    <form id="myform" name="myform" method="post" action="">
        <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">

        </span>
            <span class="r">共有数据：<strong>${pageInfo.total}</strong> 条</span>
        </div>
        <div class="mt-20">
            <div id="DataTables_Table_0_wrapper" class="dataTables_wrapper no-footer">
                <table class="table table-border table-bordered table-bg table-hover table-sort dataTable no-footer">
                    <thead>
                    <tr class="text-c">
                        <th width="30"><input name="" type="checkbox"  value=""></th>
                        <th width="30">ID</th>
                        <th width="50">调度状态</th>
                        <th width="100">项目名称</th>
                        <th width="50">任务期号</th>
                        <th width="50">填报情况</th>
                        <th width="50">任务名称</th>
                        <th width="60">建设地点</th>
                        <th width="60">总投资</th>
                        <th width="60">拟开工年份</th>
                        <th width="60">拟建成年份</th>
                        <th width="60">调度下发单位</th>
                        <th width="60">调度截止时间</th>
                    </tr>
                    </thead>
                    <c:forEach items="${pageInfo.list}" var="i" varStatus="suoyin1" >
                        <tbody>
                        <tr class="text-c">
                            <td><input name="id${suoyin1.index+1}"  type="checkbox" class="checkb" value="${i.schedulingid}"></td>
                            <td>
                                <c:if test="${suoyin1.index==0}">${(pageInfo.pageNum-1)*6+1}
                                    <c:set var="startnum" value="${(pageInfo.pageNum-1)*6+1}"/>
                                </c:if>
                                <c:if test="${suoyin1.index!=0}">${startnum+suoyin1.index}
                                </c:if>
                            </td>
                            <td>${i.tdstatus}</td>
                            <td><c:forEach items="${sessionScope.rollplans}" var="pt" varStatus="suoyin2">
                                <c:if test="${pt.projectid ==i.projectid }"><a href="<%=request.getContextPath()%>/scheduling/tiaoduwrite?schedulingid=${i.schedulingid}&projectid=${i.projectid }&rollplanid=${pt.rollplanid}">
                                        ${pt.projectname}</a></c:if>
                            </c:forEach></td>
                            <td>${i.snumber}</td>
                            <td>${i.writestatus}</td>
                            <td>${i.name}</td>
                            <td><c:forEach items="${sessionScope.rollplans}" var="pt" varStatus="suoyin2">
                                <c:if test="${pt.projectid ==i.projectid }">${pt.site}</c:if></c:forEach></td>
                            <td><c:forEach items="${sessionScope.rollplans}" var="pt" varStatus="suoyin2">
                                <c:if test="${pt.projectid ==i.projectid }">${pt.investment}</c:if></c:forEach></td>
                            <td><c:forEach items="${sessionScope.rollplans}" var="pt" varStatus="suoyin2">
                                <c:if test="${pt.projectid ==i.projectid }"><fmt:formatDate value="${pt.starttime}" pattern="yyyy"/></c:if></c:forEach></td>
                            <td><c:forEach items="${sessionScope.rollplans}" var="pt" varStatus="suoyin2">
                                <c:if test="${pt.projectid ==i.projectid }"><fmt:formatDate value="${pt.endtime}" pattern="yyyy"/></c:if></c:forEach></td>
                            <td>${i.tdxfunit}</td>
                            <td><fmt:formatDate value="${i.tdend}" pattern="yyyy-MM-dd"/>
                            </td>
                        </tr>
                        </tbody>
                    </c:forEach>
                </table>
                <!-- 分页信息 -->
                <div class="dataTables_info" id="DataTables_Table_0_info" role="status" aria-live="polite">
                    当前第：${pageInfo.pageNum}页，总共：${pageInfo.pages}页，总共：${pageInfo.total}条记录 </div>

                <div class="dataTables_paginate paging_simple_numbers" id="DataTables_Table_0_paginate">
                    <a class="paginate_button previous disabled" href="<%=request.getContextPath()%>/scheduling/cityfinishtask?pn=1">首页</a>

                    <c:if test="${pageInfo.hasPreviousPage }">
                    <span><a href="<%=request.getContextPath()%>/scheduling/cityfinishtask?pn=${pageInfo.pageNum-1}"
                             aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
                </a></span>
                    </c:if>

                    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
                        <c:if test="${page_Num == pageInfo.pageNum }">
                        <span><a  class="paginate_button current" href="#">${ page_Num}</a>
                        </span>
                        </c:if>
                        <c:if test="${page_Num != pageInfo.pageNum }">
                        <span><a href="<%=request.getContextPath()%>/scheduling/cityfinishtask?pn=${ page_Num}">${
                                page_Num}</a>
                        </span>
                        </c:if>
                    </c:forEach>
                    <c:if test="${pageInfo.hasNextPage }">
                    <span><a href="<%=request.getContextPath()%>/scheduling/cityfinishtask?pn=${pageInfo.pageNum+1}"
                             aria-label="Next"><span aria-hidden="true">&raquo;</span></a></span>
                    </c:if>
                    <a class="paginate_button next disabled"
                       href="<%=request.getContextPath()%>/scheduling/cityfinishtask?pn=${pageInfo.pages}">末页</a>
                </div>
            </div>
        </div>
    </form>
    <!--_footer 作为公共模版分离出去-->
    <script type="text/javascript" src="<%=basePath %>admin/lib/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>admin/lib/layer/2.4/layer.js"></script>
    <script type="text/javascript" src="<%=basePath %>admin/static/h-ui/js/H-ui.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>admin/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

    <!--请在下方写此页面业务相关的脚本-->
    <script type="text/javascript" src="<%=basePath %>admin/lib/My97DatePicker/4.8/WdatePicker.js"></script>
    <%--<script type="text/javascript" src="<%=basePath %>admin/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>--%>
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
    </script>
</body>
</html>
