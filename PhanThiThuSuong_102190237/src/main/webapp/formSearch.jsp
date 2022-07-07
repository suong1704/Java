<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="searchNhanVien" method='post'>
 		<h3>Search</h3>
        <table border="0">
           
            <tr><input type="radio" name="search" value="IDNV" >IDNV<tr>
            <tr><input type="radio" name="search" value="HOTEN"  >HOTEN<tr>
            <tr><input type="radio" name="search" value="DIACHI" >DIACHI<tr>
            <tr>
              
                <td><input type="text" size="20" name="name"></td>
            </tr>
            
                <td colspan="1"><input type="submit" value="OK">
                <input type="reset"  value="reset"></td>
            </tr>
        </table>


    </form>
</body>
</html>