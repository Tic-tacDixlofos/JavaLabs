package ForServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = {"/servlet/*"})


public class MainServlet extends HttpServlet {


    private static final long serialVersionUID = 1L;

        protected void doPost(HttpServletRequest request,
                              HttpServletResponse response)
                throws ServletException, IOException
        {
            try {

                // Initialize the database
                Connection con = DatabaseConnection.initializeDatabase();

                // Create a SQL query to insert data into demo table
                // demo table consists of two columns, so two '?' is used
                PreparedStatement st = con
                        .prepareStatement("insert into demo values(?, ?)");

                // For the first parameter,
                // get the data using request object
                // sets the data to st pointer
                st.setInt(1, Integer.valueOf(request.getParameter("id")));

                // Same for second parameter
                st.setString(2, request.getParameter("string"));

                // Execute the insert command using executeUpdate()
                // to make changes in database
                st.executeUpdate();

                // Close all the connections
                st.close();
                con.close();

                // Get a writer pointer
                // to display the successful result
                PrintWriter out = response.getWriter();
                out.println("<html><body><b>Successfully Inserted"
                        + "</b></body></html>");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




















   /* private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String emailId = req.getParameter("emailId");
        String password = req.getParameter("password");

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>Student Resistration Form Data</h1>");
        printWriter.print("<p> firstName :: " + firstName + "</p>");
        printWriter.print("<p> lastName :: " + firstName + "</p>");
        printWriter.print("<p> firstName :: " + firstName + "</p>");
        printWriter.print("<p> firstName :: " + firstName + "</p>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();

        System.out.println("firstName :: " + firstName);
        System.out.println("lastName :: " + lastName);
        System.out.println("emailId :: " + emailId);
        System.out.println("password :: " + password);
    }
}


*/
 /*   @Override
    public void init(ServletConfig config) throws ServletException{
        super.init(config);
     log("meth1");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
super.service(req, resp);
resp.getWriter().write("Meth2");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String url= req.getRequestURI();
        String params= formatParameters(req);

        resp.getWriter().write("Meth3");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url= req.getRequestURI();
        String params= formatParameters(req);

        resp.getWriter().write("Meth3");
    }

    private String formatParameters(HttpServletRequest req){
        return req.getParameterMap()
        .entrySet()
                .stream()
                .map(entry ->{
                    String param=String.join("and", entry.getValue());
                    return entry.getKey()+"=>"+param;
                })
                .collect(Collectors.joining());

    }

    @Override
    public void destroy(){
        super.destroy();
        log("meth4");
    }


}
*/