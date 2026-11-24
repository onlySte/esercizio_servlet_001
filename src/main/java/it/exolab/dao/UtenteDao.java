package it.exolab.dao;

import org.apache.ibatis.session.SqlSession;

import it.exolab.mapper.UtenteMapper;
import it.exolab.model.Utente;
import it.exolab.util.MyBatisUtils;

public class UtenteDao {
	
	public void insert(Utente model) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		try {
			UtenteMapper mapper = session.getMapper(UtenteMapper.class);
			mapper.insert(model);
			session.commit();
		}
		catch(Exception e) {
			session.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}

	
	public Utente findByEmail(String email) {
		
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		
		try {
			UtenteMapper mapper = session.getMapper(UtenteMapper.class);
			
			Utente utenteTrovato = mapper.findByEmail(email);
			return utenteTrovato;
		}
		catch (Exception e) {
			return null;
		}
		finally {
			session.close();
		}
		
	}
	
	
}
