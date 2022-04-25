package id.ac.uin.kelompok5.matakuliah.controller;

import id.ac.uin.kelompok5.matakuliah.entity.Matakuliah;
import id.ac.uin.kelompok5.matakuliah.service.MatakuliahService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor

public class MatakuliahWebController {
    private MatakuliahService Matakuliahservice;

    public String index(Model model) {
        model.addAttribute("Matakuliah", Matakuliahservice.getAllMatakuliah());
        return "index";
    }

    public String create1(Model model) {
        model.addAttribute("Matakuliah", new Matakuliah());
        return "formMatkul";
    }

    @PostMapping(value = "/create")
    public String tambahMatkul(Model model, Matakuliah Matakuliah) {
        model.addAttribute("Matakuliah", Matakuliahservice.save(Matakuliah));
        return "redirect:/";
    }

    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("Matakuliah", Matakuliahservice.findById(id));
        return "formMatkul";
    }

    public String hapusMatkul(@PathVariable Long id) {
        Matakuliahservice.deleteById(id);
        return "redirect:/";
    }
}



