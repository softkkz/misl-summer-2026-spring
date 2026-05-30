package misl.summer.demospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import misl.summer.demospring.model.PetOwner;

@Repository
public interface PetOwnerRepository extends JpaRepository<PetOwner, Integer>{

}
