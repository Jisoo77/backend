$(function(){

    var num=0;
    var list_w = ($('.slideBox').width()+32.5)*5;
    // alert(list_w);
    $('.next').click(function(){
        if(num==3){
            num=0;
            $('.listWrap').css('margin-left','0');
        }
        num++;
        $('.listWrap').stop().animate({marginLeft:-list_w*num},500);
        return false;
    });
    $('.prev').click(function(){
        if(num==0){
            num=3;
            $('.listWrap').css('margin-left',-list_w*num);
        }
        num--;
        $('.listWrap').stop().animate({marginLeft:-list_w*num},500);
        return false;
    });

});