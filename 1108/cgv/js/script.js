$(function(){

    var swiper = new Swiper('.mySwiper',{
        slidesPerView:3,
        spaceBetween:30,
        navigation:{
            nextEl:'.swiper-button-next',
            prevEl:'.swiper-button-prev',
        },
        autoplay:true,
    });

    $('.btn_eventCntrol').click(function(){
        if($(this).hasClass('on')==false){
            $(this).addClass('on');
            swiper.autoplay.stop();
        }else{
            $(this).removeClass('on');
            swiper.autoplay.start();
        }
        return false;
    });


    var num=0; //슬라이드 증가번호
    var list_w = 1010; // (그림 한장크기 170 + 32 마진 )*5
    // alert(list_w);
    
    $('.next').click(function(){
        if(num==3) return;
        num++;
        $('.listWrap').stop().animate({'margin-left':-list_w*num},500);
        return false;
    });
    $('.prev').click(function(){
        if(num==0) return;
        num--;
        $('.listWrap').stop().animate({marginLeft:-list_w*num},500);
        return false;
    });

    $('.specialHall_list li').mouseenter(function(){
        var i = $(this).index();
        // alert(i);
        $('.specialHall_list li').removeClass('on');
        $('.specialHall_list li').eq(i).addClass('on');
        // $(this).addClass('on');
        $('.tapContent a').removeClass('on');
        $('.tapContent a').eq(i).addClass('on');
    });



});