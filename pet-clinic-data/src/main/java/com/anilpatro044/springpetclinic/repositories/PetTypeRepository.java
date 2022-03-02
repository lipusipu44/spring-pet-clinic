package com.anilpatro044.springpetclinic.repositories;

import com.anilpatro044.springpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
