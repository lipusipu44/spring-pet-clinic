package com.anilpatro044.springpetclinic.services;

import com.anilpatro044.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> finAll();
    Owner findByLastName(String lastName);
}
