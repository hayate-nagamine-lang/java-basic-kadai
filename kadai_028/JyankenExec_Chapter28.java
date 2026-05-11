package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		Jyanken_Chapter28 jyan = new Jyanken_Chapter28();
		
		
		String myHand =  jyan.getMyChoice();
		
		String opponentHand = jyan.getRandom();
		
		jyan.playGame(myHand , opponentHand);
	}
}
