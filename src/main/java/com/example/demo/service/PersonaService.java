package com.example.demo.service;

import com.example.demo.interfaces.IPersona;
import com.example.demo.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    private final IPersona data;

    @Autowired
    public PersonaService(IPersona data) {
        this.data = data;
    }

    // CRUD operations
    public void save(Persona p) {
        data.save(p);
    }

    public void delete(int id) {
        data.deleteById(id);
    }

    public Persona list(int id) {
        return data.findById(id).orElse(null);
    }

    public void update(Persona p) {
        data.save(p);
    }

    public Iterable<Persona> list() {
        return data.findAll();
    }
}