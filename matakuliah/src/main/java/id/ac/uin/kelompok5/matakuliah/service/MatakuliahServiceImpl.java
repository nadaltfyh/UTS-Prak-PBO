package id.ac.uin.kelompok5.matakuliah.service;

import id.ac.uin.kelompok5.matakuliah.entity.Matakuliah;
import id.ac.uin.kelompok5.matakuliah.repository.MatakuliahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MatakuliahServiceImpl implements MatakuliahService{
    private final MatakuliahRepository MatakuliahRepository;

    @Autowired
    public MatakuliahServiceImpl(MatakuliahRepository MatakuliahRepository) {
        this.MatakuliahRepository = MatakuliahRepository;
    }

    @Override
    public List<Matakuliah> getAllMatakuliah() {
        return MatakuliahRepository.findAll();
    }

    @Override
    public Optional<Matakuliah> findById(Long id) {
        return MatakuliahRepository.findById(id);
    }
    @Override
    public Matakuliah save(Matakuliah std) {
        return MatakuliahRepository.save(std);
    }

    @Override
    public void deleteById(Long id) {
        MatakuliahRepository.deleteById(id);
    }
}
