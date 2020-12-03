<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <link rel="stylesheet" href="/webjars/bootstrap/3.3.5/css/bootstrap.min.css" />
    <link rel="stylesheet" th:href="@{/static/css/home.css}"/>
    <script src="/webjars/jquery/3.3.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script th:src="@{/static/echart/echarts.js}"></script>

</head>
<body>
<div class="top">
    <div class="top-bg" id="topbg">
        <h1>南昌市投资项目在线审批监管平台</h1>
    </div>
</div>


<div class="navbar">
    <div class="container">
        <ul>
            <li ><a href="#" >首页</a></li>
            <li ><a href="#">公示信息</a></li>
            <li ><a href="#">政策法规</a></li>
            <li ><a href="#">招商引资</a></li>
            <li ><a href="#">我要咨询</a></li>
            <li ><a href="#">中介服务</a></li>
            <li ><a href="#">推介项目</a></li>
        </ul>
    </div>
</div>
<div class="welcome">
    <p>欢迎您来到南昌市投资项目在线审批监管平台,今天是<span>2020年3月9日</span></p>
</div>

<div class="container">
    <div class="row">
        <div class="col-md-9">
            <div class="text">
                <p>项目办理结果公示</p>
            </div>
            <table class="table">
                <thead>
                <tr>
                    <th>项目编码</th>
                    <th>项目名称</th>
                    <th>审批事项</th>
                    <th>审批结果</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>aaaa</td>
                    <td>aaaa</td>
                    <td>aaaa</td>
                    <td>aaaa</td>
                </tr>
                <tr>
                    <td>aaaa</td>
                    <td>aaaa</td>
                    <td>aaaa</td>
                    <td>aaaa</td>
                </tr>
                <tr>
                    <td>aaaa</td>
                    <td>aaaa</td>
                    <td>aaaa</td>
                    <td>aaaa</td>
                </tr>
                <tr>
                    <td>aaaa</td>
                    <td>aaaa</td>
                    <td>aaaa</td>
                    <td>aaaa</td>
                </tr>
                <tr>
                    <td>aaaa</td>
                    <td>aaaa</td>
                    <td>aaaa</td>
                    <td>aaaa</td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="col-md-3" style="background-color: #eeeeee" >
            <div class="form-login">
                <form th:action="@{/user/login}" method="post">
                    <h3 class="form-head text-center">用户登录</h3>
                    <p style="color:red" th:text="${msg}" th:if="${ not #strings.isEmpty(msg)}"></p>
                    <input type="text" class="form-control" name="username" placeholder="请输入用户名"
                           required="" autofocus=""/>
                    <input type="password" class="form-control" name="password" placeholder="请输入密码"
                           required=""/>
                    <button class="login" type="submit">登录</button><br>
                    <a href="">用户注册</a>
                    <div class="right"><a href="">忘记密码</a></div>
                </form>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <div class="xm-bg">
        <div class="xm1">
            <a href="" ><img src="/static/images/xm1.png"></a>
        </div>
        <div class="xm2">
            <a href="" ><img src="/static/images/xm2.png"></a>
        </div>
        <div class="xm3">
            <a href="" ><img src="/static/images/xm3.png"></a>
        </div>
    </div>
</div>

<div class="container">
    <div class="drop">
        <span id="span1">申报项目情况</span>
        <div class="dropdown">
            <span>年度</span>
            <button class="btn  btn-default dropdown-toggle" type="button" data-toggle="dropdown">
                2020
                <span class="caret"></span>
            </button>
            <ul class="dropdown-menu" role="menu">
                <li><a href="" >2019</a></li>
                <li><a href="" >2018</a></li>
                <li><a href="" >2017</a></li>
                <li><a href="" >2016</a></li>
            </ul>
        </div>
    </div>

</div>

<div class="container" id="body">

    <div class="col-md-4" >
        <div class="mid-01">
            <div class="title-01">全市项目申报动态</div>
            <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
            <div id="main" style="width: 100%;height:450px;"></div>
        </div>
    </div>

    <div class="col-md-4">

        <div class="mid">
            <div class="title1">全市项目申报概况</div>
            <p>投资项目总数:<span>&nbsp;&nbsp;6135个</span></p>
            <p>审批类项目:<span>&nbsp;&nbsp;2800个</span></p>
            <p>核准类项目:<span>&nbsp;&nbsp;635个</span></p>
            <p>备案类项目:<span>&nbsp;&nbsp;3050个</span></p>
            <p>总投资:<span>&nbsp;&nbsp;1090.66亿元</span></p>
        </div>

        <div class="mid2">
            <div class="title2">申报项目行业TOP5</div>
            <div id="pie" style="width: 100%;height:250px;"></div>
        </div>

    </div>

    <div class="col-md-4">

        <div class="mid3">
            <div class="title3">全市申报项目投资额</div>
            <div id="bar" style="width: 100%;height:520px;"></div>
        </div>

    </div>

</div>

<div class="foot">
    <div class="foot-p">
        <p>网站主办单位: 南昌市发展和改革委员会</p>
        <p>技术支持单位:南昌市信息中心</p>
        <p>南昌市发展和改革委员会  版权所有,如需转载,请注明来源</p>
    </div>
</div>

<script type="text/javascript">
    var myChart = echarts.init(document.getElementById('main'));
    var myChart2 = echarts.init(document.getElementById('pie'));
    var myChart3 = echarts.init(document.getElementById('bar'));
    var option3 = {
        color: [ '#4cabce', ],
        title: {
            text: '',
            subtext: ''
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'shadow'
            }
        },
        legend: {
            data: ['投资额(亿元)']
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis: {
            type: 'value',
            boundaryGap: [0, 0.01]
        },
        yAxis: {
            type: 'category',
            data: ['南昌县', '进贤县', '青山湖区', '青云谱区', '东湖区', '西湖区','湾里区','新建县','安义县']
        },
        series: [

            {
                name: '投资额(亿元)',
                type: 'bar',
                data: [500,400,200,100,150,120,300,800,400]
            }
        ]
    };

    var option2 = {
        tooltip: {
            trigger: 'item',
            formatter: '{a} <br/>{b} : {c} ({d}%)'
        },
        series: [
            {
                name: 'TOP5',
                type: 'pie',
                radius: '55%',
                center: ['50%', '60%'],
                data: [
                    {value: 2800, name: '制造业'},
                    {value: 2520, name: '建筑业'},
                    {value: 234, name: '农、林、牧、渔业'},
                    {value: 156, name: '水利、环境和公共设施管理业'},
                    {value: 775, name: '其他'}
                ],
                emphasis: {
                    itemStyle: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'

                    },
                    normal:{
                        label:{
                            show:true,
                            formatter:'{b} : {c} ({d}%)'
                        },
                        labelLine:{
                            show:true
                        }
                    }

                }
            }
        ]
    };
    myChart2.setOption(option2);
    myChart3.setOption(option3);


    $.get('/static/echart/1.json', function (geoJson) {

        echarts.registerMap('南昌', geoJson);

        myChart.setOption(
            option = {
                title: {
                    text: '',
                    x: "",


                },
                tooltip: {
                    trigger: 'item',
                    formatter: '{b}<br/>项目数:{c}个'
                },
                toolbox: {
                    show: false,
                    orient: 'horizontal',
                    left: 'right',
                    top: 'center',
                    feature: {
                        dataView: {readOnly: false},
                        restore: {},
                        saveAsImage: {}
                    }
                },
                visualMap: {
                    min: 100,
                    max: 1300,
                    text: ['High', 'Low'],
                    realtime: false,
                    calculable: true,
                    inRange: {
                        color: ['lightskyblue', 'yellow', 'orangered']
                    }
                },
                series: [
                    {
                        name: '香港18区人口密度',
                        type: 'map',
                        mapType: '南昌',
                        label: {
                            show: true
                        },
                        data: [
                            {name: '东湖区', value: 547},
                            {name: '西湖区', value: 234},
                            {name: '青云谱区', value: 318},
                            {name: '青山湖区', value: 699},
                            {name: '湾里区', value: 498},
                            {name: '新建区', value: 1200},
                            {name: '南昌县', value: 1100},
                            {name: '安义县', value: 889},
                            {name: '进贤县', value: 1000},

                        ],

                    }
                ]
            });
    });
</script>
</body>
</html>
