package EmailChecker;

public class EmailValidator {
	public boolean isValidEmail(String email) {

		return email != null && email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")
				&& (email.endsWith("com") || email.endsWith("in"));
	}

	public boolean isCorporateEmail(String email) {
		return email != null && email.endsWith("comviva.com");
	}
}