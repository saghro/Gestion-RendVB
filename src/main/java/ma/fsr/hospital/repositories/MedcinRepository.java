package ma.fsr.hospital.repositories;

import ma.fsr.hospital.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedcinRepository extends JpaRepository<Medecin,Long> {
   Medecin findByNom(String nom);
}
