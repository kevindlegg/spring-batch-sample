package hello;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PersonItemProcessorTest {
	@Test
	public void process() throws Exception {
		PersonItemProcessor personItemProcessor = new PersonItemProcessor();
		
		Person doug = new Person("Doug", "Lee");
		
		Person processedPerson = personItemProcessor.process(doug);
		
		assertTrue(processedPerson.getFirstName().equals(doug.getFirstName().toUpperCase()));
		assertTrue(processedPerson.getLastName().equals(doug.getLastName().toUpperCase()));
	}
}