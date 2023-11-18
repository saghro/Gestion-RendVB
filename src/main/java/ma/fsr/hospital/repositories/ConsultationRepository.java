package ma.fsr.hospital.repositories;

import ma.fsr.hospital.entities.Consultation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
