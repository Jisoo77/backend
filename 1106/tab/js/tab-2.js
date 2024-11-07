$(function(){

    $('.tab_menu a').click(function(){
        let orgTarget = $(this).attr('href');
        $('#tabContent>div').hide();
        $('.tab_menu a').removeClass('active');
        $(this).addClass('active');
        $(orgTarget).show();
        return false;
    });

});