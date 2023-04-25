$(document).ready(function () {
    $("a").click(function () {
        $("#wrap2").toggle();
    });
    $("#exp2").click(function () {
        $("#wrap3").show();
        $("#exp2").hide();
        $("#exp3").show();
    });
    $("#exp3").click(function () {
        $("#wrap3").hide();
        $("#exp2").show();
        $("#exp3").hide();
    });
});