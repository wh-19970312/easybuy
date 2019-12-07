// JavaScript Document

//新闻
var Pagesize;
function leftScroll() {
    var marginLeft = 0;
    var stop = false;
    setInterval(function () {
        if (stop) return;
        $(".float_li").find("li").first().animate({"margin-top": marginLeft--}, 0, function () {
            var $first = $(this);
            if (!$first.is(":animated")) {
                if ((-marginLeft) > $first.height()) { //1：是左边框的粗细 18：左右两边的填充
                    $first.css({"margin-top": 0}).appendTo($(".float_li ul"));
                    marginLeft = 0;
                }
            }
        });
    }, 80);
    $(".right_float ul").mouseover(function () {
        stop = true;
    }).mouseout(function () {
        stop = false;
    });
}
//新闻的滑动
function slide() {
    $.getJSON("news/findNews.do", callback);
    function callback(data) {
        $(data).each(
            function () {
                var a = "<li><span class='icon-caret-right'></span><a href=''>" + this.title + "</a></li>";
                $(".float_li ul").append(a);
            }
        )
    }

}
function SelectProdutById(index,id) {
    $.ajaxSettings.async = false;
    $.getJSON("productType/leval3.do","id="+id,callback);
    function callback(data) {
        $(".preferential ul").remove();
        var ul='<ul>';
        var size=0;
        for (var j in data) {
            size++;
        }
        Pagesize=size;
        for(var i=0;i<8;i++){
            var c=(index-1)*8 + i;
            if(c>=size){
                break;
            }
            var li = "<li class='teshu'>" +
                "<a href=''><img src='' /></a>" +
                "<div>" +
                "<h4>" + data[c].name + "</h4>" +
                "<p>"+"￥"+"<span>" + data[c].price + "</span><span class='shop_span'>"+"库存:" + data[c].stock + "</span></p>" +
                "</div> </li>";
            ul = ul + li;
        }
        ul+='</ul>';
        $(".preferential").append(ul);
        return Pagesize;
    }

}

function findType() {
    $.getJSON("productType/all.do", callback);
    function callback(data) {
        $(data).each(
            function () {
                var div = "<h2  id="+this.id+" onclick=shop_a(" + this.id + ")>" + this.typeName + "</h2>";
                var ul = "<ul class="+this.id+"></ul>";
                var id=this.id;
                var all=div+ul;
                $(".shop_body").append(all);
                $(this.productCategories).each(
                    function () {
                        var li = "<li><span class='icon-caret-right'></span><a onclick='actionType("+this.id+")'>" + this.name + "</a></li>";
                        $(".shop_body ul."+id).append(li);
                    }
                );


            }
        )

    }
}

function shop_a(flag) {
    $("#" + flag).next().slideToggle(200);
    $("#" + flag).toggleClass("on");
}

function check() {
    $(".shop_body").slideToggle(200);
}

function click() {
    $(".recent_body").slideToggle(200);
}


 function size_shop() {
     $.getJSON("productType/recentProduct.do",callback());
     function callback(data) {
         $(data).each(
           function () {
               var li = "<li><span class='icon-caret-right'></span><a href='detail.html?id='"+this.id+">" + this.name + "</a></li>"
               $(".recent_body ul").append(li);
           }
         )
     }
}
function product(index){
    var ReturnData;
    $.ajaxSettings.async = false;
    $.getJSON("productType/AllProduct.do",callback);
    function callback(data) {
        ReturnData =data;
        $(".preferential ul").remove();
        var ul='<ul>';
        var size=0;
        for (var j in data) {
            size++;
        }
       Pagesize=size;
        for(var i=0;i<8;i++){
            var c=(index-1)*8 + i;
            if(c>=size){
                break;
            }
            var li = "<li class='teshu'>" +
                "<a href=''><img src='' /></a>" +
                "<div>" +
                "<h4>" + data[c].name + "</h4>" +
                "<p>"+"￥"+"<span>" + data[c].price + "</span><span class='shop_span'>"+"库存:" + data[c].stock + "</span></p>" +
                "</div> </li>";
            ul = ul + li;
        }
        ul+='</ul>';
        $(".preferential").append(ul);
        return Pagesize;
    }

}
function action(){
    $(".preferential ul").remove();
    product(1)
    $('.pagination').pagination({
        jump:true,
        total : Pagesize,
        onJump: function (index) {
            // product(index)
            $(".preferential").eq(0).html(product(index));
        }
    });
}

function actionType(id){
    $(".preferential ul").remove();
    SelectProdutById(1,id);
    $('.pagination').eq(0).pagination({
        total : Pagesize,
        onJump: function (index) {
            $(".preferential").eq(0).html(SelectProdutById(index,id));
        }
    });
}


$(
    function () {
        action();
        size_shop();
        leftScroll();
        slide();
        findType();
    }
)

$(document).ready(function () {
    $("#content .main .new ul li").hover(function () {
        $(this).addClass("l_hover")
    }, function () {
        $(this).removeClass("l_hover")
    })

    $(function () {
        $("#slider").nivoSlider()
    })


    $(".remen ul li").hover(function () {
        var liPath = $(this).attr("title")
        $(this).find("img").attr("src", liPath)
    }, function () {
        var imgTitle = $(this).find("img").attr("title")
        $(this).find("img").attr("src", imgTitle)
    })


    $("#content .main .c_nav ul.img_nav li h3").hover(function () {
        $(this).addClass("h_hover")
    }, function () {
        $(this).removeClass("h_hover")
    })

    $("#content .main .preferential ul li").hover(function () {
        $(this).find("h4").css("color", "#f0145c")
    }, function () {
        $(this).find("h4").css("color", "#1c1c1c")
    })
    return false;

})

function show() {
    /*html.style.overflow="hidden";*/
    div1.style.display = "block";//设置层1显示
    /*body.style.overflow="hidden";*/
    div2.style.display = "block";//设置层2的显示
}


//关闭显示
function closeShow() {
    div1.style.display = "none";
    div2.style.display = "none";
    /*html.style.overflow="auto";
    body.style.overflow="auto";*/
}

function name_onfocus() {
    document.getElementById("mz").style.display = "none";
}

function name_onblur() {
    document.getElementById("mz").style.display = "block";
}

function pws_onfocus() {
    document.getElementById("mm").style.display = "none";

}

function pws_onblur() {
    document.getElementById("mm").style.display = "block";
}

function over(k) {
    document.getElementById(k).style.borderColor = "#f0145c";
}

function out(k) {
    document.getElementById(k).style.borderColor = "";
}

