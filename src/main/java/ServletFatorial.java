import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osmar
 */

@WebServlet(urlPatterns = {"/servlet/ServletFatorial"})
public class ServletFatorial extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>C&aacute;lculo Fatorial</h1>");
        for (int i = 1; i <= 10; i++) {
            out.println("Numero " + i + " = " + fatorial(i) + "<br>");
        }
        out.close();
    }

    public int fatorial(int num) {
        int fat = 1;
        for (int i = 1; i <= num; i++) {
            fat = fat * i;
        }
        return fat;
    }
}
