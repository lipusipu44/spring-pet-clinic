package com.anilpatro044.springpetclinic.services;

import com.anilpatro044.springpetclinic.model.Owner;
import com.anilpatro044.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> finAll();
}
