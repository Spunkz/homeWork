package com.homeWorkETS.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.homeWorkETS.Model.infoModel;

@Repository
public class infoDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@SuppressWarnings("unchecked")
	public List<infoModel> getAllInfo() {
		Session session = this.sessionFactory.getCurrentSession();
		List<infoModel> infoModel = session.createQuery("from Info").list();
		return infoModel;
	}


	public infoModel addInfo(infoModel infoModel) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(infoModel);
		return infoModel;
	}

}
