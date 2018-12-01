
package Model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class userregister extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
           
        } catch (ClassNotFoundException ex) {
         Logger.getLogger(userregister.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        PreparedStatement pst;
        Connection con=null;
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet userregister</title>");            
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
                 ResultSet rs1= stmt.executeQuery("select User_Name from u_data");
                 
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
                          pst= con.prepareStatement("insert into u_data (Name, Address, Contact, Role, Age, Gender, User_Name, Password, Confirm_Password) values(?,?,?,?,?,?,?,?,?)");
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
        }
        catch(Exception e)
        {
            out.println(e);
        }
        finally
        {
            
            con.close();
        }




             } 
        
    
}
    