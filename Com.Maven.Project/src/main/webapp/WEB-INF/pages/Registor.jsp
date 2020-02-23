<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Registration</title>
        </head>
        <body>
      
            <form:form id="Registor" modelAttribute="user" action="RegistrationProces" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <label>Name:</label>
                        </td>
                        <td>
                            <form:input type = "text" path="name" name="name" id="name" />
                        </td>
                    </tr>
                   
                   <tr>
                        <td>
                            <label>Username</label>
                        </td>
                        <td>
                            <form:input path="username" name="username" id="username" />
                        </td>
                    </tr>
                   
                   
                    <tr>
                        <td>
                            <label>Password</label>
                        </td>
                        <td>
                            <form:password path="password" name="password" id="password" />
                        </td>
                    </tr>
                  
                  <%--  
                    <tr></tr> --%>
                    <tr>
                        <td>
                            <label>Email</label>
                        </td>
                        <td>
                            <form:input path="emailId" name="emailId" id="emailId" />
                        </td>
                    </tr>
                   
                   <tr>
                        <td>
                            <label>Phone</label>
                        </td>
                        <td>
                            <form:input path="mobileNumber" name="mobileNumber" id="mobileNumber" />
                        </td>
                    </tr>
                    
                  
                   <%--  <tr>
                        <td>
                            <label >Created Date</label>
                        </td>
                        <td>
                            <form:input path="createdDate" name="createdDate" id="createdDate" />
                        </td>
                    </tr>
                   
                   
                   <tr>
                        <td>
                            <label>Last Update</label>
                        </td>
                        <td>
                            <form:input path="lastUpdate" name="lastUpdate" id="lastUpdate" />
                        </td>
                    </tr> --%>
                  
                   <tr>
                        <td></td>
                        <td>
                            <form:button type="submit" id="Registor" name="Registor">Register</form:button>
                        </td>
                    </tr>
                   
                    <tr>
                        <td></td>
                        <td><a href="Login">Back To Login Page</a>
                        </td>
                    </tr>
                </table>
            </form:form>
      
      
      
        </body>
        </html>