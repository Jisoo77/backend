$(function(){

    var num=0;
    var list_w = ($('.slideBox').width()+32.5)*5;
    // alert(list_w);
    $('.next').click(function(){
        num++;
        $('.listWrap').stop().animate({marginLeft:-list_w*num},500);
        return false;
    });

});