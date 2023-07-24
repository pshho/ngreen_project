function checkId() {
	let mid = $('#mid').val();

	$.ajax({
		type: "post",
		url: "http://localhost:8080/checkid",
		dataType: "text",
		data: { id : mid },
		success: function(data) {
			if ($.trim(data) == "usable") {
				$("#btnChk").val("Y")
				$('#checked').text("사용 가능한 ID 입니다.")
							 .css('color', 'blue');
			} else {
				$('#checked').text("이미 가입된 ID 입니다.")
							 .css('color', 'red');
			}
			
			// $('#cch').val("good");
			
		},
		error: function() {
			alert('확인할 수 없는 아이디입니다.');
		}
	});
}