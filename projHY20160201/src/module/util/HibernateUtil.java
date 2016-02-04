package module.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
//	public static void main(String args[]){
//		System.out.println(HibernateUtil.buildSessionFactory());
//		
//	}
	
	
    private static SessionFactory buildSessionFactory() {
        try {
        	Configuration configure = new Configuration().configure();
        	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
        	        .applySettings(configure.getProperties()).build();
        	SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);
        	
        	
        	return sessionFactory;
        } catch (Throwable ex) {
            System.err.println("aaaaaaInitial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static void closeSessionFactory() {
    	if(sessionFactory!=null) {
    		sessionFactory.close();
    	}
    }
}
