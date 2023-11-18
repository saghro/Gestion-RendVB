package ma.fsr.hospital.repositories;

import ma.fsr.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient ,Long> {
  Patient findByNom(String nom);
}
