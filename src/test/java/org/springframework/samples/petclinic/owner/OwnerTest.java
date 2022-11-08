package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import org.junit.jupiter.api.Test;

class OwnerTest {

	@Test
	void addVisit() {
		Owner george = OwnerControllerTests.george();
		george.addVisit(-1, new Visit());
	}

	@Test
	void getPet() {
		Owner george = OwnerControllerTests.george();
		assertNotNull(george.getPet("Feebee"));
	}
}
