window.onload = function(){
    // 체크 박스 속성에 이벤트 처리하기
    let check = document.querySelector("#shippingInfo");

    // 체크 이벤트 구현
    check.addEventListener("click", checkBox);

    let billingName = document.getElementById("billingName");
    let billingTel = document.getElementById("billingTel");
    let billingAddr = document.getElementById("billingAddr");

    let shippingName = document.getElementById("shippingName");
    let shippingTel = document.getElementById("shippingTel");
    let shippingAddr = document.getElementById("shippingAddr");

    function checkBox(){
        if(check.checked === true){
            // 체크시 기본 정보 값을 배송 정보에 저장
            shippingName.value = billingName.value;
            shippingTel.value = billingTel.value;
            shippingAddr.value = billingAddr.value;
        }else{
            // 체크 해제시 check.checked === false 될 때 입력상자 공백
            shippingName.value = "";
            shippingTel.value = "";
            shippingAddr.value = "";
        }
    }
}