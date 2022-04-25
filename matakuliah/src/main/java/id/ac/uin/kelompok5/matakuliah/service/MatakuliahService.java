package id.ac.uin.kelompok5.matakuliah.service;

import id.ac.uin.kelompok5.matakuliah.entity.Matakuliah;

import java.util.List;
import java.util.Optional;

public interface MatakuliahService {
    List<Matakuliah> getAllMatakuliah();

    Optional<Matakuliah> findById(Long id);

    Matakuliah save(Matakuliah std);

    void deleteById(Long id);
}
