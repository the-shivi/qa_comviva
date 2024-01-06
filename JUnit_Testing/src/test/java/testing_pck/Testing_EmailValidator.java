package testing_pck;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import EmailChecker.EmailValidator;

public class Testing_EmailValidator {
	@Test
	public void test_assert_null() {
		EmailValidator obj = new EmailValidator();

		assertTrue(obj.isValidEmail("Shivam.kumar2@comviva.com"));

		assertTrue(obj.isValidEmail("Shivam.kumar2@comviva.in"));

		assertTrue(obj.isCorporateEmail("Shivam.kumar2@comviva.com"));
		//assertTrue(obj.isCorporateEmail("Shivam.kumar2@comviva.in"));

	}

}
