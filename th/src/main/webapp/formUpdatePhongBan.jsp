<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page language="java" import="model.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Update Phong Ban</title>
</head>
<body>	<% 
		phongban pb=(phongban)request.getAttribute("pb");
		%>
	    <form action="updatePhongBan" method='post'>
        <table border="0">
            <tr>
                <td>IDPB</td>
                <td><input type="text" size="20" name="IDPB" readonly value=<%=pb.getIDPB() %>></td>
            </tr>
            <tr>
                <td>Ten Phong Ban</td>
                <td><input type="text" size="20" name="TENPB" value=<%=pb.getTENPB() %>></td>
            </tr>
            <tr>
                <td>Mo Ta</td>
                <td>
                    <input type="text" size="20" name="MOTA" value=<%=pb.getMOTA() %>>
                </td>
            </tr>
            <tr>
                <td colspan="1"><input type="submit" value="OK">
                <input type="reset"  value="reset"></td>
            </tr>
        </table>


    </form>
</body>
</html>