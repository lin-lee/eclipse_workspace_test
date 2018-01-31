package com.movie;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
	
	@Test
	public void testStatement(){
		Movie movie = new Movie("肖申克", Movie.NEW_RELEASE);
		Rental rental = new Rental(movie, 3);
		Customer customer = new Customer("ll");
		
		customer.addRental(rental);
		String result = customer.statement();
		String htmlResult = customer.htmlstatement();
		System.out.println(result);
		System.out.println(htmlResult);
		Assert.assertNotNull(result);
	}

}
