// 아이템 리스트
let itemList = [];

let form = document.regForm;
form.addEventListener("submit", function(e){
    e.preventDefault();
})

let addBtn = document.querySelector("#add");
addBtn.addEventListener("click", addList);

let addEnter = document.querySelector("input");
addEnter.addEventListener("keypress", function(e){
    if(e.code === "Enter"){
        addList();
    }
})

// 아이템 추가 함수
function addList(){
    // item은 itemList에 push()로 저장(입력)
    let item = document.querySelector("#item").value;
    itemList.push(item);

    showList();
    document.querySelector("#item").value = ""; // 기존 입력 내용 초기화
    document.querySelector("#item").focus(); // 커서의 위치 다시 입력창으로
}

function showList(){
    // document.querySelector("#itemList").innerHTML = itemList[0];
    let list = "<ul>"; // 목록 리스트 변수
    for(let i=0; i<itemList.length; i++){
        // 아이템 배열 출력
        // document.querySelector("#itemList").innerHTML = itemList[i];
        list += "<li>" + itemList[i] + "<span class='close' id=" + i + ">X</span></li>";
    }
    list += "</ul>"
    document.getElementById("itemList").innerHTML = list;

    // 아이템 삭제(X 선택)
    let removeList = document.querySelectorAll(".close");

    // 'X'를 클릭했을 때 삭제 이벤트가 발생함
    for(let i=0; i<removeList.length; i++){
        removeList[i].addEventListener("click", remove);
    }

    function remove(){
        // console.log(this); // 클릭 이벤트가 일어난 대상

        let id = this.getAttribute("data-id"); // id값 가져옴

        itemList.splice(id, 1); // 해당 위치에서 1개 삭제

        // 목록 보기
        showList();
    }
}
