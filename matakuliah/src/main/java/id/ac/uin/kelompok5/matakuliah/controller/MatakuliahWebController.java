package id.ac.uin.kelompok5.matakuliah.controller;

import id.ac.uin.kelompok5.matakuliah.entity.Matakuliah;
import id.ac.uin.kelompok5.matakuliah.service.framework.MatakuliahService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor

public class MatakuliahWebController {
    private MatakuliahService matakuliahService;
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("Matakuliah", matakuliahService.getAllMatakuliah());
        return "index";
    }

    @GetMapping(value = "/create")
    public String create1(Model model) {
        model.addAttribute("Matakuliah", new id.ac.uin.kelompok5.matakuliah.entity.Matakuliah());
        return "formMatkul";
    }

    @PostMapping(value = "/create")
    public String tambahMatkul(Model model, Matakuliah matakuliah) {
        model.addAttribute("Matakuliah", matakuliahService.save(matakuliah));
        return "redirect:/";
    }

    @GetMapping(value = "edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("Matakuliah", matakuliahService.findById(id));
        return "formMatkul";
    }

    @GetMapping(value = "/hapus/{id}")
    public String hapusMatkul(@PathVariable Long id) {
        matakuliahService.deleteById(id);
        return "redirect:/";
    }
}



