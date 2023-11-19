package ma.fsr.hospital.service;

import ma.fsr.hospital.entities.Consultation;
import ma.fsr.hospital.entities.Medecin;
import ma.fsr.hospital.entities.Patient;
import ma.fsr.hospital.entities.RendezVous;

public interface IHospitalService {
  Patient savePatient(Patient patient);
  Medecin saveMedecin(Medecin medecin);
  RendezVous saveRDV(RendezVous rendezVous);
  Consultation saveConsultation (Consultation consultation);
}
