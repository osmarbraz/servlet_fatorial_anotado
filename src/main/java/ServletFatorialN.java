
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
@WebServlet(urlPatterns = {"/servlet/ServletFatorialN"})
public class ServletFatorialN extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int N = Integer.parseInt(request.getParameter("Numero"));
        out.println("<h1>C&aacute;lculo Fatorial</h1>");
        for (int i = 1; i <= N; i++) {
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