package twj.banco;

public class 계좌 {

	private double 잔액;

	public 계좌() {
		this.잔액 = 0;
	}

	public double get잔액() {
		return 잔액;
	}

	public void 예금하다(double money) {
		this.잔액 += money;
	}

	public void 인출하다(double money) {
		if(잔액 < money) throw new IllegalArgumentException("잔액이 부족합니다!");
		this.잔액 -= money;
	}

}
