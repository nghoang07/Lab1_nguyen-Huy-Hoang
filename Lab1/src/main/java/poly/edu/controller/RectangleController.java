package poly.edu.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RectangleController {


    @RequestMapping("/rectangle/form")
    public String form() {
        return "form";
    }


    @RequestMapping("/rectangle/calc")
    public String calc(HttpServletRequest request, Model model) {
        try {
            double width = Double.parseDouble(request.getParameter("width"));
            double height = Double.parseDouble(request.getParameter("height"));
            double egde = Double.parseDouble(request.getParameter("egde"));

            double area = width * height;
            double perimeter = 2 * (width + height);
            double areaegde = egde * 4;

            model.addAttribute("egde", egde);
            model.addAttribute("width", width);
            model.addAttribute("height", height);
            model.addAttribute("area", area);
            model.addAttribute( "perimeter", perimeter);
            model.addAttribute("areaegde", areaegde);
        } catch (Exception e) {
            model.addAttribute("error", "Vui lòng nhập số hợp lệ!");
        }

        return "result";
    }
}

