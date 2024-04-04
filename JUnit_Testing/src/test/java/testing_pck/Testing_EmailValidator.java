package testing_pck;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import EmailChecker.EmailValidator;

public class Testing_EmailValidator {
	@Test
	public void test_assert_null() {
		EmailValidator obj = new EmailValidator();

		assertTrue(obj.isValidEmail("adsds@company.com"));

		assertTrue(obj.isValidEmail("a3dsdw@company.in"));

		assertTrue(obj.isCorporateEmail("dfdjksd2@company.com"));
		//assertTrue(obj.isCorporateEmail("cds2@company.in"));

	}

}
