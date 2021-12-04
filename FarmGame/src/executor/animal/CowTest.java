package executor.animal;

import executor.animal.Cow;
import executor.Location;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CowTest {
	Cow cow = new Cow();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		

	}

	@Test
	@DisplayName("Testing cow milking")
	void testMilk() {
		assertEquals(true, cow.milk(), "Cow can be milked if just created with default constructor");
	}
	
	
	@Test
	@DisplayName("Milking a cow should empty the cow's milk storages")
	void testHasMilk() {
		cow.milk();
		assertEquals(false, cow.getHasMilk(), "Cows should not have milk after being milked");
	}
	
	@Test
	@DisplayName("Cows should be able to speak")
	void testSpeak() {
		assertEquals("The cow moos!", cow.speak(), "Cows should moo");
	}

}
