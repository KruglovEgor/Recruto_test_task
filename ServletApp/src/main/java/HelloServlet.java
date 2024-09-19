import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String message = req.getParameter("message");

        if (name == null){
            name = "YOUR_NAME";
        }
        if (message == null){
            message = "YOUR_MESSAGE";
        }

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<h1>Hello " + name + "! " + message + "!</h1>");
    }
}
