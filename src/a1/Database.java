package a1;
import java.util.ArrayList;
public class Database {
	private ArrayList<Item> listItem=new ArrayList<Item>();
	public void add(Item item) {
		listItem.add(item);
	}
	public void list() {
		for(Item item:listItem) {
			item.print();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Database db= new Database();
	db.add(new MP3("1",1,false,"2","take me to your heart","Li"));
	db.add(new MP3("2",2,false,"3","hello","Zhang"));
	db.list();
	}

}
