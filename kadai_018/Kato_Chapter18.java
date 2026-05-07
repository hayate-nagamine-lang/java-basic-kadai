package kadai_018;

abstract public class Kato_Chapter18 {

	//フィールド
	public String familyName = "加藤";
	public String givenName  = "";
	public String address    = "東京都中野区〇×";
	
	//同じところ
	public void commonIntroduce() {
		System.out.println("名前は" + familyName +givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	//メソッド
	abstract public void eachIntroduce ();
	
	//紹介の実行
	public void execIntroduce() {
		commonIntroduce(); // 共通紹介
        eachIntroduce();   // 個別紹介
        System.out.println();
	}
}
