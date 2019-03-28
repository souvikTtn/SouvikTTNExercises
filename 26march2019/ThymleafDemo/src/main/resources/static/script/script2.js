$(document).ready(function () {
    $("#clickMe").click(function (e) {
        //e.preventDefault();
        $.ajax({
            type:'GET',
            url:"/questions/getTime",
            success: function (data) {
                console.log(data)
                $("body").append(data);
                /*$("body").append("<p th:text='${serverTime}'/>");*/
               /* $("body").append("<p th:text='${serverTime}'>"+"hello world"+"</p>")*/
                alert("success");
              //  document.write(data);
            }
        })
    })
})