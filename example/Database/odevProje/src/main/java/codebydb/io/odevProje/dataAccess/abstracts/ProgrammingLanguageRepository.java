package codebydb.io.odevProje.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import codebydb.io.odevProje.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {
	boolean existsByName(String name);
}
