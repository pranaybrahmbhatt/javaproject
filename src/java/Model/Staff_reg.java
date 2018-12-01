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


public class Staff_reg extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        PreparedStatement pst;
        Connection con=null;
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Staff Registration</title>");            
        out.println("</head>");
        out.println("<body>");
        String nm=request.getParameter("Name");
        String add=request.getParameter("Address");
        String cont=request.getParameter("Contact");
        String er=request.getParameter("Role");
        Integer eage=Integer.parseInt(request.getParameter("Age"));
        String egen=request.getParameter("Gender");
        String un=request.getParameter("User_Name");
        String pass=request.getParameter("Password");
        String cpass=request.getParameter("Confirm_Password");
        try{
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                 con = DriverManager.getConnection("jdbc:sqlserver://;databaseName=userdata","sa","faculty"); 
                 Statement stmt= con.createStatement();
                 ResultSet rs1= stmt.executeQuery("select User_Name from Staff_data");
                 
                 boolean stat = false;
                 while(rs1.next())
                {
                    if(rs1.getString(1).equals(un))
                    {
                        stat = true;
                        out.println("Record Already Exists");
                        break;
                     }
                    else
                    {
                          pst= con.prepareStatement("insert into Staff_data (Name, Address, Contact, Role, Age, Gender, User_Name, Password, Confirm_Password) values(?,?,?,?,?,?,?,?,?)");
                          pst.setString(1,nm);
                          pst.setString(2,add);
                          pst.setString(3,cont);
                          pst.setString(4,er);
                          pst.setInt(5,eage);
                          pst.setString(6,egen);
                          pst.setString(7,un);
                          pst.setString(8,pass);
                          pst.setString(9,cpass);
                          pst.executeUpdate();
                          pst.close();
              out.println("<h1> Registration Successful<h1>"); 
                             break;
                 }
                }
              
                out.println("</body>");
                out.println("</html>");
                con.close();
        }
        catch(Exception e)
        {
            out.println(e);
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
