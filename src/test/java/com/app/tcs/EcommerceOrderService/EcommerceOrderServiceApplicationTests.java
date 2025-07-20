package com.app.tcs.EcommerceOrderService;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EcommerceOrderServiceApplicationTests {


	int count;

	@BeforeAll
	 void beforeAllmethod(){
		System.out.println("Before ALl");
	}

	@AfterAll
	 void afterAllmeth(){
		System.out.println("After All");
	}

	@BeforeEach
	void setUp(){
		count=0;
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown(){
		System.out.println("After Each");
	}

	@Test
	void testAddition(){
		count++;
		System.out.println("Count : "+count);
		assertEquals(1,count);
	}

	@Disabled("fix later")
	@Test
	void testDivisionByZero(){
		assertThrows(ArithmeticException.class, ()->{int x=1/0;});
	}

	@DisplayName("Testing String length function test")
	@Test
	void testStringLength(){
		String name="junit";
		assertEquals(5,name.length());
		assertTrue(name.startsWith("j"));
		assertFalse(3>5);
		assertNotNull("hello");

		assertAll("name checked",
				()->assertEquals(5,name.length()),
				()->assertTrue(name.contains("u")),
				()->assertFalse(name.isEmpty())
				);
	}

	@ParameterizedTest
	@CsvSource({"2,3,5","10,5,15"})
	void testAddition(int a,int b, int sum){
		assertEquals(sum,a+b);
	}



}
