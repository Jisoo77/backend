const targetLink = document.querySelectorAll('#tab_menu a');
const tabContent = document.querySelectorAll('.tabcontent>div');

targetLink.forEach(function(link){

    link.addEventListener('click',function(a){

        a.preventDefault();
        let orgTarget = a.target.getAttribute('href');
        // alert(orgTarget);
        let tabTarget = orgTarget.replace("#","");
        // alert(tabTarget);

        tabContent.forEach(function(content){
            content.style.display = "none";
        });

        document.getElementById(tabTarget).style.display="block";

        targetLink.forEach(function(link2){
            link2.classList.remove('active');
        });
            a.target.classList.add('active');

    });

});