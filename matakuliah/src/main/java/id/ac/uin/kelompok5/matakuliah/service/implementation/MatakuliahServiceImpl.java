package id.ac.uin.kelompok5.matakuliah.service.implementation;

import id.ac.uin.kelompok5.matakuliah.entity.Matakuliah;
import id.ac.uin.kelompok5.matakuliah.repository.MatakuliahRepository;
import id.ac.uin.kelompok5.matakuliah.service.framework.MatakuliahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MatakuliahServiceImpl implements MatakuliahService {
    private final id.ac.uin.kelompok5.matakuliah.repository.MatakuliahRepository matakuliahRepository;

    @Autowired
    public MatakuliahServiceImpl(MatakuliahRepository MatakuliahRepository) {
        this.matakuliahRepository = MatakuliahRepository;
    }

    @Override
    public List<id.ac.uin.kelompok5.matakuliah.entity.Matakuliah> getAllMatakuliah() {
        return matakuliahRepository.findAll();
    }

    @Override
    public Optional<Matakuliah> findById(Long id) {
        return matakuliahRepository.findById(id);
    }
    @Override
    public Matakuliah save(Matakuliah std) {
        return matakuliahRepository.save(std);
    }

    @Override
    public void deleteById(Long id) {
        matakuliahRepository.deleteById(id);
    }
}
