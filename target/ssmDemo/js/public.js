// JavaScript Document

$(document).ready(function(){
	$(".mall").hover(function(){
		  $(".mall>a").addClass("h_bg")
		  $(".mei_hover").stop().slideDown("slow")
		},function(){
		  $(".mall>a").removeClass("h_bg")
		  $(".mei_hover").slideUp("1000")	
		})

})

