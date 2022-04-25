package id.ac.uin.kelompok5.matakuliah.controller;

import id.ac.uin.kelompok5.matakuliah.entity.Matakuliah;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class TestController {
    public String getForm(Matakuliah Matakuliah) {
        return "index2";
    }

    @PostMapping("/save-matakuliah")
    public String submitMatakuliahDetails(@Valid Matakuliah Matakuliah, Errors errors, Model model) {
        if (null != errors && errors.getErrorCount() > 0) {
            return "index2";
        } else {
            model.addAttribute("successMsg", "Details saved successfully!!");
            return "success";
        }
    }
}


