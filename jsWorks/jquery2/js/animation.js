$(document).ready(function () {
    $("button:eq(0)").click(function () {
        $(".m0").animate({ left: 500 }, "fast", "swing")
            .animate({ left: 0 }, "slow", "swing");
    });
});

$(document).ready(function () {
    $("button:eq(1)").click(function () {
        // 이동할 때는 오른쪽으로 500px 만큼 이동하고
        // 돌아올 때는 텍스트 애니메이션 함께 수행
        $(".m1").animate({ left: 500 }, "fast", "swing")
            .animate({ left: 0 }, "slow", "swing", function () {
                // find()는 선택한 요소의 자식 요소 선택
                $(this).find('span').animate({ top: 10 }, "fast", "swing")
                    .delay(1000).slideUp();
            });
    });
});

$(document).ready(function () {
    $('button:eq(2)').click(function () {
        $('.m2').animate({ width: "toggle" }, "fast", "swing");
    });
});