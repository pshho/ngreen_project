// 디지털 시계
setInterval(setWatch, 1000);

function setWatch() {
    const date = new Date();
    let timer = document.querySelector("#demo");
    let now = date.toLocaleString();

    timer.innerHTML = now;
}

// 배경 이미지 change
window.onload = function () {
    let picture = ["./images/header1.jpg", "./images/header2.jpg",
        "./images/header3.jpg"]
    let imgIdx = 0;

    showPicture();

    function showPicture() {
        let img = document.querySelector("#pic");
        img.src = picture[imgIdx];
        imgIdx++;

        if (imgIdx == picture.length) {
            imgIdx = 0;
        }

        setTimeout(showPicture, 2000); // 콜백함수
    }
}

