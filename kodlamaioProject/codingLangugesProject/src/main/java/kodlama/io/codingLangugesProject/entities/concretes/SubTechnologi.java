package kodlama.io.codingLangugesProject.entities.concretes;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "subTechnologies")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubTechnologi {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private int  id ;
@Column(name = "name")
private String name;
@ManyToOne
@JoinColumn(name = "codingLanguage_id" , referencedColumnName = "id")
@JsonManagedReference
private CodingLanguage codingLanguage;
}
