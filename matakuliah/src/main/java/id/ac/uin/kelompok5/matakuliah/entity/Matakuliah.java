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
@Table(name = "matkul")
public class Matakuliah {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "Kode Matkul is required")
    @Column(nullable = false, name = "kode_kuliah")
    private String kodeMatkul;

    @NotEmpty(message = "nama is required")
    @Column(nullable = false, name = "nama_matkul")
    private String namaMatkul;

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

}

