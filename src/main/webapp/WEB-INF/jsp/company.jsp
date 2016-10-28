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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/css/pickmeup.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-migrate-1.2.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/dist/pickmeup.min.js"></script>
    <script type="text/javascript">
        $(function () {

//            $("#date").click(function(){
//                pickmeup('.date', {
//                    format  : 'Y-m-d'
//                });
//                //alert(this.value);
//            });

        });
    </script>
</head>
<body>
<table align="center">
    <form action="${pageContext.request.contextPath}/addCompany" method="get" id="addCompany" >
        <tr><td colspan="2"></td></tr>
        <tr>
            <td>
                地址：
                <input id="address" name="address" size="18" maxlength="20"/>
            </td>
        </tr>
        <tr>
            <td>
                date：
                <input id="date" name="date"  size="18"/>
                <div class="date" data-pmu-format="Y-m-d"></div>
            </td>
        </tr>
        <tr>
            <td>
                name：
                <input id="name" name="name" size="18"/>
            </td>
        </tr>
        <tr>
            <td>
                number：
                <input id="number" name="number" size="18"/>
            </td>
        </tr>
        <tr>
            <td>
                tel：
                <input id="tel" name="tel" size="18"/>
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
