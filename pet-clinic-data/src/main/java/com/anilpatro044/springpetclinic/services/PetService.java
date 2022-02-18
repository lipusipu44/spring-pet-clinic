package com.anilpatro044.springpetclinic.services;

import com.anilpatro044.springpetclinic.model.Owner;
import com.anilpatro044.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> finAll();
}
