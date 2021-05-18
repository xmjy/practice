<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册页面</title>
    <script src="/static/js/jquery.min.js"></script>
    <script src="/static/js/jquery.md5.js"></script>
    <script src="/static/js/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
    <span>注册页面</span><br>
    <form action="/51/login/register" method="post">
        <i style="color: red">*</i><input type="text" name="userName" placeholder="请输入用户名"><br>
        <i style="color: red">*</i><input type="text" name="userNickname" placeholder="请输入用户昵称"><br>
        <i style="color: red">*</i><input type="password" name="userPassword" id = "password" placeholder="请输入密码"><br>
        &nbsp;<input type="radio" name="userGender" value="0"> 男
        &nbsp;<input type="radio" name="userGender" value="1"> 女<br>
        &nbsp;<input type="text" name="userAge"  placeholder="请输入年龄"><br>
        &nbsp;<input type="text" name="userBirthDay" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" autocomplete="off" placeholder="请输入你的出生日期"><br>
        &nbsp;<input type="text" name="userBirthAddress"  placeholder="请输入你的出生地点"><br>
        &nbsp;<button type="submit" onclick="encodePassword()">注册</button>
    </form>
    <a href="/51/page/toLoginPage">去登录页面</a>
    <script>
        function encodePassword() {
            let passValue = $("#password").val();
            let md5Password = $.md5(passValue).toUpperCase();
            $("#password").val(md5Password);
        }
    </script>
</body>
</html>