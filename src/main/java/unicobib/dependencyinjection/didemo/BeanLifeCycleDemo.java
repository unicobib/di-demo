package unicobib.dependencyinjection.didemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycleDemo
		implements InitializingBean, DisposableBean, BeanFactoryAware, BeanNameAware, ApplicationContextAware {
	
	public BeanLifeCycleDemo() {
		System.out.println("1.   I'm in bean life cycle demo constructor");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		System.out.println("2.  Application Context has been set");
	}

	@Override
	public void setBeanName(String name) {

		System.out.println("3.   Bean name has been set:   "+name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

		System.out.println("4.   Bean factory has been set");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("5.  life cycle been has been terminated");
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("6.   Life cycle bean has its properties set");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("7.   The post construct annoted method has been called.");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("8.   The pre-destroy annoted method has been called");
	}

	public void beforeInit() {
		System.out.println("9.    Before init- called by bean post processor");
	}
	
	public void afterInit() {
		System.out.println("10.   After init - called by bean post processor");
	}
}
