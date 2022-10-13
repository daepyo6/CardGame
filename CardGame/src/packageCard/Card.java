package packageCard;

public class Card {
	//
	final static int spade = 4;
	final static int diamond = 3;
	final static int heart = 2;
	final static int clover = 1;
	
	private int kind; //카드 무늬 
	private int number; //카드의 숫자   A(1), 2, 3, 4, 5, ...10, J(11), Q(12), K(13)
	// 예를 들어 kind 값이 3, number값이 12라면 그 카드는 다이아Q입니다.
	
	Card(){
		this(spade, 1);
	}
	
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	// 객체와 함께 호출되면 그 카드의 무늬와 숫자를 String으로 리턴해주는 메서드
	// kind : 4, number : 13면 문자열 "[Spade:K]"라고 리턴
	public String toString() {
		String [] kinds = {"", "Clover", "Heart", "Diamond", "Spade"};
		String [] numbers = {"", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String result = "[" + kinds[this.kind] + ":" + numbers[this.number] + "]";
		return result;
	}
	
	/*
	 * toString은 다소 특별한 메서드입니다.
	 * toString메서드가 포함된 클래스로 만드는 객체는
	 * System.out.println(객체이름(참조변수이름)); 으로 출력하면
	 * 이전에 봤던거 처럼 "패키지.클래스이름@해쉬코드"가 출력되는게 아니라 toString메서드에서 리턴해주는 값이 출력
	 * 이는 System.out.println(객체이름(참조변수이름).toString());라고 한것과 같은 출력이 있다는 뜻
	 */
	
	
	
	
	
	
	
	
}
