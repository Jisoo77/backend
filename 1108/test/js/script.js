$(function(){

    $('.sub').hide();
    $('.m_menu>li>a').click(function(){
        if($(this).next('.sub').css('display')=='none'){
            $('.sub').slideUp();
            $(this).next('.sub').slideDown();
        }else{
            $(this).next('.sub').sldeUp();
        }
        return false;
    });

});