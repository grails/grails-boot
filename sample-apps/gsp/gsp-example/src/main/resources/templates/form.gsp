<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <body>
        <form:form commandName="${person}" method="post">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><form:input path="name" /></td>
                    <td><form:errors path="name" /></td>
                </tr>
                <tr>
                    <td>Age:</td>
                    <td><form:input page="age" /></td>
                    <td><form:errors path="age" /></td>
                </tr>
                <tr>
                    <td><button type="submit">Submit</button></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
