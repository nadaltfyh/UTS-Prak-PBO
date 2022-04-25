package id.ac.uin.kelompok5.matakuliah.controller;

import id.ac.uin.kelompok5.matakuliah.entity.Matakuliah;
import id.ac.uin.kelompok5.matakuliah.exception.MatakuliahNotFoundException;
import id.ac.uin.kelompok5.matakuliah.service.MatakuliahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("api/matakuliah")

public class MatakuliahController {
    private final MatakuliahService matakuliahService;

    @Autowired
    public MatakuliahController(MatakuliahService matakuliahService) {
        this.matakuliahService = matakuliahService;
    }

    public List<Matakuliah> getAllMatakuliah() {
        return matakuliahService.getAllMatakuliah();
    }

    public Matakuliah getMatakuliahById(@PathVariable("id") @Min(1) Long id) {
        Matakuliah std = matakuliahService.findById(id)
                .orElseThrow(() -> new MatakuliahNotFoundException("Mata kuliah with " + id + " is Not Found!"));
        return std;
    }

    @PostMapping
    public Matakuliah addMatakuliah(@Valid @RequestBody Matakuliah std) {
        return matakuliahService.save(std);
    }

    @PutMapping(value = "/{id}")
    public Matakuliah updateMatakuliah(@PathVariable("id") @Min(1) Long id, @Valid @RequestBody Matakuliah newStd) {
        Matakuliah matakuliah = matakuliahService.findById(id)
                .orElseThrow(() -> new MatakuliahNotFoundException("Mata kuliah with " + id + " is Not Found!"));
        matakuliah.setMatakuliah(newStd.getMatakuliah());
        matakuliah.setKelasMatkul(newStd.getKelasMatkul());
        matakuliah.setSksMatkul(newStd.getSksMatkul());
        matakuliah.setRuangMatkul(newStd.getRuangMatkul());
        matakuliah.setWaktuMatkul(newStd.getWaktuMatkul());
        matakuliah.setDosenMatkul(newStd.getDosenMatkul());
        matakuliah.setDeadlineTugas(newStd.getDeadlineTugas());
        matakuliah.setDeskripsiTugas(newStd.getDeskripsiTugas());
        matakuliah.setKategoriTugas(newStd.getKategoriTugas());
        return matakuliahService.save(matakuliah);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteMatakuliah(@PathVariable("id") @Min(1) Long id) {
        Matakuliah std = matakuliahService.findById(id)
                .orElseThrow(() -> new MatakuliahNotFoundException("Mata kuliah with " + id + " is Not Found!"));
        matakuliahService.deleteById(std.getId());
        return "Mata kuliah with ID :" + id + " is deleted";
    }
}
