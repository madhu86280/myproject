
package Demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Myservlet2 extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out= response.getWriter();
      String uname = request.getParameter("fn");
       String ulname = request.getParameter("ln");
      String pass = request.getParameter("pwd");
      String addr = request.getParameter("add");
      String uemail = request.getParameter("email");
      String ugender = request.getParameter("gender");
      
      if(uname.equals("madhu") && ulname.equals("banga") && pass.equals("123") && addr.equals("xyz") && uemail.equals("madhubanga22@gmail.com") && ugender.equals("FEMALE") )
      {
         HttpSession s=request.getSession();
         s.setAttribute("name",uname);
         RequestDispatcher rd;
             rd = request.getRequestDispatcher("index.html");
         rd.forward(request,response);
      }
      else
      {
       RequestDispatcher rd=request.getRequestDispatcher("index.html");
         rd.forward(request,response);
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
