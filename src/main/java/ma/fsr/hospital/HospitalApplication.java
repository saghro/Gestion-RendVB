package ma.fsr.hospital;

import ma.fsr.hospital.entities.Medecin;
import ma.fsr.hospital.entities.Patient;
import ma.fsr.hospital.repositories.MedcinRepository;
import ma.fsr.hospital.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication {

  public static void main(String[] args) {

    SpringApplication.run(HospitalApplication.class, args);
  }
   @Bean
   CommandLineRunner start(PatientRepository patientRepository, MedcinRepository medcinRepository){

    return args -> {
      Stream.of("moha","sezef","selia").forEach(name->{
        Patient patient = new Patient();
        patient.setNom(name);
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patientRepository.save(patient);


      });
      Stream.of("said","riad","salma").forEach(name->{
        Medecin medecin = new Medecin();
        medecin.setNom(name);
        medecin.setEmail(name +"medecin@gmail.com");
        medecin.setSpecialite("geniral");
        medcinRepository.save(medecin);


      });
    };
   }
}
