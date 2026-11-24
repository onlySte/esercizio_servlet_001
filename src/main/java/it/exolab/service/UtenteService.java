package it.exolab.service;

import it.exolab.dao.UtenteDao;
import it.exolab.model.Utente;

public class UtenteService {

	public boolean emailEsiste(String email) {
		
//		boolean condizione = false;
		
		UtenteDao dao = new UtenteDao();
		
		
		if(email != null) {
//			E' LA STESSA IDENTICA COSA
//			Utente utente = dao.findByEmail(email);
//			return utente != null ? true : false;
			return dao.findByEmail(email) != null ? true : false;
		} 
		else {
			return false;
		}
//		
//		if(utente.getEmail() != null) {
//			condizione = true;
//		}
		
//		return condizione;
	}
	
	
}
