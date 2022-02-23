package com.anilpatro044.springpetclinic.services.map;

import com.anilpatro044.springpetclinic.model.Owner;
import com.anilpatro044.springpetclinic.model.Pet;
import com.anilpatro044.springpetclinic.model.PetType;
import com.anilpatro044.springpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeServiceMap extends
        AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
