const targetLink = document.querySelectorAll('.tab_menu a');
const tabContent = document.querySelectorAll('#tabContent>div');

// targetLink 배열을 forEach로 순회
targetLink.forEach(function(link){

    link.addEventListener('click',function(e){
        e.preventDefault(); // 링크금지
        let orgTarget = e.target.getAttribute('href');
        // 클릭(e.target) - this로 변경 가능
        // getAttribute - href, src 속성값을 읽어옴
        // alert(orgTarget); #tabs1,#tabs2,#tabs3
        let tabTarget = orgTarget.replace("#","");
        // #tabs1 에서 #을 빈문자열로 대체 -> tabs1
        // alert(tabTarget);

        // 모든 tabContent를 안보이게 설정
        tabContent.forEach(function(content){
            content.style.display = "none";
        });
        // 클릭한 탭만 보이게 설정
        document.getElementById(tabTarget).style.display="block";
    });

});