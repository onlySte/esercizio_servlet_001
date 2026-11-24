package it.exolab.mapper;

import it.exolab.model.Utente;

public interface UtenteMapper {

	void insert(Utente model);
	
	Utente findByEmail(String email);
	
	Utente findByEmailAndUsername(Utente model);
}
