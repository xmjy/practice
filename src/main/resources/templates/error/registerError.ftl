<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册错误页面</title>
    <script src="/static/js/jquery.min.js"></script>
</head>
<body>
<a href="/51/page/toRegisterPage" id="backPage">${message}...3秒后跳转回注册页面</a>
<script>
    $(function () {
        setTimeout('window.location.href="/51/page/toRegisterPage"',3000);
    });

    var count = 3;

    var interval = setInterval('changeText()',1000);

    var changeText = function change() {
        count > 0 ? count-- : clearInterval(interval);
        $("#backPage").text("${message}..."+count+"秒后跳转回注册页面");
    }
</script>
</body>
</html>