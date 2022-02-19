package com.anilpatro044.springpetclinic.services;

import com.anilpatro044.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
