package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OwnerTest {

	@Test
	void addVisit() {
		Owner george = OwnerControllerTests.george();
		george.addVisit(-1, new Visit());
	}
}
