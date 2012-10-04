package net.sudr.workbench.app.handlers;

import static org.junit.Assert.*;

import org.junit.Test;

public class AboutHandlerTest {

	@Test
	public void test() {
		assertTrue(new AboutHandler().getGreeting().equals("hello"));
	}

}
