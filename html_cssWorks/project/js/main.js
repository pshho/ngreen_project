$(function () {
    $("#introD ul li:nth-of-type(4)").click(function () {
        alert("https://www.naver.com/")
        /* $(".mail").attr({'href': 'https://www.naver.com/',
                         'href': 'https://www.google.com/'}); */
    });
});

$(function () {
    $("section h2:eq(0)").click(function () {
        $(this).toggleClass('on');
        $("#aboutIntro").toggle();
    });

    $("section h2:eq(1)").click(function () {
        $(this).toggleClass('on');
        $("#careerD").toggle();
    });

    $("section h2:eq(2)").click(function () {
        $(this).toggleClass('on');
        $("#skillD").toggle();
    });
});