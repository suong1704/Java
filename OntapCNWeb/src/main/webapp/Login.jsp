<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Login</title>
    <script language="JavaScript">
        function Check() {
            var username=document.formLogin.username.value;
            var password=document.formLogin.password.value;
            if(username=="" || password==""){
                alert("Bạn chưa nhập đủ thông tin!");
                return false;
            }
        }
    </script>
    <style>
        h1{
            display: block;
            text-align: center;
        }
        .input{
            margin: 10px 0;
            text-align: center;
        }
    </style>

</head>
<body bgcolor="#e0ffff">
<form action="CheckLoginServlet" method="post" name="formLogin" target="">
    <h1>Login</h1>
    <div class="input">
        <label for="Username"><b>Username</b></label>
        <input type="text" placeholder="Username" name="username" id="Username">
    </div>
    <div class="input">
        <label for="Password"><b>Password</b></label>
        <input type="password" placeholder="******" name="password" id="Password">
    </div>
    <div class="input">
        <input type="submit" name="Login" value="Login" onclick="Check()">
        <input type="reset" name="reset" value="Reset">
    </div>
</form>
</body>
</html>