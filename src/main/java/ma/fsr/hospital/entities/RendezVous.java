package ma.fsr.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class RendezVous {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Date date;
  private boolean annule;
  @ManyToMany
  private Patient patient;
  private StatusRDV status;
  @ManyToMany
  private Medecin medecin;
  @OneToOne(mappedBy = "rendezVous")
  private Consultation consultation;
}
