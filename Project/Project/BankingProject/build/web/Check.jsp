<html>
    <body>

        <%
            String role = request.getParameter("role");
            String loginid = request.getParameter("loginid");
            String password = request.getParameter("loginpassword"); // Fix the parameter name

            if (role != null && loginid != null && password != null) {
                if (role.equals("admin") && loginid.equals("A001") && password.equals("ADMINADMIN")) {
                    response.sendRedirect("AdminLogin.jsp");
                } else if (role.equals("customer") && loginid.equals("C001") && password.equals("123")) {
                    response.sendRedirect("CustomerLogin.jsp");
                } else {
                    RequestDispatcher disp = request.getRequestDispatcher("Login.jsp");
                    disp.include(request, response);
                    out.println("<br> Invalid login & Password");
                }
            } else {
                // Handle the case when the form is submitted without filling all the fields.
                RequestDispatcher disp = request.getRequestDispatcher("Login.jsp");
                disp.include(request, response);
                out.println("<br> Please fill in all the fields.");
            }
        %>

    </body>
</html>
