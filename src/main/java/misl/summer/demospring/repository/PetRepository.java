package misl.summer.demospring.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import misl.summer.demospring.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {
	List<Pet> findByName(String name);
	List<Pet> findByBirthDateBetween(LocalDate start, LocalDate end);
}
