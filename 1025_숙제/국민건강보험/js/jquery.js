$(function(){

    var pop_prev = $('.prev');
    var pop_next = $('.next');
    var pop_pause = $('.pause');

    var popCurrent = 0;
    var popIndex = 0;
    var total = $('.slide_img li').length

    pop_next.click(function(){
        popIndex = popCurrent+1;
        if(popIndex==total) popIndex = 0;
        var pop_cu = $('.slide_img li').eq(popCurrent); // 현재사진
        var pop_ne = $('.slide_img li').eq(popIndex); // 다음에 올 사진

        pop_cu.css('left',0).stop().animate({'left':'-100%'});
        pop_ne.css('left','100%').stop().animate({'left':'0%'});
        popCurrent=popIndex;
        $('.slide_top p strong').text(popIndex+1);
    });
    pop_prev.click(function(){
        popIndex = popCurrent-1;
        if(popIndex == -1) popIndex = total-1;
        var pop_cu = $('.slide_img li').eq(popCurrent); // 현재사진
        var pop_ne = $('.slide_img li').eq(popIndex); // 다음에 올 사진

        pop_cu.css('left',0).stop().animate({'left':'100%'});
        pop_ne.css('left','-100%').stop().animate({'left':'0%'});
        popCurrent = popIndex;
        $('.slide_top p strong').text(popIndex+1);
    });

    var id;
    id = setInterval(popAuto,3000);

    function popAuto(){
        pop_next.trigger('click');
    }

    pop_pause.click(function(){
        if($(this).hasClass('on')==false){
            $(this).addClass('on');
            clearInterval(id);
        }else{
            $(this).removeClass('on');
            id = setInterval(popAuto,3000);
        }
    });

});