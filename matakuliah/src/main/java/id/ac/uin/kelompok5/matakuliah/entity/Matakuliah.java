package id.ac.uin.kelompok5.matakuliah.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "matakuliah")
public class Matakuliah {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "Nama Matkul is required")
    @Column(nullable = false, name = "mata_kuliah")
    private String matakuliah;

    @NotEmpty(message = "kelas is required")
    @Column(nullable = false, name = "kelas_matkul")
    private String kelasMatkul;

    @NotEmpty(message = "SKS is required")
    @Column(nullable = false, name = "sks_matkul")
    private String sksMatkul;

    @NotEmpty(message = "ruang is required")
    @Column(nullable = false, name = "ruang_matkul")
    private String ruangMatkul;

    @NotEmpty(message = "waktu is required")
    @Column(nullable = false, name = "waktu_matkul")
    private String waktuMatkul;

    @NotEmpty(message = "dosen is required")
    @Column(nullable = false, name = "dosen_matkul")
    private String dosenMatkul;

    @NotEmpty(message = "kategori is required")
    @Column(nullable = false, name = "kategori_tugas")
    private String kategoriTugas;

    @NotEmpty(message = "deadline is required")
    @Column(nullable = false, name = "deadline_tugas")
    private String deadlineTugas;

    @NotEmpty(message = "Deskripsi is required")
    @Column(nullable = false, name = "deskripsi_tugas")
    private String deskripsiTugas;



}

