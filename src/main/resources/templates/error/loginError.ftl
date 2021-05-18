<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录错误页面</title>
    <script src="/static/js/jquery.min.js"></script>
</head>
<body>
<a href="/51/page/toLoginPage" id="toLoginPage">${message}......3秒后跳转回登录页面......</a>
<script>
    $(function(){
        setTimeout('window.location.href="/51/page/toLoginPage"',3000);
    });
    var count = 3;

    var countNum = setInterval('writeText()',1000);

    function writeText() {
        count > 0 ? count-- : clearInterval(countNum); // clearInterval() 清楚定时任务（你调我，我清你）
        $("#toLoginPage").text("${message}......"+count+"秒后跳转回登录页面......");
    }
</script>
</body>
</html>