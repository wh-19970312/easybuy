// JavaScript Document

$(document).ready(function(){
   $(".chanpin ul li a:eq(2)").addClass("addyangshi")
   $(".chanpin ul li a").click(function(){
         $(".chanpin ul li a").removeClass("addyangshi")
		 $(this).addClass("addyangshi")
		 var mySrc = $(this).attr("href")
		 var bigPath = $(this).attr("title")
		 $(".datu img").attr("src",mySrc)
		 $(".datu img").attr("jqimg",bigPath)
		 return false
	   })
	   
   $(".jqzoom").jqueryzoom({
			xzoom: 400, //zooming div default width(default width value is 200)
			yzoom: 300, //zooming div default width(default height value is 200)
			offset: 30, //zooming div default offset(default offset value is 10)
			position: "right", //zooming div position(default position value is "right")
			preload:1,
			lens:1
		});
		
	$("#content .main .jieshao .right .dian a").hover(function(){
		  var imgPath = $(this).attr("href")
		  $(this).find("img").attr("src",imgPath)
		},function(){
		  var yImg = $(this).attr("title")
		  $(this).find("img").attr("src",yImg)
		})	
    
	
	
   $(".hadbuy ul li").hover(function(){
	     $(this).addClass("h_yangshi")
	   },function(){
		  $(this).removeClass("h_yangshi")
		   })
})

