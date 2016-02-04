package misc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import module.util.HibernateUtil;

@WebListener
public class SessionFactoryListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		HibernateUtil.getSessionFactory();
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		HibernateUtil.closeSessionFactory();
	}
}
