package it.exolab.dao;

import org.apache.ibatis.session.SqlSession;

import it.exolab.mapper.UtenteMapper;
import it.exolab.model.Utente;
import it.exolab.util.MyBatisUtils;

public class UtenteDao {
	
	public void insert(Utente model) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		UtenteMapper mapper = session.getMapper(UtenteMapper.class);
		mapper.insert(model);
		session.commit();
		session.close();
	}

	
	
	
}
