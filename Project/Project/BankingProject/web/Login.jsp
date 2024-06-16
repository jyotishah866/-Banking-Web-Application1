
<html>
    
    <body bgcolor="Yellow">
        <form action="Check.jsp" method="post">
            
            <table border="5" align="center">
                
                <tr>
                    <td>Select Role</td>
                    
                    <td>
                        
                        <select name="role">
                            <option value="select"> Select </option>
                            <option value="admin"> Admin </option>
                            <option value="customer"> Customer </option>
                        </select>
                        
                        
                    </td>
                   
                </tr>
                <tr>
                    <td>LoginID</td>
                    <td><input type="text" name="loginid"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="text" name="loginpassword"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="b1" value="Login"</td>
                    <td><input type="reset" name="b1" value="Reset"</td>
                </tr>
                <tr>
                    <td></td>
                    <td><a href="ForgetPassword.jsp">Forgot Password</a></td>
                </tr>
                
            </table>
            
        </form>
       
    </body>
</html>
