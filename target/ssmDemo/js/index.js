// JavaScript Document
function leftScroll(){
	var marginLeft=0;
	var stop=false;
	setInterval(function(){
		if(stop) return;
		$(".float_title").find("li").first().animate({"margin-top":marginLeft--},0,function(){
			var $first=$(this);
			if(!$first.is(":animated")){
				if((-marginLeft)>$first.height()+0+0){ //1：是左边框的粗细 18：左右两边的填充
					$first.css({"margin-top":0}).appendTo($(".float_title ul"));
					marginLeft=0;
				}
			}
		});
	},30);
	$(".float_title ul").mouseover(function(){
		stop=true;
	}).mouseout(function(){
		stop=false;
	});
}
function slide(){
	$.getJSON("news/findNews.do",callback);
	function  callback(data) {
		$(data).each(
			function () {
				var a="<li><span class='icon-caret-right'></span><a href=''>"+ this.title+"</a></li>";
				$(".float_title ul").append(a);
			}
		)
	}

}
$(
	function () {
		leftScroll();
		slide();
	}
)

$(document).ready(function(){
	$("#content .main .new ul li").hover(function(){
		   $(this).addClass("l_hover")
		  },function(){
			$(this).removeClass("l_hover")  
			  })
		
		$(function(){$("#slider").nivoSlider()})	  
		
			  
	   $(".remen ul li").hover(function(){ 
	       var liPath = $(this).attr("title")
		   $(this).find("img").attr("src",liPath)
		   },function(){
		   var imgTitle = $(this).find("img").attr("title")
           $(this).find("img").attr("src",imgTitle)
			   })
			   
			   
	   $("#content .main .c_nav ul.img_nav li h3").hover(function(){
		     $(this).addClass("h_hover")
		   },function(){
		     $(this).removeClass("h_hover")
		   })
		
	   $("#content .main .preferential ul li").hover(function(){
		   $(this).find("h4").css("color","#f0145c")
		   },function(){
			$(this).find("h4").css("color","#1c1c1c")  
		   })   
		return false;

})
function show()
{
/*html.style.overflow="hidden";*/
div1.style.display="block";//设置层1显示
/*body.style.overflow="hidden";*/
div2.style.display="block";//设置层2的显示
}


//关闭显示
function closeShow()
{
div1.style.display="none";
div2.style.display="none";
/*html.style.overflow="auto";
body.style.overflow="auto";*/
}
function name_onfocus()
{
   document.getElementById("mz").style.display="none";
}
function name_onblur()
{
   document.getElementById("mz").style.display="block";	
}
function pws_onfocus()
{
   document.getElementById("mm").style.display="none";
   
}
function pws_onblur()
{
   document.getElementById("mm").style.display="block";	
}
function over(k)
{ 
  document.getElementById(k).style.borderColor="#f0145c";	
}
function out(k)
{ 
  document.getElementById(k).style.borderColor="";	
}

