package com.anilpatro044.springpetclinic.repositories;

import com.anilpatro044.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
