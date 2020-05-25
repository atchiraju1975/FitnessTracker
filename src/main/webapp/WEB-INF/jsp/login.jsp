<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title> Fitness Tracker Custom Login</title>
    <style type = "text/css">
        .errorblock {
        color: #ff0000;
        background-color: #ffeeee;
        border: 3px solid #ff0000;
        padding: 8px;
        margin: 16px;
        }
    </style>
</head>
<body onload='document.f.j_username.focus();'>
<h3>Fitness Tracker Custom Login Page</h3>
<c:if test="${not empty error}">
    <div class="errorblock">
        Your Login Was Unsuccessful. <br/>
        Caused: ${sessionScope[SPRING_SECURITY_LAST_EXCEPTION].message}
    </div>
</c:if>
<form action="j_spring_security_check" name="f" method="post">
    <table>
        <tr>
            <td>user:</td>
            <td><input type="text" name="j_username" value=""</td>
        </tr>
        <tr>
            <td>password:</td>
            <td><input type="password" name="j_password"></td>
        </tr>
        <tr>
            <td clospan="2"><input type="submit" name="Submit" value="Submit"></td>
        </tr>
        <tr>
            <td clospan="2"><input type="reset" name="reset"></td>
        </tr>
    </table>

</form>
</body>
</html>