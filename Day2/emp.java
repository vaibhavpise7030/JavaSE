class ABC{
	private static int cnt=10;
	static int getNum() {
		return cnt;
	}
}
public class emp {
	public static void main(String[] args) {
		System.out.println(ABC.getNum());
	}

}
