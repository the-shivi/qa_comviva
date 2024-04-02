package testing_pck;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import EmailChecker.EmailValidator;

public class Testing_EmailValidator {
	@Test
	public void test_assert_null() {
		EmailValidator obj = new EmailValidator();

		assertTrue(obj.isValidEmail("adsds@comviva.com"));

		assertTrue(obj.isValidEmail("a3dsdw@comviva.in"));

		assertTrue(obj.isCorporateEmail("dfdjksd2@comviva.com"));
		//assertTrue(obj.isCorporateEmail("cds2@comviva.in"));

	}

}
