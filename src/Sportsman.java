import java.util.Scanner;

public class Sportsman {
	Scanner input=new Scanner(System.in);
	private String ID;//账号
	private String code;//密码
	private String name;//名称
	private int rank=0;//排名
	private int grade=0;//时间成绩越小名词越高
	//排名，成绩为0说明注册了账号却没有报名比赛
	private int flag=1;//账号是否可用,flag为1时可用，0时不可用
	public Sportsman() {}
	
	public Sportsman(String ID,String code,String name) {
		this.ID=ID;
		this.code=code;
		this.name=name;
	}
	public Sportsman(String ID,String code,String name,int rank,int grade) {
		this.ID=ID;
		this.code=code;
		this.name=name;
		this.rank=rank;
		this.grade=grade;
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
	public int getrank() {
		return rank;
	}
	public int getgrade() {
		return grade;
	}
	public int getflag() {
		return flag;
	}
	
	public void sercode(String code) {
		this.code=code;
	}
	public void setrank(int rank){
		this.rank=rank;
	}
	public void setgrade(int grade) {
		this.grade=grade;
	}
	public void setflag(int flag) {
		this.flag=flag;
	}
}
