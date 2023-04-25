        let score = prompt("점수를 입력해주세요.");
        let grade;
        score = parseFloat(score);

        if(score < 60){
            grade = 'F';
        }
        else if(score < 70 && score >= 60){
            grade = 'D';
        }
        else if(score < 80 && score >= 70){
            grade = 'C';
        }
        else if(score < 90 && score >= 80){
            grade = 'B';
        }
        else if(score <= 100 && score >= 90){
            grade = 'A';
        }
        else{
            document.write("점수를 다시 입력하세요.<br>");
            grade = "'알수없음'";
        }
        document.write("학점은 <span class=gra>" + grade + "</span> 입니다.");