package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class CashDepositeDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con ;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/DBCON.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            try
            {
                Class.forName("com.mysql.jdbc.Driver");
              String connectionURL  = ("jdbc:mysql://localhost:3306/GlobalBankingDB");
                String dbuser="root";
                String dbpass="root";
                
                con = DriverManager.getConnection(connectionURL,dbuser,dbpass);
                
                out.println("Connection Successfull");
            }
            
            catch(Exception e)
            {
                out.print("Connection failed"+e);
                
            }
            
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
            try {
                int lastbal = 0;
                String viewquerylast = "Select * from transactionbank";
                Statement stmt1 = con.createStatement();
                ResultSet rs2 = stmt1.executeQuery(viewquerylast);

                while (rs2.next()) {
                    lastbal = rs2.getInt(7);
                }

                String accno = request.getParameter("accno");
                String refname = request.getParameter("refname");
                String dot = request.getParameter("dot");
                String trid = request.getParameter("trid");
                int depamount = Integer.parseInt(request.getParameter("depamt"));

                String depositequery = "insert into transactionbank values(?,?,?,?,?,?,?);";

                PreparedStatement pst1 = con.prepareStatement(depositequery);
                pst1.setString(1, accno);
                pst1.setString(2, refname);
                pst1.setString(3, dot);
                pst1.setString(4, trid);
                pst1.setInt(5, depamount);
                pst1.setInt(6, 0);
                pst1.setInt(7, lastbal + depamount);

                pst1.executeUpdate();
                out.println("cash deposite in transection bank table successfully......");

            //----------------------------------for customer---------------------------
                int lastbalcustomer = 0;
                String viewquerylastcustomer = "select * from " + accno;
                Statement stmt2 = con.createStatement();
                ResultSet rs3 = stmt2.executeQuery(viewquerylastcustomer);

                while (rs3.next()) {
                    lastbalcustomer = rs3.getInt(7);

                }
                String depositequerycustomer = "insert into " + accno + "values (?,?,?,?,?,?,?);";

                PreparedStatement pst2 = con.prepareStatement(depositequerycustomer);

                pst2.setString(1, accno);
                pst2.setString(2, refname);
                pst2.setString(3, dot);
                pst2.setString(4, trid);
                pst2.setInt(5, depamount);
                pst2.setInt(6, 0);
                pst2.setInt(7, (lastbalcustomer + depamount));
                
                pst2.executeUpdate();
                out.println("cash deposite in customer "+accno+"table successfully");
                
            } catch (Exception e) {
                out.println("Transection failed.....!!!!" + e);
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
