var msg = window.location.search.split("=")[1];
$(
    function () {
        if(msg=="true"){
            alert("添加成功")
        }else if(msg=="false"){
            alert("亲！您的购物车已经有该物品")
        }
    }
)