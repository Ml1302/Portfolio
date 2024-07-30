package com.example.demo.interfaces;

import com.example.demo.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersona extends CrudRepository<Persona, Integer> {
}
