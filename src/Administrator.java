import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Administrator {
	private String ID;
	private String code;
	private String name;
	Scanner input=new Scanner(System.in);
	public Administrator() {};
	public Administrator(String ID,String code,String name) {
		this.ID=ID;
		this.code=code;
		this.name=name;
	}
	public String getID() {
		return ID;
	}
	public String getcode() {
		return code;
	}
	public String getname() {
		return name;
	}
}
