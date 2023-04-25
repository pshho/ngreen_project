window.onload = function(){
    let text = document.querySelector("h1");

    // window객체 scroll이벤트
    window.addEventListener('scroll', function(){
        let value = this.window.scrollY;
        
        if(value > 200){
            text.style.animation = "back_slide 1s ease-out forwards";
        }else{
            text.style.animation = "go_slide 1s ease-out";
        }
    });
}