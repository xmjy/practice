<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
    <script src="/static/js/jquery.min.js"></script>
    <script src="/static/js/jquery.md5.js"></script>
    <style>
        .default{
            display: none;
        }
    </style>
</head>
<body>
    <span>登录页面</span><br>
    <form action="/51/login/loginIn" method="post">
        <input type="text" name="userName" placeholder="用户名" autocomplete="off"><br>
        <input type="password" name="password" id = "password" placeholder="密码" autocomplete="off"><br>
        是否记住密码：<input type="radio" name="rememberPassword" value="0" onclick="hiddenSelect()" checked>否
        <input type="radio" name="rememberPassword" value="1" onclick="showSelect()">是<br>
        <div class="default" id="toShow">
            希望本网站记住该密码多久：
            <select name="manyDays" id="manyDays">
                <option value="-1" selected>不保存</option>
                <option value="1">1天</option>
                <option value="3">3天</option>
                <option value="5">5天</option>
                <option value="7">7天</option>
            </select><br>
        </div>
        <input id="code" placeholder="验证码（不区分大小写）" type="text" class=""
               style="width:170px" name="code" required maxlength="4" autocomplete="off">
        <!-- 验证码 显示 -->
        <img onclick="javascript:getCode()" id="verifyimg" style="margin-left: 20px;"/><br>
        <button type="submit" onclick="encodePassword()">登录</button>
    </form>
    <img id="testGraphics" onclick="getVerifyCode()"/>
    <a href="/51/page/toRegisterPage">去注册页面</a>
    <script>
        $(function () {
            getCode();
            getVerifyCode();
        });
        function encodePassword() {
            let passValue = $("#password").val();
            let md5Password = $.md5(passValue);
            $("#password").val(md5Password);
        }

        function showSelect() {
            $("#toShow").removeClass("default");
        }
        
        function hiddenSelect() {
            $("#toShow").addClass("default");
        }

        /**
         * 获取验证码
         * 将验证码写到login.html页面的id = verifyimg 的地方
         */
        function getCode() {
            document.getElementById("verifyimg").src = timestamp("http://localhost:8088/verifyCode/verifyCodeBySelf");
        }

        function getVerifyCode() {
            document.getElementById("testGraphics").src = timestamp("http://localhost:8088/testGraphics?imageType=1");
        }
        //为url添加时间戳
        function timestamp(url) {
            var getTimestamp = new Date().getTime();
            if (url.indexOf("?") > -1) {
                url = url + "&timestamp=" + getTimestamp
            } else {
                url = url + "?timestamp=" + getTimestamp
            }
            return url;
        };
    </script>
</body>
</html>