<%--
  Created by IntelliJ IDEA.
  User: 17868
  Date: 2020/4/14
  Time: 16:17
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
    <title>项目调度</title>
</head>
<body>
<%
    String mess=(String)session.getAttribute("message");
    if(mess!=null && !"".equals(mess)){
%>
<script type="text/javascript">
    alert("<%=mess%>");
</script>
<%
        session.setAttribute("message", "");
    }%>

<%
    String mes=(String)session.getAttribute("mess");
    if(mes!=null && !"".equals(mes)){
%>

<script type="text/javascript">
    alert("<%=mes%>");
</script>
<%
        session.setAttribute("mess", "");
    }%>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 项目调度 <span class="c-gray en">&gt;</span> 调度任务管理 <span class="c-gray en">&gt;</span> 调度任务编制 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div >
        <form action="<%=request.getContextPath()%>/rollplan/search" method="post">
            任务名称:<input type="text" name="name"  style="width:170px" class="input-text">
            任务类型：<input type="text" name="stype"  style="width:170px" class="input-text">
            <button name=""  class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 查询</button>
            <button name=""  class="btn btn-success" type="reset"><i class="Hui-iconfont">&#xe665;</i> 重置</button>
        </form>
    </div>
    <form id="myform" name="myform" method="post" action="">
        <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <a href="javascript:;" onclick="taskadd()" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 新增任务</a>
             <%--<a href="javascript:;" onclick="projectsend()" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 报送</a>--%>
            <input type="button" class="btn btn-primary radius" id="button" value="修改任务"  onclick="update()"  />
            <input type="button" class="btn btn-primary radius" id="button" value="删除任务"  onclick="delmore()"  />
            <input type="button" class="btn btn-primary radius" id="button" value="下发调度"  onclick="xiafa()"  />
        </span>
            <span class="r">共有数据：<strong>${pageInfo.total}</strong> 条</span>
        </div>
        <div class="mt-20">
            <div id="DataTables_Table_0_wrapper" class="dataTables_wrapper no-footer">
                <table class="table table-border table-bordered table-bg table-hover table-sort dataTable no-footer">
                    <thead>
                    <tr class="text-c">
                        <th width="30"><input name="" type="checkbox" value=""></th>
                        <th width="30">ID</th>
                        <th width="100">任务名称</th>
                        <th width="80">任务类型</th>
                        <th width="60">任务周期</th>
                        <th width="80">调度要求</th>
                        <th width="80">调度状态</th>
                        <th width="80">调度开始时间</th>
                        <th width="80">调度截止时间</th>
                    </tr>
                    </thead>
                    <c:forEach items="${pageInfo.list}" var="i" varStatus="suoyin1" >
                        <tbody>
                        <tr class="text-c">
                            <td><input name="id${suoyin1.index+1}"  type="checkbox" class="checkb" value="${i.schedulingid}"></td>
                            <td>${suoyin1.index+1}<input type="hidden" name="rollplanid${suoyin1.index+1 }" value="${i.schedulingid}"/></td>
                            <td>${i.name}</td>
                            <td>${i.stype}</td>
                            <td>${i.cycle}</td>
                            <td>${i.requirement}</td>
                            <td>${i.tdstatus}</td>
                            <td><fmt:formatDate value="${i.tdstart}" pattern="yyyy-MM-dd"/>
                            </td>
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
                    <a class="paginate_button previous disabled" href="<%=request.getContextPath()%>/scheduling/bianzhi?pn=1">首页</a>

                    <c:if test="${pageInfo.hasPreviousPage }">
                    <span><a href="<%=request.getContextPath()%>/scheduling/bianzhi?pn=${pageInfo.pageNum-1}"
                             aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
                </a></span>
                    </c:if>

                    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
                        <c:if test="${page_Num == pageInfo.pageNum }">
                        <span><a  class="paginate_button current" href="#">${ page_Num}</a>
                        </span>
                        </c:if>
                        <c:if test="${page_Num != pageInfo.pageNum }">
                        <span><a href="<%=request.getContextPath()%>/scheduling/bianzhi?pn=${ page_Num}">${
                                page_Num}</a>
                        </span>
                        </c:if>
                    </c:forEach>
                    <c:if test="${pageInfo.hasNextPage }">
                    <span><a href="<%=request.getContextPath()%>/scheduling/bianzhi?pn=${pageInfo.pageNum+1}"
                             aria-label="Next"><span aria-hidden="true">&raquo;</span></a></span>
                    </c:if>
                    <a class="paginate_button next disabled"
                       href="<%=request.getContextPath()%>/scheduling/bianzhi?pn=${pageInfo.pages}">末页</a>
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
                {"orderable":false,"aTargets":[0,6]}// 制定列不参与排序
            ]
        });
        function taskadd() {
            window.location.href = "<%=request.getContextPath()%>/manager/tiaodu/insert.jsp";
        }
        function delmore( ) {
            var result = "";
            var count = 0;
            if ($("input[type='checkbox']:checked").length == 0) {
                alert("请先选择要删除的任务");
            }
            else {
                $(".checkb").each(function () {
                    if ($(this).is(':checked')) {
                        result += $(this).val() + ",";
                        count++;
                    } else {
                    }
                });
                if (window.confirm("确定删除这" + count + "个项目?")) {
                    window.location.href = "<%=request.getContextPath()%>/scheduling/delmore?ids=" + result;
                }
            }
        }
        function update() {
            var result = "";
            if ($("input[type='checkbox']:checked").length == 0) {
                alert("请先选择要修改的项目");
            }
            else if($("input[type='checkbox']:checked").length >1) {
                alert("请选择一个项目进行修改");
            }
            else {
                $(".checkb").each(function () {
                    if ($(this).is(':checked')) {
                        result = $(this).val();
                    } else {
                    }
                });
                if (window.confirm("确定修改这个项目?")) {
                    window.location.href = "<%=request.getContextPath()%>/scheduling/update?ids=" + result;
                }
            }
        }
        function xiafa( ) {
            var result = "";
            var count = 0;
            if ($("input[type='checkbox']:checked").length == 0) {
                alert("请先选择要下发调度的任务");
            }
            else {
                $(".checkb").each(function () {
                    if ($(this).is(':checked')) {
                        result += $(this).val() + ",";
                        count++;
                    } else {
                    }
                });
                if (window.confirm("确定下发这" + count + "个调度任务?")) {
                    window.location.href = "<%=request.getContextPath()%>/scheduling/xiafa?ids=" + result;
                }
            }
        }
    </script>
</body>
</html>
