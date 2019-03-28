$(function () {
    $("#loaderImg").hide();

    $("#userLogin").submit(function (e) {
        e.preventDefault();
        var formData=$(this);
        $(this).serialize();
        $.ajax({
            method:"POST",
            url:"/questions/q10",
            data:formData.serialize(),
            success:function (data) {
                alert("sucess");
                $("#loaderImg").hide();
                console.log(data);
                $("#response").append(data);
            }

        })
    })

    $(document).ajaxStart(function () {
        $("#loaderImg").show();
    })
})