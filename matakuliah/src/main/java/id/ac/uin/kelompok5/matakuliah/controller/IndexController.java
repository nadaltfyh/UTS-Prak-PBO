package id.ac.uin.kelompok5.matakuliah.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("//")
    public String index() {
        return "index";
    }

}