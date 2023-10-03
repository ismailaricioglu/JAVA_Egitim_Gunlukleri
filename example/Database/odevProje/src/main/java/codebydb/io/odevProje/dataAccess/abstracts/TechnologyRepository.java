package codebydb.io.odevProje.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import codebydb.io.odevProje.entities.concretes.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {

}
