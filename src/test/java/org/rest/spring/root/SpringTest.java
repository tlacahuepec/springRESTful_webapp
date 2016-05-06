package org.rest.spring.root;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.rest.spring.cfg.ApplicationConfig;
import org.rest.spring.cfg.PersistenceConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationConfig.class,
		PersistenceConfig.class }, loader = AnnotationConfigContextLoader.class)
public class SpringTest {

	@Test
	public void whenSpringContextIsInstantiated_thenNoExceptions() {

	}

}
