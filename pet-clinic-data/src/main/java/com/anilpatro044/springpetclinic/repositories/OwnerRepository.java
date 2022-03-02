package com.anilpatro044.springpetclinic.repositories;

import com.anilpatro044.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
