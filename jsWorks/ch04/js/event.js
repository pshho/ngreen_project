let num=0;
function click1(){
    if(num==0){
        document.getElementById("exp1").innerHTML = "설명글 숨기기";
        document.getElementById("wrap2").style.display = "block";

        num=1;
        console.log(num);
    }else{
        document.getElementById("exp1").innerHTML = "설명글 보이기";
        document.getElementById("wrap2").style.display = "none";

        num=0;
        console.log(num);
    }
}
function click2(){
    document.getElementById("wrap3").style.display = "block";
    document.getElementById("exp2").style.display = "none";
    document.getElementById("exp3").style.display = "block";
}
function click3(){
    document.getElementById("wrap3").style.display = "none";
    document.getElementById("exp2").style.display = "block";
    document.getElementById("exp3").style.display = "none";
}