$(function(){

    var gap = 103

    var top1 = $('.area1').offset().top;
    var top2 = $('.area2').offset().top;
    var top3 = $('.area3').offset().top;
    var top4 = $('.area4').offset().top;
    var top5 = $('.area5').offset().top;
    console.log(top1,top2,top3,top4,top5);
    // 103 803 1503 2203 2903

    $(window).scroll(function(){
        var sct = $(this).scrollTop();
        
        // $('.s_top').text(sct);

        if(sct < top2 - gap){
            $('.area1').addClass('on');
        }else if(sct < top3 - gap){
            $('.area2').addClass('on');
        }else if(sct < top4 - gap){
            $('.area3').addClass('on');
        }else if(sct < top5 - gap){
            $('.area4').addClass('on');
        }else if(sct < top5){$('.area5').addClass('on');}

        // if(sct>=200){$('.area2').addClass('on');}
        // if(sct>=780){$('.area3').addClass('on');}
        // if(sct>=1400){$('.area4').addClass('on');}
        // if(sct>=2150){$('.area5').addClass('on');}

    });
    $(window).trigger('scroll');
    // 컴퓨터가 시작하자마자 한번 스크롤해줌

});