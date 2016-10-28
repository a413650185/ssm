<%--
  Created by IntelliJ IDEA.
  User: luozhiyun
  Date: 16/10/28
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adduser</title>
    <%@ page isELIgnored="false" %>
</head>
<body>
<table align="center">
    <form action="${pageContext.request.contextPath}/addUser" method="get" id="addUserForm" >
        <tr><td colspan="2"></td></tr>
        <tr>
            <td>
                用户姓名：
                <input id="name" name="username" size="18" maxlength="20"/>
            </td>
        </tr>
        <tr>
            <td>
                用户密码：
                <input id="passWord" name="password" size="18"/>
            </td>
        </tr>
        <tr>
            <td>
                性&nbsp;&nbsp;&nbsp;&nbsp;别：
                <select name="sex" >
                    <option value="0">男</option>
                    <option value="1">女</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input value="提 交" type="submit" id="btn_submit" />
                &nbsp;&nbsp;
                <input value="重 置" type="reset" />
            </td>
        </tr>
    </form>
</table>
</body>
</html>
