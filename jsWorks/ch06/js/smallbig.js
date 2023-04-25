// 이미지 바꾸기

let bigPic = document.querySelector("#cup");
let smallPics = document.querySelectorAll(".small");
// console.log(smallPics.length);

// 클릭 이벤트 발생
for(let i=0; i<smallPics.length; i++){
    // smallPics[i].onclick = showBig; // showBig() 호출
    // addEventListener 이벤트 처리기(접두어 'on' 생략)
    smallPics[i].addEventListener("mouseover", function(){
        bigPic.setAttribute("src", this.src);
    });
}

/* function showBig(){
    bigPic.setAttribute("src", this.src); // 클릭한 대상(자기 자신)
    // console.log(this.src);
} */