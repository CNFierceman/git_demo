import java.util.Scanner;

public class Sportsman {
	Scanner input=new Scanner(System.in);
	private String ID;//�˺�
	private String code;//����
	private String name;//����
	private int rank=0;//����
	private int grade=0;//ʱ��ɼ�ԽС����Խ��
	//�������ɼ�Ϊ0˵��ע�����˺�ȴû�б�������
	private int flag=1;//�˺��Ƿ����,flagΪ1ʱ���ã�0ʱ������
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
