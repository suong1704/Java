<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Tìm kiếm</title>
    <script language="JavaScript">
        function Check() {

            var object= true;
            if(document.getElementById("1").checked == false && document.getElementById("2").checked == false && document.getElementById("3").checked == false)
            {
                object=false;
            }
            var thongtin=document.formFind.thongtin.value;
            if(object==false || thongtin==""){
                alert("Bạn chưa nhập đủ thông tin!");
                return false;
            }
        }
    </script>
</head>
<body>
<form action="findNVServlet" method="post" name ="formFind">
    <div  align="center">
        <h1>Tìm Kiếm Nhân Viên</h1>
        <table border="0">
            <tr>
                <td>
                    <input name="object" type="radio" value="IDNV" id="1">IDNV
                    <input name="object" type="radio" value="HOTEN" id="2">Họ tên
                    <input name="object" type="radio" value="DIACHI" id="3">Địa chỉ
                </td>
            </tr>
            <tr>
                <td><label for="lbThongtin"><b>Nhập thông tin: </b></label></td>
                <td><input type="Text" name="thongtin" ></td>
            </tr>
        </table>
        <input type="submit" name="TimKiem" value="OK"  onclick="Check()">
        <input type="reset" name="reset" value="Reset">
    </div>

</form>
</body>
</html>