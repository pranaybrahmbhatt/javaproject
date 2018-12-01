
package Model;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Admin_Welcome extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Admin_Welcome</title>");            
            out.println("</head>");
            out.println("<body>");
            String un=request.getParameter("nm");  
            String pass=request.getParameter("pw");
            if(un.equals("Admin")&& pass.equals("1234"))
            {
            out.print("Welcome "+un);  
            out.println("<ul>");
            out.println("<li><a href='ad_doc_register.jsp'>Register Doctor</a></li>");
            out.println("<li><a href='Ad_staff_reg.jsp'>Register Staff</a></li>");
            out.println("<li><a href=''>Ward Allocation</a></li>");
            out.println("<li><a href=''>Income report</a></li>");
            out.println("</ul>");
    
            
            out.close();  
            }
            else
            {
                out.println("<script>alert('Invalid login credentials');</script>");
                RequestDispatcher rd=request.getRequestDispatcher("Adminlogin.jsp");
                rd.include(request, response);
            }
            
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
