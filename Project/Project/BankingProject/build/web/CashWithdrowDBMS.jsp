<%@include file="DBCON.jsp" %>
<html>

    <body >
        <%            try {
                int lastbal = 0;
                String viewquerylast = "select * from transactionbank";
                Statement stmt1 = con.createStatement();
                ResultSet rs2 = stmt1.executeQuery(viewquerylast);

                while (rs2.next()) {
                    lastbal = rs2.getInt(7);

                }

                String accno = request.getParameter("accno");
                String refname = request.getParameter("refname");
                String dot = request.getParameter("dot");
                String trid = request.getParameter("trid");
                int wthamount = Integer.parseInt(request.getParameter("wthamt"));

                String wthinsertquery = "insert into transactionbank values(?,?,?,?,?,?,?);";
                PreparedStatement pst2 = con.prepareStatement(wthinsertquery);

                pst2.setString(1, accno);
                pst2.setString(2, refname);
                pst2.setString(3, dot);
                pst2.setString(4, trid);
                pst2.setInt(5, 0);
                pst2.setInt(6, wthamount);
                pst2.setInt(7, (lastbal - wthamount));
                    
                pst2.executeUpdate();
                out.println("transection Success.....");
            } catch (Exception e) {
                out.println("transection Failed....."+e);
            }

        %>

    </body>
</html>
