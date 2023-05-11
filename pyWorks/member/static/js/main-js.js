window.onload = function () {
    // 디지털 시계
    if (window.location.href == 'http://127.0.0.1:5000/') {
        setInterval(setWatch, 1000);
    }

    function setWatch () {
        let date = new Date();
        let now = date.toLocaleString();    // 시간 형식
        document.querySelector('#demo').innerHTML = now;
    };

    // 배경 이미지 슬라이드
    // 경로 static부터 시작
    let picture = [
        "../static/images/header1.jpg",
        "../static/images/header2.jpg",
        "../static/images/header3.jpg"
    ];

    let imgIdx = 0;

    function showPicture () {
        let img = document.getElementById('pic');
        img.src = picture[imgIdx]   // 첫 이미지 저장
        imgIdx ++;

        if (imgIdx >= picture.length) {
            imgIdx = 0;
        };

        // 2초 간격으로 showPicture() 호출
        setTimeout(showPicture, 2000);
    }

    showPicture();  // showPicture() 함수 호출
}

