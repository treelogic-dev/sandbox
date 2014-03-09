package com.lambdoop.sandboxtest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FooTests {

	@Test
	public void testFoo(){
		Foo foo = new Foo();
		assertNotNull(foo);
	}
}
