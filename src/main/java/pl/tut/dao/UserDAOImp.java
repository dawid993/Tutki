package pl.tut.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import pl.tut.hibernateconf.HibernateUtill;
import pl.tut.model.userClass;

@Repository
public class UserDAOImp implements UserDAO {

	private SessionFactory sessionFactory;

	public UserDAOImp() {
		sessionFactory = HibernateUtill.getSessionFactory();
	}

	public void save(userClass u) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.getTransaction();

		try {
			trans.begin();
			if (u.getId() == 0)
				session.persist(u);
			else
				session.merge(u);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		} finally {
			session.close();
		}
	}

	public userClass getUserClass(int id) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.getTransaction();

		try {
			trans.begin();
			userClass u = session.get(userClass.class, id);
			trans.commit();
			return u;
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		} finally {
			session.close();
		}
		return null;
	}

}
