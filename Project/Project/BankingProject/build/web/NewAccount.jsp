
<html>

    <body align="center">
        <h1 align="center">New Account Registration</h1>
        <form action="NewAccountDBMS.jsp" method="post" >
            <table>
                <tr>
                    <td class="tagname">Account Number</td>
                    <td><input type="text" name="acno"</td>
                </tr>
                <tr>
                    <td class="tagname">Customer Name</td>
                    <td><input type="text" name="cname"</td>
                </tr>
                <tr>
                    <td class="tagname">Father Name</td>
                    <td><input type="text" name="cfname"</td>
                </tr>
                <tr>
                    <td class="tagname">DOB</td>
                    <td><input type="date" name="cdob"</td>
                </tr>
                <tr>
                    <td class="tagname">Gender</td>
                    <td><input type="text" name="cgender"</td>
                </tr>
                <tr>
                    <td class="tagname">Account Opening Date</td>
                    <td><input type="date" name="opdate"</td>
                </tr>
                <tr>
                    <td class="tagname">Address</td>
                    <td><input type="text" name="cadd"</td>
                </tr>
                <tr>
                    <td class="tagname">Contact Number</td>
                    <td><input type="text" name="ccontact"</td>
                </tr>
                <tr>
                    <td class="tagname"><input type="submit" name="b1" value="SAVE" class="submit"></td>
                    <td class="tagname"><input type="reset" name="b2" value="RESET" class="submit"></td>
                </tr>
            </table>
        </form>
        <style>
            form
            {
                display: flex;
                justify-content: center;
                margin: 52px;
                text-align: center;
                padding: 15px;
                width: 500px;
                margin: AUTO;
                border-radius: 19px;
                background-color: #ccffcc;
            }
            tr
            {
                display: flex;
                background-color: aliceblue;
                border-radius: 10px;
                margin: 17px;
                padding: 10px;
                font-size: 24px;

            }
            input
            {
                
                margin: 10px 28px;
                padding: 8px 8px;
                border: 01px solid crimson;
                border-radius: 8px;
                width: 182px;
                height: 44px;
                font-family: sans-serif;
                font-size: 20px;
                
            }
            .tagname
            {
                display: flex;
                position: relative;
                align-content: center;
                align-items: center;
                width: 242px;
                left: 5px;
                font-family: sans-serif;
            }
            .submit:hover
            {
                cursor: pointer;
                background-color: #9999ff;
            }
        </style>
    </body>
</html>
