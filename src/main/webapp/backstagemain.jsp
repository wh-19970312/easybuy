<%--
  Created by IntelliJ IDEA.
  User: cyj
  Date: 2019/11/27
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.ResultSet"%>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>易买网</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

    <link href="css/css.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="css/style.css"/>

    <!--Luara样式文件-->

    <!--左滑样式-->
    <link rel="stylesheet" href="css/luara.left.css"/>
</head>

<body>
<%
    Date date=new Date();
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
    String date1=simpleDateFormat.format(date);

%>
<script src="js/jquery-1.8.3.min.js"></script>
<!--Luara js文件-->
<script src="js/jquery.luara.0.0.1.min.js"></script>

<table width="1000" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
        <td height="30" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td width="2%" align="left"><img src="images/top_03.png" width="13" height="13" /></td>
                <td width="68%" align="left"><span class="fotn_999">您好！欢迎来到</span><span class="font_0A8BC4">易买网管理后台</span><span class="fotn_999">！</span></td>
                <td width="30%" align="right"> <a href="regist.jsp">注册</a> |
                    <%
                        String name=(String)session.getAttribute("User.name");
                        System.out.println(name+"vvvv");
                    %>
                    <c:choose>
                        <c:when test="${empty User.name}">
                            <a href="login.jsp">登录</a>
                        </c:when>
                        <c:otherwise>
                            <span style="color: red;"><c:out value="${User.name }欢迎您!"></c:out></span>
                        </c:otherwise>
                    </c:choose>
                    <a href="logout">注销</a>
                </td>
            </tr>
        </table></td>
    </tr>
    <tr>
        <td height="110" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td>
                    <iframe name="weather_inc" src="http://i.tianqi.com/index.php?c=code&id=2&num=5" width="650" height="70" frameborder="0" marginwidth="0" marginheight="0" scrolling="no"></iframe>
                </td>
                <!-- <td width="21%"><img src="images/top_09.png" width="210" height="76" /></td>
                <td width="5%" align="center"><img src="images/top_07.png" width="1" height="85" /></td>
                <td width="46%" align="left"><img src="images/top_15.png" width="216" height="27" /></td>-->
                <td width="28%">
                </td>
            </tr>
        </table></td>
    </tr>
    <tr>

        <td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td width="160" align="center" bgcolor="#076f9b"><a href="backstagemain.jsp" class="dao">首页</a></td>
                <td width="2" align="center" ><img src="images/top_22.png" width="2" height="40" /></td>
                <td width="160" align="center" bgcolor="#076f9b"><a href="findusers.do" class="dao">用户</a></td>
                <td width="2" align="center"><img src="images/top_22.png" width="2" height="40" /></td>
                <td width="160" align="center" bgcolor="#076f9b"><a href="findproducts.do" class="dao">商品</a></td>
                <td width="2" align="center"><img src="images/top_22.png" width="2" height="40" /></td>
                <td width="160" align="center" bgcolor="#076f9b"><a href="findorders.do" class="dao">订单</a></td>
                <td width="2" align="center"><img src="images/top_22.png" width="2" height="40" /></td>
                <td width="160" align="center" bgcolor="#076f9b"><a href="findadvise.do" class="dao">留言</a></td>
                <td width="2" align="center"><img src="images/top_22.png" width="2" height="40" /></td>
                <td width="160" align="center" bgcolor="#076f9b"><a href="findnews.do" class="dao">新闻</a></td>
                <td width="2" align="center"><img src="images/top_22.png" width="2" height="40" /></td>
                <td align="center">&nbsp;</td>
            </tr>
        </table></td>

    </tr>
</table>
<table width="1000" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
        <td style="color: red;">
            <marquee scrollamount="5" loop="infinite">
                管理员${User.name }您好，今天是<%=date1 %>，欢迎回到管理后台。
            </marquee>
        </td>
    </tr>
</table>


<table width="1000" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
        <td width="1000" height="20" valign="middle"></td>
    </tr>
</table>
<table width="1000" border="0" align="center" cellpadding="15" cellspacing="0" class="bk_e4e4e4">
    <tr>

        <td width="2" align="left" valign="middle" bgcolor="#FFFFFF"></td>
        <td width="616" height="200" align="left" valign="top" bgcolor="#FFFFFF"><table width="100%" border="0" cellspacing="0" cellpadding="5">
            <tr>
                <td align="left" class="font_14"><h2>关于易买网</h2></td>
                <td align="right" class="font_14"><img src="images/about_38.jpg" width="35" height="11" /></td>
            </tr>

            <tr>
                <td colspan="2" height="300" align="left"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width="27%" align="left"><img src="images/about_45.jpg" width="160" height="240" /></td>
                        <td width="73%" align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 易买网——比价返现第一站 成立于2004年，是中国最早的、规模最大的网上购物垂直社区。为网民提供比较购物、购物返现、导购资讯、网购社区等服务，汇聚了众多成熟、活跃、忠诚、有影响力的网购用户。
                            易买网是目前中国最大的比价返现导购网站，每月为400多家B2C、C2C网站，如当当、亚马逊中国（卓越）、京东、Vancl、麦网、淘宝、红孩子、1号店、唯品会等合作伙伴带去巨大的销售额，会员返利超过亿万元现金。
                            易买网基于庞大的网购精准用户群，为数百家电子商务网站、快销品等客户提供了全方位深度营销服务，并通过易买网络平台传播至更广泛的目标用户中，为合作伙伴培养了大量忠实用户，贡献了巨大业绩。
                            品牌广告：具有强大影响力用户群及平台开放展示类广告资源，令合作伙伴迅速上位，扩大品牌知名度。　ROI整合营销：更易于广告主科学评估以营销为目标的整合销售计划，实现收益共赢。
                            品牌精准营销：会员站短，EDM等营销手段累计网友口碑，提升品牌效应，有针对的EDM、站短、做到精确推广。
                            活动互动营销：与终端用户间的持续互动商城可与终端用户间持续互动，实现长期品牌关注度和忠诚度的提升。
                            商品收录搜索：数百万商品收录，刺激销售大力提升品牌及产品曝光，百万级产品收录，通过比价刺激销售。
                        </td>
                    </tr>
                </table>
                </td>
            </tr>
        </table></td>
    </tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="0" class="font_fff">
    <tr>
        <td height="200" align="center">
            <img src="images/about_15.jpg" width="800" height="120">

        </td>
    </tr>
    <tr>
        <td height="93" align="center" background="images/endbj.jpg">Copyright @ 2017-2023  All Rights Reserved  版权所有<br />
            地址：长江大学东校区小西门斜对面汉科十巷9号1楼&nbsp;&nbsp;电话：400-027-3552&nbsp;&nbsp;QQ：800101800</td>
    </tr>
</table>

</body>
</html>
