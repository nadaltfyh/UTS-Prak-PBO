package id.ac.uin.kelompok5.matakuliah.service.framework;

import id.ac.uin.kelompok5.matakuliah.entity.PasswordResetToken;

public interface PasswordResetTokenService {
    PasswordResetToken findByToken(String token);

    PasswordResetToken save(PasswordResetToken passwordResetToken);
}