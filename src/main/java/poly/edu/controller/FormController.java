package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    // Hiển thị form login (GET)
        @GetMapping("/login")
    public String form() {
        return "login"; // trỏ tới login.html
    }

    // Xử lý login (POST)
    @PostMapping("/login")
    public String processLogin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {

        if ("hon".equals(username) && "123".equals(password)) {
            model.addAttribute("message",  " Đăng nhập thành công!");
            return "Trangchu";
        } else {
            model.addAttribute("message", " Đăng nhập thất bại!");
        }

        return "login";
    }
}

