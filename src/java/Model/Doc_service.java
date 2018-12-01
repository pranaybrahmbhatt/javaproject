package Model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Doc_service extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Doctor Account</title>");            
            out.println("</head>");
            out.println("<body>");
          try
          {
             Connection con=null;
           int p=Integer.parseInt(request.getParameter("pid"));
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con = DriverManager.getConnection("jdbc:sqlserver://;databaseName=userdata","sa","faculty"); 
           PreparedStatement pst=con.prepareStatement("select * from patient_data where pid=?");
           pst.setInt(1,p);
           ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
             out.println("<form method='post'>");  
             out.println("<table> <tr> <td> Patient Id:</td><td><input type='text' value='"+rs.getInt(1)+"' name='pid'></td></tr>");  
             out.println("<tr> <td> Patient Name:</td><td><input type='text' value='"+rs.getString(2)+"' name='pname'></td></tr>"); 
             out.println("<tr> <td> Gender:</td><td><input type='text' value='"+rs.getString(6)+"' name='pgen'></td></tr>");
             out.println("<tr> <td> Problem:</td><td><input type='text' value='"+rs.getString(7)+"' name='prob'></td></tr>");
             out.println("<tr> <td> Age:</td><td><input type='text' value='"+rs.getString(8)+"' name='page'></td></tr>");       
             out.println("<tr> <td>Prescription:</td><td><input type='text' name='Pres'/></td> </tr>");
             out.println("<tr> <td>Appointment date:</td><td><input type='text' name='Appdate'/></td> </tr>");
             out.println("<tr> <td>Amount:</td><td><input type='text' name='amt'/></td> </tr></table>");
             out.println("<input type='submit' value='Submit'/>");
             out.println("<form>");      
            }
             
            Integer id=Integer.parseInt(request.getParameter("pid"));
            String name=request.getParameter("pname");
            String gen=request.getParameter("pgen");
            String pro=request.getParameter("prob");
            Integer age=Integer.parseInt(request.getParameter("page"));
             String pres=request.getParameter("Pres");
             String app=request.getParameter("Appdate");
             Integer amt=Integer.parseInt(request.getParameter("amt"));
             
             String sql="insert into patient_record values(?,?,?,?,?,?,?,?)";
             PreparedStatement pst1=con.prepareStatement(sql);
            pst1.setInt(1,id);
            pst1.setString(2, name);
            pst1.setString(3, gen);
            pst1.setString(4, pro);
            pst1.setInt(5, age);
            pst1.setString(6, pres);
            pst1.setString(7, app);
            pst1.setInt(8, amt);
            
            pst1.executeUpdate();
            out.println("Success");
            pst.close();
            pst1.close();
            
            }
          catch(Exception e)
          {
              
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
