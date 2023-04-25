// 유효성 검사
/*
    각각 이벤트 함수 생성, id 속성 사용
    id = "user-id" → let id = document.getElementById("user-id")
*/

/*
    name 속성 사용
    let id = document.regForm.id // document.폼이름.name 이름(input)
*/

function checkMember(){
    let form = document.regForm;
    let id = form.uid;
    let mail = form.email;
    let pw1 = form.pw1;
    let pw2 = form.pw2;

    let pw_pat1 = /[0-9]+/;
    let pw_pat2 = /[a-zA-Z]+/;
    let pw_pat3 = /[~!@#$%^&*]+/;

    if(id.value.length < 4 || id.value.length > 12){
        alert("아이디는 4~12자까지 가능합니다.")
        id.select();

        return false;
    }else if(mail.value == ""){
        alert("이메일은 필수 입력 항목입니다.")
        mail.focus();
        
        return false;
    }else if(pw1.value.length < 8 || !pw_pat1.test(pw1.value)
             || !pw_pat2.test(pw1.value) || !pw_pat3.test(pw1.value)){
        alert("비밀번호는 영문자, 숫자 포함 8자 이상입니다.")
        pw1.select();

        return false;
    }else if(pw1.value !== pw2.value){
        alert("비밀번호는 동일해야 합니다.")
        pw2.select();

        return false;
    }else{
        form.submit();
    }
}