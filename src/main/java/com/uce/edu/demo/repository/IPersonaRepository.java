package com.uce.edu.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.model.Persona;

@Repository
public interface IPersonaRepository {



	public Persona buscarPorId(Integer id);

	public void insertar(Persona persona);

	public void actualizar(Persona persona);

	public void eliminar(Integer id);

	public List<Persona> buscarTodos();

}
