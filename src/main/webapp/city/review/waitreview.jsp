<%--
  Created by IntelliJ IDEA.
  User: 17868
  Date: 2020/4/9
  Time: 13:21
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
    <title>待审核</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 项目管理 <span class="c-gray en">&gt;</span> 项目审核入库 <span class="c-gray en">&gt;</span> 待审核 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div >
        <form action="<%=request.getContextPath()%>/review/citysearch" method="post">
            项目名称:<input type="text" name="projectname" id=""  style="width:170px" class="input-text">
            项目类型：<input type="text" name="projectype" id=""  style="width:170px" class="input-text">
            建设地点：<input type="text" name="site" id=""  style="width:170px" class="input-text">
            <button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 查询</button>
            <button name="" id="" class="btn btn-success" type="reset"><i class="Hui-iconfont">&#xe665;</i> 重置</button>
        </form>
    </div>
    <form id="myform" name="myform" method="post" action="">
        <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <input type="button" class="btn btn-primary radius"  value="新增"  onclick="insert()" />
            <input type="button" class="btn btn-primary radius"  value="入库"  onclick="ruku()" />
            <input type="button" class="btn btn-primary radius"  value="修改"  onclick="update()"  />
            <a class="btn btn-primary radius" onclick="delmore()" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 批量删除</a></span>
            <span class="r">共有数据：<strong>${pageInfo.total}</strong> 条</span>
        </div>
        <div class="mt-20">
            <div id="DataTables_Table_0_wrapper" class="dataTables_wrapper no-footer">
                <table class="table table-border table-bordered table-bg table-hover table-sort dataTable no-footer">
                    <thead>
                    <tr class="text-c">
                        <th width="30"><input name="" type="checkbox" value=""></th>
                        <th width="30">ID</th>
                        <th width="60">审核意见</th>
                        <th width="50">锁定等级</th>
                        <th width="80">待办部门</th>
                        <th width="100">项目名称</th>
                        <th width="50">项目类型</th>
                        <th width="60">建设地点</th>
                        <th width="80">国标行业</th>
                        <th width="80">所属行业</th>
                        <th width="60">总投资(万元)</th>
                        <th width="80">拟开工日期</th>
                        <th width="80">拟竣工日期</th>
                        <th width="80">报送时间</th>
                        <th width="80">来源单位</th>
                        <th width="80">创建时间</th>
                    </tr>
                    </thead>
                    <c:forEach items="${pageInfo.list}" var="i" varStatus="suoyin1" >
                        <tbody>
                        <tr class="text-c">
                            <td><input name="bid${suoyin1.index+1}"  class="checkb" type="checkbox" value="${i.id}"></td>
                            <td><c:if test="${suoyin1.index==0}">${(pageInfo.pageNum-1)*6+1}
                                <c:set var="startnum" value="${(pageInfo.pageNum-1)*6+1}"/>
                            </c:if>
                                <c:if test="${suoyin1.index!=0}">${startnum+suoyin1.index}
                                </c:if>
                            </td>
                            <td>${i.shoption}</td>
                            <td>${i.rate}</td>
                            <td>${i.institution}</td>
                            <td><a href="<%=request.getContextPath()%>/review/projectvisit?projectid=${i.projectid}">${i.projectname}</a></td>
                            <td>${i.projectype}</td>
                            <td>${i.site}</td>
                            <td>${i.gbindustry}</td>
                            <td>${i.industry}</td>
                            <td>${i.fund}</td>
                            <td><fmt:formatDate value="${i.starttime}" pattern="yyyy-MM-dd"/>
                            </td>
                            <td><fmt:formatDate value="${i.endtime}" pattern="yyyy-MM-dd"/>
                            </td>
                            <td><fmt:formatDate value="${i.sendtime}" pattern="yyyy-MM-dd"/>
                            </td>
                            <td>${i.fromsite}</td>
                            <td><fmt:formatDate value="${i.createtime}" pattern="yyyy-MM-dd"/>
                            </td>
                        </tr>
                        </tbody>
                    </c:forEach>
                </table>

                <!-- 分页信息 -->
                <div class="dataTables_info" id="DataTables_Table_0_info" role="status" aria-live="polite">
                    当前第：${pageInfo.pageNum}页，总共：${pageInfo.pages}页，总共：${pageInfo.total}条记录 </div>

                <div class="dataTables_paginate paging_simple_numbers" id="DataTables_Table_0_paginate">
                    <a class="paginate_button previous disabled" href="<%=request.getContextPath()%>/review/citywaitguanli?pn=1">首页</a>

                    <c:if test="${pageInfo.hasPreviousPage }">
                    <span><a href="<%=request.getContextPath()%>/review/citywaitguanli?pn=${pageInfo.pageNum-1}"
                             aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
                </a></span>
                    </c:if>

                    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
                        <c:if test="${page_Num == pageInfo.pageNum }">
                        <span><a  class="paginate_button current" href="#">${ page_Num}</a>
                        </span>
                        </c:if>
                        <c:if test="${page_Num != pageInfo.pageNum }">
                        <span><a href="<%=request.getContextPath()%>/review/citywaitguanli?pn=${ page_Num}">${
                                page_Num}</a>
                        </span>
                        </c:if>
                    </c:forEach>
                    <c:if test="${pageInfo.hasNextPage }">
                    <span><a href="<%=request.getContextPath()%>/review/citywaitguanli?pn=${pageInfo.pageNum+1}"
                             aria-label="Next"><span aria-hidden="true">&raquo;</span></a></span>
                    </c:if>
                    <a class="paginate_button next disabled"
                       href="<%=request.getContextPath()%>/review/citywaitguanli?pn=${pageInfo.pages}">末页</a>
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
                {"orderable":false,"aTargets":[0,14]}// 制定列不参与排序
            ]
        });
        function insert() {
            window.location.href = "<%=request.getContextPath()%>/city/review/shprojectadd.jsp";
        }
        function ruku( ) {
            var result = "";
            var count = 0;
            if ($("input[type='checkbox']:checked").length == 0) {
                alert("请先选择要入库的项目");
            }
            else {
                $(".checkb").each(function () {
                    if ($(this).is(':checked')) {
                        result += $(this).val() + ",";
                        count++;
                    } else {
                    }
                });
                if (window.confirm("确定入库这" + count + "个项目?")) {
                    window.location.href = "<%=request.getContextPath()%>/review/cityruku?ids=" + result;
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
                    window.location.href = "<%=request.getContextPath()%>/review/cityupdateproject?id=" + result;
                }
            }
        }
        function delmore() {
            var result = "";
            var count = 0;
            if ($("input[type='checkbox']:checked").length == 0) {
                alert("请先选择要删除的项目");
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
                    window.location.href = "<%=request.getContextPath()%>/review/citydelmore?ids=" + result;
                }
            }
        }
    </script>
</body>
</html>