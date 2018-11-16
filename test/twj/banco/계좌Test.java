package twj.banco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class 계좌Test {
	@Test
	public void shouldHaveZeroBalanceAfterOpeningNewAccount() {
		계좌 account = new 계좌();
		double current = account.get잔액();
		assertEquals(0, current, 0.000001);
	}

	@Test
	public void shouldAddMoneyAfterDeposit() {
		계좌 account = new 계좌();
		account.예금하다(123.45);
		assertEquals(123.45, account.get잔액(), 0.000001);
		account.예금하다(100);
		assertEquals(223.45, account.get잔액(), 0.000001);
	}

	@Test
	public void shouldSubtractAmountAfterWithDraw() {
		계좌 account = new 계좌();
		account.예금하다(123.45);
		account.인출하다(100);
		assertEquals(23.45, account.get잔액(), 0.000001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenThereIsNotEnoughMoney() {
		계좌 account = new 계좌();
		account.예금하다(100);
		account.인출하다(140);
	}
}
