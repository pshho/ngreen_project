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

    $("section h2:eq(3)").click(function () {
        $(this).toggleClass('on');
        $("#portpolioD").toggle();
    });
});

$(function () {
    $("#menu").click(function() {
        $(".content").slideToggle();
    });
});