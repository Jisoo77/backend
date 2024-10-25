$(function(){

    var clone = $('.sg li').eq(0).clone();
    $('.sg ul').append(clone);

    var i = 0;

    $('.dot a').click(function(){
        i = $(this).index();
        $('.sg ul').stop().animate({'margin-left':-i*100+'%'},600);
        $('.dot a').removeClass('on');
        $(this).addClass('on');
    });

    function timer(){
        if(i == 4){
            i=0;
            $(".sg ul").css("margin-left",0);
        }
        i++;
        $(".sg ul").stop().animate({
            "margin-left":-i*100+"%"
        },600);
        if(i==4){
            $(".dot a").removeClass("on");
            $(".dot a").eq(0).addClass("on");
        }else{
            $(".dot a").removeClass("on");
            $(".dot a").eq(i).addClass("on");
        }
    }

    var id = setInterval(timer, 3000);
    $('.section01').mouseover(function(){
        clearInterval(id);
    });
    $('.section01').mouseleave(function(){
        id = setInterval(timer, 3000);
    });


});