import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
	Scanner input=new Scanner(System.in);
	public static void main(String[] args) {

	}
	
	
	public void infa() {
		//������溯��
		System.out.println("��ѡ����");
		System.out.println("1.ע���˶�Ա�˺�");
		System.out.println("2.ע�����Ա�˺�");
		System.out.println("3.��¼�˶�Ա�˺�");
		System.out.println("4.��¼����Ա�˺�");
		System.out.println("0.�˳�");
	}
	
	public void infaS() {
		//��¼�˶�Ա�˺ź�������溯��
		System.out.println("��ѡ����");
		System.out.println("1.��������");
		System.out.println("2.��ѯ�Լ��ĳɼ�������");
		System.out.println("3.��ѯ����ǰ10��");
		System.out.println("4.��ѯ����Ա�������йر�����֪ͨ");
		System.out.println("0.�˳�");
	}
	public void infaA() {
		//��¼����Ա�˺ź�������溯��
		System.out.println("��ѡ����");
		System.out.println("1.��ѯ�˻�");
		System.out.println("2.�����˻�");
		System.out.println("3.�����˻�����");
		System.out.println("4.��ͣ�����");
		System.out.println("5.¼������ɼ�");
		System.out.println("6.��ѯ���������˶�Ա�ɼ������а�");
		System.out.println("7.����֪ͨ");
		System.out.println("0.�˳�");
	}
	
	public Sportsman createS() {
		//ע���˶�Ա�˺�
		System.out.print("�������˺ţ� ");
		String ID=input.next();
		System.out.print("���������룺 ");
		String code=input.next();
		System.out.print("����������:  ");
		String name=input.next();
		Sportsman s=new Sportsman(ID,code,name);
		
		System.out.println("ע��ɹ���");
		return s;
	}
	
	
	public Administrator createA() {
		//ע�����Ա�˺�
		System.out.print("�������˺ţ�");
		String ID=input.next();
		System.out.print("���������룺");
		String code=input.next();
		System.out.print("������������");
		String name=input.next();
		Administrator a=new Administrator(ID,code,name);
		System.out.println("ע��ɹ�");
		return a;
	}


	public void query(List<Sportsman>list) {
		System.out.print("���������ѯ���˶�ԱID��");
		String ID=input.next();
		int flag=0;
		for(int i=0;i<list.size();i++) {
			if(ID.equals(list.get(i).getID())){
				flag=1;
				System.out.println("���˶�Ա�˺�����Ϊ��"+list.get(i).getcode());
				System.out.println("���˶�Ա�ǳ�Ϊ��"+list.get(i).getname());
				System.out.println("���˶�Ա�ɼ�Ϊ��"+list.get(i).getgrade());
				System.out.println("���˶�Ա����Ϊ��"+list.get(i).getrank());
				System.out.println("���˶�Ա�˺ſ������Ϊ��"+list.get(i).getflag());
			}
		}
		if(flag==0)
			System.out.println("���˶�Ա�˺Ų�����");
	}
	
	public void ban(List<Sportsman>list) {
		System.out.print("����������õ��˶�ԱID��");
		String ID=input.next();
		int flag=0;
		for(int i=0;i<list.size();i++) {
			if(ID.equals(list.get(i).getID())) {
				flag=1;
				list.get(i).setflag(0);
				System.out.println("���˶�Ա�˺��ѱ�����");
			}
		}
		if(flag==0)
			System.out.println("���˶�Ա�˺Ų�����");
	}
	
	public void resetcode(List<Sportsman>list) {
		System.out.print("������������������˻���");
		String ID=input.next();
		int flag=0;
		for(int i=0;i<list.size();i++) {
			if(ID.equals(list.get(i).getID())) {
				flag=1;
				System.out.println("�����������õ����룺");
				String code=input.next();
				list.get(i).sercode(code);
				System.out.println("���˶�Ա�˺������ѱ�����");
			}
		}
		if(flag==0)
			System.out.print("���˶�Ա�˺Ų�����");
	}
	
	public int on_off(){
		System.out.print("�����뱨����Ƿ�����1Ϊ������0Ϊ��ͣ����");
		int flag=input.nextInt();
		return flag;
	}
	
	public Sportsman setSportsman(List<Sportsman>list) {
		Main m=new Main();
		Sportsman s=new Sportsman();
		System.out.print("������Ҫ¼�����ݵ��˶�ԱID��");
		String ID=input.next();
		int flag=0;
		for(int i=0;i<list.size();i++) {
			if(ID.equals(list.get(i).getID())) {
				flag=1;
				System.out.print("����������ɼ���������");
				int grade=input.nextInt();
				int rank=input.nextInt();
				 s= new Sportsman(list.get(i).getID(),list.get(i).getcode(),list.get(i).getname(),list.get(i).getgrade(),list.get(i).getrank());
				 break;
			}
		}
		return s;
	}
	
	public void queryall(List<Sportsman>list) {
		if(list.size()==0) {
			System.out.println("Ŀǰ�˶�Ա�ɼ�δ¼��");
			return ;
		}
		for(int i=0;i<list.size();i++)
			System.out.println("���˶�Ա����Ϊ��"+list.get(i).getname()+"�ɼ�Ϊ��"+list.get(i).getgrade()+"����Ϊ��"+list.get(i).getrank());
	}
	public String publish() {
		System.out.print("������֪ͨ��");
		String tongzhi=input.next();
		return tongzhi;
	}
}
