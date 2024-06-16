package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class CashWithdrowDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body >\n");
      out.write("        ");
            try {
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

                String wthinsertquery = "insert into transectionbank values(?,?,?,?,?,?,?);";
                PreparedStatement pst2 = con.prepareStatement(wthinsertquery);

                pst2.setString(1, accno);
                pst2.setString(2, refname);
                pst2.setString(3, dot);
                pst2.setString(4, trid);
                pst2.setInt(5, 0);
                pst2.setInt(6, wthamount);
                pst2.setInt(7, (lastbal - wthamount));

                out.println("transection Success.....");
            } catch (Exception e) {
                out.println("transection Failed....."+e);
            }

        
      out.write("\n");
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