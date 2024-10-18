var list = document.querySelector('.banner');
var listLi = document.querySelectorAll('.banner li');
var show_num = 1;
var total = 5;
var li_width = document.querySelector('.banner li').offsetWidth;
var prev = document.querySelector('.prev');
var stop = document.querySelector('.stop');
var start = document.querySelector('.start');
var next = document.querySelector('.next');

// alert(li_width); 2160

var copyobj = listLi[0].cloneNode(true);
list.append(copyobj);

var num = 0;
next.addEventListener('click',function(){
    if(num==5){
        num=0;
        list.style.transition = "none";
        list.style.marginLeft = "0px";
    }

    setTimeout(function(){
        num++;
        list.style.transition = "margin-left 0.5s";
        list.style.marginLeft = -li_width * num+"px";
    },50);
});

prev.addEventListener('click',function(){
    if(num==0){
        num=5;
        list.style.transition = "none";
        list.style.marginLeft = -li_width * num+"px";
    }

    setTimeout(function(){
        num--;
        list.style.transition = "margin-left 0.5s";
        list.style.marginLeft = -li_width * num+"px";
    },50);
});

function autoplay(){
    if(num==5){
        num=0;
        list.style.transition = "none";
        list.style.marginLeft = "0px";
    }

    setTimeout(function(){
        num++;
        list.style.transition = "margin-left 0.5s";
        list.style.marginLeft = -li_width * num+"px";
    },50);
}
let play = setInterval(autoplay,3000);

stop.addEventListener('click',function(){
    clearInterval(play);
});


// play = setInterval(autoplay,3000);