// const targetLink = document.querySelectorAll('.tab_menu a');
// const tabContent = document.querySelectorAll('#tabContent>div');


// targetLink.forEach(function(link){

//     link.addEventListener('click',function(e){

//         e.preventDefault();
//         let orgTarget = e.target.getAttribute('href');
//         let tabTarget = orgTarget.replace("#","");
        
//         tabContent.forEach(function(content){
//             content.style.display = "none";
//         });
        
//         document.getElementById(tabTarget).style.display="block";
        
//         targetLink.forEach(function(link2){
//             link2.classList.remove('active');
//         });
//             e.target.classList.add('active');

        
//     });

// });

$(function(){

    $('.tab_menu a').click(function(){
        // let orgTarget = e.target.getAttribute('href');
        let orgTarget = $(this).attr('href');
        // alert(orgTarget);
        $('#tabContent>div').hide();

        $(orgTarget).show(); // id선택자로 인식
        $('.tab_menu a').removeClass('active');
        $(this).addClass('active');

        return false;
        // e.preventDefault();
    });

});