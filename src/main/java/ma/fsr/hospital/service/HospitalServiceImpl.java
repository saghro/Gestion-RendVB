package ma.fsr.hospital.service;

import jakarta.transaction.Transactional;
import ma.fsr.hospital.entities.Consultation;
import ma.fsr.hospital.entities.Medecin;
import ma.fsr.hospital.entities.Patient;
import ma.fsr.hospital.entities.RendezVous;
import ma.fsr.hospital.repositories.ConsultationRepository;
import ma.fsr.hospital.repositories.MedcinRepository;
import ma.fsr.hospital.repositories.PatientRepository;
import ma.fsr.hospital.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
  private PatientRepository patientRepository;
  private MedcinRepository medcinRepository;
  private RendezVousRepository rendezVousRepository;
  private ConsultationRepository consultationRepository;

  public HospitalServiceImpl(PatientRepository patientRepository, MedcinRepository medcinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
    this.patientRepository = patientRepository;
    this.medcinRepository = medcinRepository;
    this.rendezVousRepository = rendezVousRepository;
    this.consultationRepository = consultationRepository;
  }

  @Override
  public Patient savePatient(Patient patient) {
    return patientRepository.save(patient);
  }

  @Override
  public Medecin saveMedecin(Medecin medecin) {

    return medcinRepository.save(medecin);
  }

  @Override
  public RendezVous saveRDV(RendezVous rendezVous) {

    return rendezVousRepository.save(rendezVous);
  }

  @Override
  public Consultation saveConsultation(Consultation consultation) {

    return consultationRepository.save(consultation);
  }
}
