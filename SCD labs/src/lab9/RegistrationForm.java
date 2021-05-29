package lab9;

public class RegistrationForm {
	private Accounts acc = new Accounts();
	private MainMenu mm = new MainMenu(acc);
	public void fillRegistrationForm(String fullName, String age, String userName, String password) {
		acc.setFullName(fullName);
		acc.setAge(age);
		acc.setUserName(userName);
		acc.setPassword(password);
		acc.createAccount();
		mm.displayUserMainMenu();
	}
}
