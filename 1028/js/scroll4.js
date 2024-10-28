$(function(){
    $(window).scroll(function(){
        var sct = $(this).scrollTop();
        // 마우스 세로 스크롤의 값(양)을 구해서 sct에 저장
        $('.s_top').text(sct);
        // 구해진 스크롤값을 실시간으로 .s_top반영
        
        if(sct>=450 && sct<=1200){
            $('.left1').addClass('on');
        }else{
            $('.left1').removeClass('on');
        }
        // .left1 450~2000사이에 class on을 주어 나타나게하고 그외에는 class on을 삭제 사라지게 한다.

        if(sct>=1000 && sct<=2000){
            $('.right1').addClass('on');
        }else{
            $('.right1').removeClass('on');
        }

        if(sct>=2500){
            $('.s4_cover div').addClass('active');
        }
    });
});