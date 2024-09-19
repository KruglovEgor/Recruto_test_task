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

//        easier variant
//        resp.getWriter().println("<h1>Hello " + name + "! " + message + "!</h1>");

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<!DOCTYPE html>");
        resp.getWriter().println("<html>");
        resp.getWriter().println("<head>");
        resp.getWriter().println("<style>");
        resp.getWriter().println("body { text-align: center; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
        resp.getWriter().println("</style>");
        resp.getWriter().println("</head>");
        resp.getWriter().println("<body>");
        resp.getWriter().println("<h1>Hello " + name + "! " + message + "!</h1>");
        resp.getWriter().println("</body>");
        resp.getWriter().println("</html>");
    }
}
