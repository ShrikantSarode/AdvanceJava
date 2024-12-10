package example.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateConfig;

public class HqlSelectClauseExample {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateConfig.getSessionFactory();
				Session session = factory.openSession();) {
			String hqlQuery = "select act.firstName, act.age from Actor act";
			Query<Object[]> queryRef = session.createQuery(hqlQuery, Object[].class);
			List<Object[]> actorList = queryRef.list();
			for (Object[] actorData : actorList) {
				System.out.println("First Name : "+actorData[0]);
				System.out.println("Age : "+actorData[1]);
				System.out.println("========================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
