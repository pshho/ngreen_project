let customer = parseInt(prompt("입장객은 몇 명인가요?")); // 입장객 수
let colNum = parseInt(prompt("한 줄에 몇 명씩 앉나요?")); // 열의 수
let rowNum; // 행의 수

// 나머지가 있는지 없는지 처리가 중요
if(/* customer == null || colNum == null */ isNaN(customer) || isNaN(colNum)){
    document.write("<p>입력이 취소되었습니다.</p>");
}
else{
    /* customer = parseInt(customer);
    colNum = parseInt(colNum); */
    if(customer % colNum === 0){
        rowNum = customer / colNum;
        // document.write(rowNum + "개의 줄이 필요합니다.");
    }
    else{
        rowNum = customer / colNum + 1;
        // document.write(rowNum + "개의 줄이 필요합니다.");
    }
}

document.write("<table>");
for(var i=0; i<rowNum; i++){
    document.write("<tr>");
    for(var j=1; j<=colNum; j++){
        var seatNum = colNum * i + j; // 좌석번호
        if(seatNum > customer){ // 좌석번호가 고객수보다 클 때 빠져나옴
            break;
        }
        document.write("<td>좌석" + seatNum + "</td>");
    }
    document.write("</tr>");
}
document.write("</table>");