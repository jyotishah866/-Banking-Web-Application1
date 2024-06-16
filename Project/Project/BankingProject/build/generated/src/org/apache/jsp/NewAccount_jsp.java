package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NewAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("    <body align=\"center\">\n");
      out.write("        <h1 align=\"center\">New Account Registration</h1>\n");
      out.write("        <form action=\"NewAccountDBMS.jsp\" method=\"post\" >\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"tagname\">Account Number</td>\n");
      out.write("                    <td><input type=\"text\" name=\"acno\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"tagname\">Customer Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"cname\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"tagname\">Father Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"cfname\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"tagname\">DOB</td>\n");
      out.write("                    <td><input type=\"date\" name=\"cdob\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"tagname\">Gender</td>\n");
      out.write("                    <td><input type=\"text\" name=\"cgender\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"tagname\">Account Opening Date</td>\n");
      out.write("                    <td><input type=\"date\" name=\"opdate\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"tagname\">Address</td>\n");
      out.write("                    <td><input type=\"text\" name=\"cadd\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"tagname\">Contact Number</td>\n");
      out.write("                    <td><input type=\"text\" name=\"ccontact\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"tagname\"><input type=\"submit\" name=\"b1\" value=\"SAVE\" class=\"submit\"></td>\n");
      out.write("                    <td class=\"tagname\"><input type=\"reset\" name=\"b2\" value=\"RESET\" class=\"submit\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        <style>\n");
      out.write("            form\n");
      out.write("            {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                margin: 52px;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 15px;\n");
      out.write("                width: 500px;\n");
      out.write("                margin: AUTO;\n");
      out.write("                border-radius: 19px;\n");
      out.write("                background-color: #ccffcc;\n");
      out.write("            }\n");
      out.write("            tr\n");
      out.write("            {\n");
      out.write("                display: flex;\n");
      out.write("                background-color: aliceblue;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                margin: 17px;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-size: 24px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            input\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("                margin: 10px 28px;\n");
      out.write("                padding: 8px 8px;\n");
      out.write("                border: 01px solid crimson;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                width: 182px;\n");
      out.write("                height: 44px;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                font-size: 20px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .tagname\n");
      out.write("            {\n");
      out.write("                display: flex;\n");
      out.write("                position: relative;\n");
      out.write("                align-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                width: 242px;\n");
      out.write("                left: 5px;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("            }\n");
      out.write("            .submit:hover\n");
      out.write("            {\n");
      out.write("                cursor: pointer;\n");
      out.write("                background-color: #9999ff;\n");
      out.write("            }\n");
      out.write("        </style>\n");
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
