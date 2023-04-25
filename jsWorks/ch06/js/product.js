// 이미지에 마우스 갖다 대면 변경
let bigPic = document.querySelector("#cup");
let smallPics = document.querySelectorAll(".small");

for(let i=0; i<smallPics.length; i++){
    smallPics[i].addEventListener("mouseover", function(){
        bigPic.setAttribute("src", this.src);
    });
}

// 상세 설명 보기
let view = document.querySelector("#view");
let detail = document.querySelector("#detail");

// 토글 프로그래밍
let sw = true;

view.addEventListener("click", function(){
    if(sw){
        view.innerHTML = "상세 설명 닫기";
        detail.style.display = "block";

        sw = false;
    }else{
        view.innerHTML = "상세 설명 보기";
        detail.style.display = "none";

        sw = true;
    }
})