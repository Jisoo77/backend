$(function(){

    // $('.sub_bar').hede();

    $('.m_bar>li').mouseover(function(){
        $('.sub_bar').stop().slideDown(300);
        $('.after').stop().slideDown(300);
        $('.line2').stop().slideDown(100);
    });
    $('.m_bar>li').mouseleave(function(){
        $('.sub_bar').stop().slideUp(300);
        $('.after').stop().slideUp(300);
        $('.line2').stop().slideUp(100);
    });

});