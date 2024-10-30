$(function(){

var pdt = 0;

    $(window).scroll(function(){
        var sct = $(this).scrollTop();
        // 현재 스크롤 위치(양)
        $('#sTop').text(sct);

        pdt = sct * 0.001;
        if(pdt<=1){
            $('#pdt_basic').css('opacity',pdt);
        }
            $('#pdt_basic').css('transform','rotate('+sct+'deg)');


        if(sct>=100){
            $('nav').addClass('fixed');
        }else{
            $('nav').removeClass('fixed');
        }
        // 스크롤 조금만 내려도 메뉴바 고정

        for(var i=0; i<5; i++){
            if(sct >= $('section>.box').eq(i).offset().top){
                $('.m_menu li').removeClass('on');
                $('.m_menu li').eq(i).addClass('on');
            }
        };
    });

    $('.m_menu li').click(function(){
        var i = $(this).index();
        // 현재 nav에 클릭된 인덱스값
        // alert(i);
        var offset_nav = $('section>.box').eq(i).offset().top;
        // alert(offset_nav);
        $('html,body').stop().animate({scrollTop:offset_nav},500);
        return false;
    });

    $('section>.box').mousewheel(function(event,d){
        console.log(d);
        // 마우스 휠 위로스크롤하면 양수 / 아래스크롤 음수
        if(d>0){ // 휠 위로
            var prev = $(this).prev().offset().top;
            $('html,body').stop().animate({scrollTop:prev},1000);
        }
        if(d<0){ // 휠 아래로
            var next = $(this).next().offset().top;
            $('html,body').stop().animate({scrollTop:next},1000);
        }
    // 한 화면씩 스크롤 하고싶을때
    });

    $('#popup').draggable();

    // $.cookie('pop','no',{expires:1});
    if($.cookie('pop')!='no'){
        $('#popup').show();
    }

    $('#popup area:eq(0)').click(function(){
        $('#popup').fadeOut('fast');
    });
    // 닫기 버튼 클릭하면 popup창을 서서히 사라지게함
    
    $('#popup area:eq(1)').click(function(){
        $.cookie('pop','no',{expires:1});
        $('#popup').fadeOut('fast');
    });
    
    $('#notice_wrap').draggable();

    if($.cookie('popup')=='none'){
        $('#notice_wrap').hide();
    }

    var chk = $('expiresChk');

    $('.closeBtn').on('click',closePop);

    function closePop(){
        if(chk.is(':checked')){ // input창에 checked가 있으면
            $.cookie('popup','none',{expires:3});
            // chk변수가 checked를 가지고있으면 popup에 none을 3일동안 저장해라
        }
        $('#notice_wrap').fadeOut('fast');
    }


});