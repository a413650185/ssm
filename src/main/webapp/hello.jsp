<%--
  Created by IntelliJ IDEA.
  User: luozhiyun
  Date: 16/10/29
  Time: 00:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ page isELIgnored="false" %>
    <link rel="stylesheet" type="text/css" href="js/css/pickmeup.css"/>
    <script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="js/jquery-migrate-1.2.1.min.js"></script>
    <script type="text/javascript" src="js/dist/pickmeup.min.js"></script>

</head>
<body>
<script type="text/javascript">
    function testjquery()
    {
        pickmeup('.date', {
            format	: 'Y-m-d'
        });
    }
</script>

<input id="test" value="jquery">
<input type="button" value="click me!" onclick="testjquery();">
</body>
</html>
