package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailOrderPage orderPage;
	private RetailAccountPage accountPage;
	private RetailHomePage homePage;
	private RetailSignInPage signInPage;

	public POMFactory() {
		this.orderPage = new RetailOrderPage();
		this.accountPage = new RetailAccountPage();
		this.homePage = new RetailHomePage();
		this.signInPage = new RetailSignInPage();

	}

	public RetailHomePage homePage() {
		return this.homePage;

	}

	public RetailSignInPage signInPage() {
		return this.signInPage;

	}

	public RetailAccountPage accountPage() {
		return this.accountPage;

	}

	public RetailOrderPage orderPage() {
		return this.orderPage;

	}
}
