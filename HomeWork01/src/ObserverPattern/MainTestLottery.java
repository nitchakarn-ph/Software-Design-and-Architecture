package ObserverPattern;

public class MainTestLottery {

	public static void main(String[] args) {
		IDealer dealer = new Dealer();
		Observer g1 = new PremiumMember();
		dealer.addMember(g1);
		g1.update(2);
		//dealer.doLotteryResult();

	}

}
