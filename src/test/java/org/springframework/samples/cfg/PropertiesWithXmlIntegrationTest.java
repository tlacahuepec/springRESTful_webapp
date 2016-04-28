package org.springframework.samples.cfg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

//@RunWith(MockitoJUnitRunner.class) -> No jala el contexto de spring
@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations = {
// "classpath:spring/basicConfigForProperties.xml",
// "classpath:spring/basicConfigForProperties2.xml" }) -> Directly from the
// sources
@ContextConfiguration(classes = { BasicPropertiesWithJavaConfig.class }, loader = AnnotationConfigContextLoader.class)
public class PropertiesWithXmlIntegrationTest {

	@Autowired
	private Environment environment;

	@Value("${key.something}")
	private String injectedProperty;

	@Test
	public final void givenContextIsInitializated_thenNoException() {
		System.out.println("in test via @Value: " + injectedProperty);
		System.out.println("in test via Environment: " + environment.getProperty("key.something"));
	}

}
