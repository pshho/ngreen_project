// 디지털 시계
window.onload = function () {
    setInterval(setWatch, 1000);

    function setWatch () {
        let date = new Date();
        let now = date.toLocaleString();    // 시간 형식
        document.querySelector('#demo').innerHTML = now;
    };
}