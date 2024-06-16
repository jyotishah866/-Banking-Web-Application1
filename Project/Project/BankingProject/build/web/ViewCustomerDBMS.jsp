<%@include file="DBCON.jsp" %>
<%@include file="ViewCustomer.jsp" %>
<html>
  
    <body>
        <%
        
        try{
            String choice = request.getParameter("choice");
            String CustomerViewquery ="";
            
            if(choice.equalsIgnoreCase("customername"))
            {
                String cn = request.getParameter("cuschoice");
                CustomerViewquery ="select * from account where cusname ='"+cn+"'";
            }
            else if(choice.equalsIgnoreCase("address"))
                    {
                        String cn = request.getParameter("cuschoice");
                CustomerViewquery ="select * from account where address ='"+cn+"'";
                    }
            else{
                CustomerViewquery="select * from account";
            }
            Statement stmt = con.createStatement();
                
                ResultSet rs1 = stmt.executeQuery(CustomerViewquery);
                
                while(rs1.next())
                {
                    out.println(" "+rs1.getString(1));
                    out.println(" "+rs1.getString(2));
                    out.println(" "+rs1.getString(3));
                    out.println(" "+rs1.getString(4));
                    out.println(" "+rs1.getString(5));
                    out.println(" "+rs1.getString(6));
                    out.println(" "+rs1.getString(7));
                    out.println(" "+rs1.getString(8));
                   out.println(" <br>");
                }
      
        }
        
            catch(Exception e)
            {
                out.println("data not Found" +e);
            }
         
        
            %>
    </body>
</html>
