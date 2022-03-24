package com.anilpatro044.springpetclinic.services.map;

import com.anilpatro044.springpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {
    OwnerServiceMap ownerServiceMap;
    final Long ownerId=1L;
    final String lastName="Patro";
    @BeforeEach
    void setUp() {
        ownerServiceMap=new OwnerServiceMap(new PetTypeServiceMap(),new PetServiceMap());
        Owner owner=Owner.builder().id(ownerId).lastName(lastName).build();
        ownerServiceMap.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner> owners = ownerServiceMap.findAll();
        assertEquals(owners.size(),1);
    }

    @Test
    void saveExistingId() {
        Long id=2L;
        Owner owner = ownerServiceMap.save(Owner.builder().id(id).build());
        assertEquals(id,owner.getId());
    }

    @Test
    void saveNoId() {
        Owner owner = ownerServiceMap.save(Owner.builder().build());
        assertNotNull(owner);
        assertNotNull(owner.getId());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void findById() {
        Owner byId = ownerServiceMap.findById(ownerId);
        assertEquals(ownerId,byId.getId());
    }

    @Test
    void findByLastName() {
        Owner byLastName = ownerServiceMap.findByLastName(lastName);
        assertNotNull(byLastName);
        assertNotNull(lastName,byLastName.getLastName());
    }
}