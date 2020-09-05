package com.mitotarea.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitotarea.model.Persona;
import com.mitotarea.repo.IGenericRepo;
import com.mitotarea.repo.IPersonaRepo;
import com.mitotarea.service.IPersonaService;

@Service
public class PersonaServiceImpl extends CRUDImpl<Persona, Integer> implements IPersonaService{
	
	@Autowired
	private IPersonaRepo repo;
	
	protected IGenericRepo<Persona, Integer> getRepo(){
		return repo;
	}
}