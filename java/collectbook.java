package java;
import java.util.*;
public class collectbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book a=new Book(0001,"A",20.0,"hznu");
		Book b=new Book(0002,"B",50.0,"hznu");
		Book c=new Book(0003,"C",100.0,"hznu");
		
		HashMap<Integer,Book>bookHashMap=new HashMap<>();
		bookHashMap.put(a.getid(),a);
		bookHashMap.put(b.getid(),b);
		bookHashMap.put(c.getid(),c);
		
		List<HashMap<Integer,Book>> booklist=new ArrayList<>();
		booklist.add(bookHashMap);
		System.out.println("编号\t名称\t价格\t出版社");
		for(HashMap<Integer,Book>h:booklist) {
			Set<Integer> key=h.keySet();
			for(Integer i:key) {
				System.out.println(i+
						"/t"+h.get(i).getname()+
						"/t"+h.get(i).getprice()+
						"/t"+h.get(i).getpress());
			}
		}
	}

}
class Book{
	private int id;
	private String name;
	private double price;
	private String press;
	public Book() {
	}
	Book(int id,String name,double price,String press){
		super();
		this.id=id;
		this.name=name;
		this.price=price;
		this.press=press;
	}
	int getid() {
		return id;
	}
	void setid(int id) {
		this.id=id;
	}
	String getname() {
		return name;
	}
	void setname(String name) {
		this.name=name;
	}
	double getprice() {
		return price;
	}
	void setprice(double price) {
		this.price=price;
	}
	String getpress() {
		return press;
	}
	void setpress(String press) {
		this.press=press;
	}
}




