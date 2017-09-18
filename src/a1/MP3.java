package a1;
public class MP3 extends Item {
	private String geming;
	private String geshou;
	public MP3(String title, int playingTime, boolean gotIt, String comment, String geming, String geshou) {
		super(title, playingTime, gotIt, comment);
		this.geming = geming;
		this.geshou = geshou;
	}
	public void print() {
		super.print();
		System.out.println(geming+"-"+geshou);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
