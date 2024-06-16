
<%@include file="DBCON.jsp" %>
<html>
    <body>
        <%
            try {
                String acno = request.getParameter("acno");
                String cname = request.getParameter("cname");
                String cfname = request.getParameter("cfname");
                String cdob = request.getParameter("cdob");
                String cgender = request.getParameter("cgender");
                String opdate = request.getParameter("opdate");
                String cadd = request.getParameter("cadd");
                String ccontact = request.getParameter("ccontact");
                
                String accountinsertquery = "INSERT INTO account VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                
                PreparedStatement pst1 = con.prepareStatement(accountinsertquery);
                
                pst1.setString(1, acno);
                pst1.setString(2, cname);
                pst1.setString(3, cfname);
                pst1.setString(4, cdob);
                pst1.setString(5, cgender);
                pst1.setString(6, opdate);
                pst1.setString(7, cadd);
                pst1.setInt(8, Integer.parseInt(ccontact));
                
                pst1.executeUpdate();
                out.println("<br> Account created");
                
                String customertable = "create table "+acno+"(accountno varchar(20),ref varchar(20),dotrans varchar(20),transid varchar(20),depamount int,wdrwamount int,netbal int);";
                PreparedStatement ps2=con.prepareStatement(customertable);
                ps2.executeUpdate();
                out.println("<br> customer Transection table created also");
            }
            catch(Exception e) {
                out.print("Connection failed");
            }
        %>
    </body>
</html>
