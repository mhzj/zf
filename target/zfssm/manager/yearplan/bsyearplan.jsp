<%--
  Created by IntelliJ IDEA.
  User: 17868
  Date: 2020/4/11
  Time: 19:58
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
    <title>报送区</title>
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

<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 投资计划 <span class="c-gray en">&gt;</span> 年度计划管理 <span class="c-gray en">&gt;</span> 报送区 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div >
        <form action="<%=request.getContextPath()%>/rollplan/search" method="post">
            报送文号:<input type="text" name="bsnumber" id=""  style="width:170px" class="input-text">
            文件标题：<input type="text" name="title" id=""  style="width:170px" class="input-text">
            报送状态：<input type="text" name="sendstatus" id=""  style="width:170px" class="input-text">
            <button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 查询</button>
            <button name="" id="" class="btn btn-success" type="reset"><i class="Hui-iconfont">&#xe665;</i> 重置</button>
        </form>
    </div>
    <form id="myform" name="myform" method="post" action="">
        <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
             <input type="button" class="btn btn-primary radius"  value="变更文号"  onclick="binageng()"  />
             <input type="button" class="btn btn-primary radius"  value="报送"  onclick="baosong()"  />
             <input type="button" class="btn btn-primary radius"  value="退回"  onclick="tuihui()"  />
             <input type="button" class="btn btn-primary radius" value="纳为本级年度投资计划库"  onclick="naru()"  />
        </span>
            <span class="r">共有数据：<strong>${pageInfo.total}</strong> 条</span>
        </div>
        <div class="mt-20">
            <div id="DataTables_Table_0_wrapper" class="dataTables_wrapper no-footer">
                <table class="table table-border table-bordered table-bg table-hover table-sort dataTable no-footer">
                    <thead>
                    <tr class="text-c">
                        <th width="25"><input name="" type="checkbox" value=""></th>
                        <th width="25">ID</th>
                        <th width="100">文号</th>
                        <th width="50">文件标题</th>
                        <th width="50">项目名称</th>
                        <th width="50">总投资(万元)</th>
                        <th width="40">所属单位</th>
                        <th width="40">资金申请年份</th>
                        <th width="50">报送状态</th>
                        <th width="55">报送时间</th>
                    </tr>
                    </thead>
                    <c:forEach items="${pageInfo.list}" var="i" varStatus="suoyin1" >
                        <tbody>
                        <tr class="text-c">
                            <td><input name="id${suoyin1.index+1}"  type="checkbox" class="checkb" value="${i.yearplanid}"></td>
                            <td>
                                <c:if test="${suoyin1.index==0}">${(pageInfo.pageNum-1)*6+1}
                                    <c:set var="startnum" value="${(pageInfo.pageNum-1)*6+1}"/>
                                </c:if>
                                <c:if test="${suoyin1.index!=0}">${startnum+suoyin1.index}
                                </c:if>
                            </td>
                            <td>${i.bsnumber}</td>
                            <td>${i.title}</td>
                            <td><a href="<%=request.getContextPath()%>/review/projectvisit?projectid=${i.projectid}">${i.projectname}</a></td>
                            <td>${i.investment}</td>
                            <td>${i.bsunit}</td>
                            <td>${i.applyyear}</td>
                            <td>${i.sendstatus}</td>
                            <td><fmt:formatDate value="${i.sendtime}" pattern="yyyy-MM-dd"/>
                            </td>
                        </tr>
                        </tbody>
                    </c:forEach>
                </table>

                <!-- 分页信息 -->
                <div class="dataTables_info" id="DataTables_Table_0_info" role="status" aria-live="polite">
                    当前第：${pageInfo.pageNum}页，总共：${pageInfo.pages}页，总共：${pageInfo.total}条记录 </div>

                <div class="dataTables_paginate paging_simple_numbers" id="DataTables_Table_0_paginate">
                    <a class="paginate_button previous disabled" href="<%=request.getContextPath()%>/yearplan/baosong?pn=1">首页</a>

                    <c:if test="${pageInfo.hasPreviousPage }">
                    <span><a href="<%=request.getContextPath()%>/yearplan/baosong?pn=${pageInfo.pageNum-1}"
                             aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
                </a></span>
                    </c:if>

                    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
                        <c:if test="${page_Num == pageInfo.pageNum }">
                        <span><a  class="paginate_button current" href="#">${ page_Num}</a>
                        </span>
                        </c:if>
                        <c:if test="${page_Num != pageInfo.pageNum }">
                        <span><a href="<%=request.getContextPath()%>/yearplan/baosong?pn=${ page_Num}">${
                                page_Num}</a>
                        </span>
                        </c:if>
                    </c:forEach>
                    <c:if test="${pageInfo.hasNextPage }">
                    <span><a href="<%=request.getContextPath()%>/yearplan/baosong?pn=${pageInfo.pageNum+1}"
                             aria-label="Next"><span aria-hidden="true">&raquo;</span></a></span>
                    </c:if>
                    <a class="paginate_button next disabled"
                       href="<%=request.getContextPath()%>/yearplan/baosong?pn=${pageInfo.pages}">末页</a>
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
        function tuihui( ) {
            var result = "";
            var count = 0;
            if ($("input[type='checkbox']:checked").length == 0) {
                alert("请先选择要退回的项目");
            }
            else {
                $(".checkb").each(function () {
                    if ($(this).is(':checked')) {
                        result += $(this).val() + ",";
                        count++;
                    } else {
                    }
                });
                if (window.confirm("确定退回这" + count + "个项目?")) {
                    window.location.href = "<%=request.getContextPath()%>/yearplan/baosongtuihui?ids=" + result;
                }
            }
        }
        function baosong() {
            var result = "";
            var count = 0;
            if ($("input[type='checkbox']:checked").length == 0) {
                alert("请先选择要报送的项目");
            }
            else {
                $(".checkb").each(function () {
                    if ($(this).is(':checked')) {
                        result += $(this).val() + ",";
                        count++;
                    } else {
                    }
                });
                if (window.confirm("您确定报送这" + count + "个项目?")) {
                    window.location.href = "<%=request.getContextPath()%>/yearplan/sendyearplan?ids=" + result;
                }
            }
        }
        function  naru() {
            var result = "";
            var count = 0;
            if ($("input[type='checkbox']:checked").length == 0) {
                alert("请先选择要纳入的项目");
            }
            else {
                $(".checkb").each(function () {
                    if ($(this).is(':checked')) {
                        result += $(this).val() + ",";
                        count++;
                    } else {
                    }
                });
                if (window.confirm("您确定将这" + count + "个项目纳入本级年度投资计划不报送吗?")) {
                    window.location.href = "<%=request.getContextPath()%>/yearplan/countybaosongnaru?ids=" + result;
                }
            }
        }
        function binageng() {
            var result = "";
            if ($("input[type='checkbox']:checked").length == 0) {
                alert("请先选择要变更文号的项目");
            }
            else if($("input[type='checkbox']:checked").length >1) {
                alert("请选择一个项目进行变更文号");
            }
            else {
                $(".checkb").each(function () {
                    if ($(this).is(':checked')) {
                        result = $(this).val();
                    } else {
                    }
                });
                if (window.confirm("确定对这个项目进行变更文号?")) {
                    window.location.href = "<%=request.getContextPath()%>/yearplan/biangeng?yearplanid=" + result;
                }
            }
        }
    </script>
</body>
</html>