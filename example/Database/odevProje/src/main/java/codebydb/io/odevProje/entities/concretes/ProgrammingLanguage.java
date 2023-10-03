package codebydb.io.odevProje.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "programmingLanguages")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProgrammingLanguage {

	@Id // primarykey
	@GeneratedValue(strategy = GenerationType.IDENTITY) // otomatik artım
	@Column(name = "id") // kolon adı
	private int id;

	@Column(name = "name") // kolon adı
	private String name;

	@OneToMany(mappedBy = "programmingLanguage")
	private List<Technology> technologies;
}
