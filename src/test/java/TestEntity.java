import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class TestEntity {
	
	@Test
	void testNhan2So() {
		Nhan2So n2so = new Nhan2So();
		
		assertEquals(4, n2so.nhan2So(2, 2));
		
		assertNotEquals(3, n2so.nhan2So(2, 2));
		
		;
	}
}
