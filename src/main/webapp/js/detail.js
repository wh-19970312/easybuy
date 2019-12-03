
var string = window.location.search.split("=")[1];

function product(id){
    $.getJSON("productType/detail.do","id="+id,callback);
    function callback(data) {
        $("[name='product_name']").val(data.name);
        $("[name='product_price']").val(data.price);
        $("[name='number']").val(data.stock);
        $(".jin2-right ul li a:first").src("order.html?id="+data.id);
        $(".jin2-right ul li a:eq(1)").src("cart.html?id="+data.id)

    }
}
$(function () {
     product(string);
    $(".zoom").jqzoom();
  
});
