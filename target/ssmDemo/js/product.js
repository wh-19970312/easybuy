// JavaScript Document

$(document).ready(function(){
	$("#content .main .list .zhanshi ul li").hover(function(){
		  $(this).addClass("yangshi")
		},function(){
		$(this).removeClass("yangshi")
		}) 
		
	$("#content .main .select ul li a").hover(function(){
		var imgSrc = $(this).attr("href")
		$(this).find("img").attr("src",imgSrc)
		$(this).prev("p").addClass("shuzi")
		},function(){
		var yImg = $(this).attr("title")
		$(this).find("img").attr("src",yImg)
		$(this).prev("p").removeClass("shuzi")
		})	
		
			
		
	$("#content .main .pinpai ul.b_nav li:eq(0)").addClass("h_rexiao")
	$("#content .main .pinpai ul.b_nav li").click(function(){
		  $("#content .main .pinpai ul.b_nav li").removeClass("h_rexiao")
		  $(this).addClass("h_rexiao")
		  return false;
		})
		
	$("#content .main .gongxiao ul.b_nav li:eq(0)").addClass("h_rexiao")
	$("#content .main .gongxiao ul.b_nav li").click(function(){
		  $("#content .main .gongxiao ul.b_nav li").removeClass("h_rexiao")
		  $(this).addClass("h_rexiao")
		  return false;
		})
		

})