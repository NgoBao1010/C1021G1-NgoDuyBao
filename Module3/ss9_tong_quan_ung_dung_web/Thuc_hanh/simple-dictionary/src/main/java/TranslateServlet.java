import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslateServlet", value = "/translate")
public class TranslateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> map = new HashMap<>();
        map.put("hello","xin chào");
        map.put("bakery","bánh");
        map.put("book","quyển sách");
        map.put("bread","bánh mì");
        map.put("good bye","chào tạm biệt");
        map.put("computer","máy tính để bàn");
        map.put("laptop","máy tính xách tay");

        String search = request.getParameter("search");

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");

        String result = map.get(search);
        if (result != null){
            printWriter.println("Word: " + search);
            printWriter.println("Result: " + result);
        }else {
            printWriter.println("Not Found");
        }
        printWriter.println("</html>");
    }
}
