import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collection;
import java.util.Collections;

public class Start {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		List<Sportsman>list1=new ArrayList();//��ע����˶�Ա�˺�
		List<Sportsman>list2=new ArrayList();//����¼������ɼ����˶�Ա
		List<Administrator>list3=new ArrayList();//��ע��Ĺ���Ա�˺�
		List<String>tongzhi=new ArrayList();//��¼����Ա����֪ͨ
		int num_1=0;//��¼��ע���˶�Ա����
		int num_2=0;//��¼��ע�Ტ�����������˶�Ա����
		int num_3=0;//��¼��ע��Ĺ���Ա����
		
		int apply_flag=1;//�������Ƿ���Ա���,flagΪ1ʱ���Ա�����Ϊ0ʱ���ɱ�����
		
		Main m=new Main();
		int select1=1;
		while(select1!=0) {
			m.infa();
			select1=input.nextInt();
			switch(select1) {
			
			case 1:{
				//ע���˶�Ա�˺�
				Sportsman s=m.createS();
				for(int i=0;i<num_1;i++) {
					if(list1.get(i).getID()==s.getID()) {
						System.out.println("���˺�ID�ѱ�ע��");
						break;
					}
				}
				num_1++;
				list1.add(s);
			}
			break;
			
			case 2:{
				//ע�����Ա�˺�
				Administrator a=m.createA();
				for(int i=0;i<num_3;i++) {
					if(list1.get(i).getID()==a.getID()) {
						System.out.println("���˺�ID�ѱ�ע��");
						break;
					}
				}
				num_3++;
				list3.add(a);
			}
			break;
			
			case 3:{
				//��¼�˶�Ա�˺�
				System.out.print("�������˺ţ�");
				String ID=input.next();
				System.out.print("���������룺");
				String code=input.next();
				int flag=0;
				int num=-1;
				for(int i=0;i<list1.size();i++) {
					if(ID.equals(list1.get(i).getID())) {
						if(!code.equals(list1.get(i).getcode())) {
							flag=1;
							break;
						}
						else {
							flag=2;
							num=i;
							break;
						}
					}
				}
				if(flag==0) {
					System.out.println("�Բ�����˺Ų�����");
					break;
				}
				else if(flag==1) {
					System.out.println("�Բ����������");
					break;
				}
				else if(flag==2&&list1.get(num).getflag()==0) {
					System.out.println("�˺ű�����");
					break;
				}
				else
					System.out.println("�˺ŵ�¼�ɹ�");
				Sportsman s=list1.get(num);//��¼�˶�Աs�˺�;
				//��¼���������
				int seclect2=1;
				//��¼�˶�Ա�˺ź�ѡ����
				while(seclect2!=0) {
					
					m.infaS();
					seclect2=input.nextInt();
					switch(seclect2) {
					
					case 1:{
						if(apply_flag==1) {
							list2.add(s);//s�˶�Ա����
							System.out.println("���������ɹ�");
						}
						else
							System.out.println("����������ֹͣ");
					}
					break;
					
					case 2:  System.out.println("�˶�Ա�ĳɼ�Ϊ��"+s.getgrade()+",�˶�Ա������Ϊ�� "+s.getrank());
					break;
					
					case 3:{
						System.out.print("");
						if(list2.size()==0) {
						    System.out.println("Ŀǰ�˶�Ա�ɼ�δ¼��");
						    break;
					}
						List<Sportsman>NO10=new ArrayList();
						NO10=Sort(list2);
						for(int i=0;i<10&&i<NO10.size();i++)
							System.out.println("��"+(i+1)+"��Ϊ"+NO10.get(i).getname()+"�ɼ�Ϊ��"+NO10.get(i).getgrade()+"����Ϊ��"+NO10.get(i).getrank());
					}
					break;
					
					case 4:{
						if(tongzhi.size()==0) {
							System.out.println("��ǰû��֪ͨ");
							break;
						}
						for(int i=0;i<tongzhi.size();i++) 
							System.out.println((i+1)+"."+tongzhi.get(i));
					}
					break;
					
					case 0:System.out.println("���ؿ�ʼ����");
					break;
					}
				}
			}
			break;

		
			case 4:{
				//��¼����Ա�˺�
				System.out.print("�������˺ţ�");
				String ID=input.next();
				System.out.print("���������룺");
				String code=input.next();
				int flag=0;
				int num=-1;
				for(int i=0;i<list3.size();i++) {
					if(ID.equals(list3.get(i).getID())) {
						if(!code.equals(list3.get(i).getcode()))
							flag=1;
						else {
							flag=2;
							num=i;
						}
					}
				}
				if(flag==0) {
					System.out.println("�Բ�����˺Ų�����");
					break;
				}
				else if(flag==1) {
					System.out.println("�Բ����������");
					break;
				}
				else
					System.out.println("�˺ŵ�¼�ɹ�");
				int seclect3=1;
				while(seclect3!=0) {
					
					m.infaA();
					//ÿ��ѡ����ʱ�������
					seclect3=input.nextInt();
					//ѡ����
					switch(seclect3) {
					
					case 1:m.query(list1);
					break;
					
					case 2:m.ban(list1);
					break;
					
					case 3:m.resetcode(list1);
					break;
					
					case 4:apply_flag=m.on_off();
					break;
					
					case 5:{
						    Sportsman s=m.setSportsman(list1);
							if(s.getgrade()==0) {
								System.out.println("���˺Ų�����");
								break;
							}
							else {
								list2.add(s);
								System.out.println("�ɼ�¼��ɹ�");
								break;
							}
						}
					
					case 6:m.queryall(list2);
					break;
					
					case 7:tongzhi.add(m.publish());
					break;
					
					case 0:System.out.println("���ؿ�ʼ����");
					break;
					}
				}
			}
			break;
			
			}
	}
		System.out.print("ϵͳ���˳�");
	}
	
	
	public static List<Sportsman> Sort(List<Sportsman> list) {
		//���˶�Ա�ɼ���������
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;i<list.size();j++) {
				if(list.get(j).getgrade()<list.get(i).getgrade())
					Collections.swap(list, i, j);
			}
		}
		return list;
	}
	
}
	
	
