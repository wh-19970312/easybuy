<%--
  Created by IntelliJ IDEA.
  User: cyj
  Date: 2019/12/3
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.ResultSet"%>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<script type="application/javascript">
    function one() {
        location.href="adduser.jsp";
    }
</script>
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


<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
        <td width="1000" height="40" valign="middle"></td>
    </tr>
</table>
<table width="70%" border="0" align="center" cellpadding="15" cellspacing="0" class="bk_e4e4e4">
    <tr>


        <td  height="200" align="left" valign="top" bgcolor="#FFFFFF">
           <form action="selectorderby.do" method="post">
            订单号：<input type="text" name="id">&nbsp;订货人:<input type="text" name="username">&nbsp;<input type="submit" value="查询">
           </form>
            <table width="100%" border="1" cellspacing="0" cellpadding="0"  style="text-align: center;border-color: white">
                <tr style="height: 50px;background-color: #33bbdd">
                    <td>编号</td>
                    <td>姓名</td>
                    <td>发货地址</td>
                    <td>商品名</td>
                    <td>数量</td>
                    <td>创建时间</td>
                    <td>金额</td>
                    <td>操作</td>
                </tr>
                <c:forEach items="${orderList}" var="o">
                    <tr style="height: 30px;background-color: #55dd88">
                        <td>${o.id}</td>
                        <td>${o.username}</td>
                        <td>${o.useraddress}</td>
                        <td>${o.name}</td>
                        <td>${o.quantity}</td>
                        <td>${o.createtime}</td>
                        <td>${o.cost}</td>
                        <td><a href="changeorder.jsp?id=${o.id}">修改</a>&nbsp;<a href="deleteorder.do?id=${o.id}">删除</a></td>
                    </tr>
                </c:forEach>


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

