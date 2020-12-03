<%--
  Created by IntelliJ IDEA.
  User: 17868
  Date: 2020/3/21
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <link rel="Bookmark" href="/favicon.ico" >
    <link rel="Shortcut Icon" href="/favicon.ico" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="<%=basePath %>admin/lib/html5shiv.js"></script>
    <script type="text/javascript" src="<%=basePath %>admin/lib/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="<%=basePath %>admin/static/h-ui/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath %>admin/static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath %>admin/lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath %>admin/static/h-ui.admin/skin/green/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="<%=basePath %>admin/static/h-ui.admin/css/style.css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="<%=basePath %>admin/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>某市政府投资云服务监管平台投资项目管理系统后台首页</title>

</head>
<body>
<header class="navbar-wrapper">
    <div class="navbar navbar-fixed-top">
        <div class="container-fluid cl"> <a class="logo navbar-logo f-l mr-10 hidden-xs" href="/aboutHui.shtml">某市政府投资云服务监管平台投资项目管理系统</a> <a class="logo navbar-logo-m f-l mr-10 visible-xs" href="/aboutHui.shtml">H-ui</a>
            <span class="logo navbar-slogan f-l mr-10 hidden-xs"></span>
            <a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
            <nav class="nav navbar-nav">
                <ul class="cl">
                    <li class="navbar-levelone current"><a href="javascript:;">首页</a></li>
                    <li class="navbar-levelone"><a href="javascript:;">项目管理</a></li>
                    <li class="navbar-levelone"><a href="javascript:;">投资计划</a></li>
                    <li class="navbar-levelone"><a href="javascript:;">项目调度</a></li>
                    </li>
                </ul>
            </nav>
            <nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
                <ul class="cl">
                    <li>欢迎</li>
                    <li class="dropDown dropDown_hover">
                        <a href="#" class="dropDown_A">${loginUser.institutionname}<i class="Hui-iconfont">&#xe6d5;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" onClick="myselfinfo()">个人信息</a></li>
                            <li><a href="javascript:;" onClick="changepassword()">修改密码</a></li>
                            <li><a href="<%=basePath %>admin/loginout">退出</a></li>
                        </ul>
                    </li>
                    <li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>
                    <li id="Hui-skin" class="dropDown right dropDown_hover"> <a href="javascript:;" class="dropDown_A" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
                            <li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
                            <li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
                            <li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
                            <li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
                            <li><a href="javascript:;" data-val="orange" title="橙色">橙色</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</header>
<aside class="Hui-aside">
    <div class="menu_dropdown bk_2">
        <dl id="menu-member">
            <dt><i class="Hui-iconfont">&#xe60d;</i> 我的桌面<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
        </dl>
        <dl id="menu-admin">
            <dt><i class="Hui-iconfont">&#xe62d;</i> 信息发布<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a data-href="${pageContext.request.contextPath }/manager/information.jsp" data-title="收件箱" href="javascript:void(0)">收件箱</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-tongji">
            <dt><i class="Hui-iconfont">&#xe61a;</i> <a data-href="${pageContext.request.contextPath }/advise/countyguanli" data-title="意见反馈" href="javascript:void(0)">意见反馈</a><i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
        </dl>
    </div>

    <div class="menu_dropdown bk_2" style="display:none">
        <dl id="menu-aaaaa">
            <dt><i class="Hui-iconfont">&#xe616;</i>项目审核入库<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a data-href="${pageContext.request.contextPath }/review/citywaitguanli" data-title="待审核" href="javascript:void(0)">待审核</a></li>
                    <li><a data-href="${pageContext.request.contextPath }/review/cityfinishreview" data-title="已审核" href="javascript:void(0)">已审核</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-system">
            <dt><i class="Hui-iconfont">&#xe62e;</i> 本级项目库<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a data-href="${pageContext.request.contextPath}/projectlibrary/cityguanli" data-title="全部" href="javascript:void(0)">全部</a></li>
                    <li><a data-href="${pageContext.request.contextPath}/projectlibrary/cityzftz" data-title="政府投资项目库" href="javascript:void(0)">政府投资项目库</a></li>
                    <li><a data-href="${pageContext.request.contextPath}/projectlibrary/cityzd" data-title="重点项目库" href="javascript:void(0)">重点项目库</a></li>
                    <li><a data-href="${pageContext.request.contextPath}/projectlibrary/cityghcb" data-title="规划储备项目库" href="javascript:void(0)">规划储备项目库</a></li>
                    <li><a data-href="${pageContext.request.contextPath}/projectlibrary/citycy" data-title="产业项目库" href="javascript:void(0)">产业项目库</a></li>
                </ul>
            </dd>
        </dl>
    </div>

    <div class="menu_dropdown bk_2" style="display:none">
        <dl id="menu-article">
            <dt><i class="Hui-iconfont">&#xe616;</i> 滚动计划管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a data-href="${pageContext.request.contextPath }/rollplan/citybianzhiguanli" data-title="编制区" href="javascript:void(0)">编制区</a></li>
                    <li><a data-href="${pageContext.request.contextPath }/rollplan/citydaibao" data-title="待报区" href="javascript:void(0)">待报区</a></li>
                    <li><a data-href="${pageContext.request.contextPath }/rollplan/cityyearrollplan" data-title="三年滚动计划" href="javascript:void(0)">三年滚动计划</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-picture">
            <dt><i class="Hui-iconfont">&#xe613;</i> 年度计划管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a data-href="${pageContext.request.contextPath }/yearplan/citybianzhiguanli" data-title="编制区" href="javascript:void(0)">编制区</a></li>
                    <li><a data-href="${pageContext.request.contextPath }/yearplan/citybaosong" data-title="报送区" href="javascript:void(0)">报送区</a></li>
                    <li><a data-href="${pageContext.request.contextPath }/yearplan/cityyear" data-title="年度投资计划" href="javascript:void(0)">年度投资计划</a></li>
                    <li><a data-href="${pageContext.request.contextPath }/yearplan/cityxiadainfo" data-title="年度计划已下达" href="javascript:void(0)">年度计划已下达</a></li>
                </ul>
            </dd>
        </dl>
    </div>

    <div class="menu_dropdown bk_2" style="display:none">
            <dl id="menu-product">
                <dt><i class="Hui-iconfont">&#xe620;</i> 调度任务管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
                <dd>
                    <ul>
                        <li><a data-href="${pageContext.request.contextPath }/scheduling/citybianzhi" data-title="调度任务编制" href="javascript:void(0)">调度任务编制</a></li>
                    </ul>
                </dd>
            </dl>
            <dl id="menu-comments">
                <dt><i class="Hui-iconfont">&#xe622;</i> 项目调度管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
                <dd>
                    <ul>
                        <li><a data-href="${pageContext.request.contextPath }/scheduling/cityguanli" data-title="我的调度任务" href="javascript:;">我的调度任务</a></li>
                        <li><a data-href="${pageContext.request.contextPath }/scheduling/cityfinishtask" data-title="已完成任务" href="javascript:void(0)">已完成任务</a></li>
                    </ul>
                </dd>
            </dl>
    </div>

</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
    <div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
        <div class="Hui-tabNav-wp">
            <ul id="min_title_list" class="acrossTab cl">
                <li class="active">
                    <span title="我的桌面" data-href="${pageContext.request.contextPath }/admin/welcome.jsp">我的桌面</span>
                    <em></em></li>
            </ul>
        </div>
        <div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
    </div>
    <div id="iframe_box" class="Hui-article">
        <div class="show_iframe">
            <div style="display:none" class="loading"></div>
            <iframe scrolling="yes" frameborder="0" src="${pageContext.request.contextPath }/admin/welcome.jsp"></iframe>
        </div>
    </div>
</section>

<div class="contextMenu" id="Huiadminmenu">
    <ul>
        <li id="closethis">关闭当前 </li>
        <li id="closeall">关闭全部 </li>
    </ul>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="<%=basePath %>admin/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="<%=basePath %>admin/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="<%=basePath %>admin/lib/jquery.contextmenu/jquery.contextmenu.r2.js"></script>
<script type="text/javascript">
    /*个人信息*/
    function myselfinfo(){
        window.location.href = "<%=basePath %>user/findinfo";
    }
    /*修改密码*/
    function changepassword(){
        window.location.href = "<%=basePath %>admin/updatepassword.jsp";
    }
    $(function(){
        /*$("#min_title_list li").contextMenu('Huiadminmenu', {
            bindings: {
                'closethis': function(t) {
                    console.log(t);
                    if(t.find("i")){
                        t.find("i").trigger("click");
                    }
                },
                'closeall': function(t) {
                    alert('Trigger was '+t.id+'\nAction was Email');
                },
            }
        });*/
        $("body").Huitab({
            tabBar:".navbar-wrapper .navbar-levelone",
            tabCon:".Hui-aside .menu_dropdown",
            className:"current",
            index:0,
        });
    });

</script>

</body>
</html>