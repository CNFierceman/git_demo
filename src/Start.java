import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collection;
import java.util.Collections;

public class Start {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		List<Sportsman>list1=new ArrayList();//以注册的运动员账号
		List<Sportsman>list2=new ArrayList();//以以录入比赛成绩的运动员
		List<Administrator>list3=new ArrayList();//以注册的管理员账号
		List<String>tongzhi=new ArrayList();//记录管理员发的通知
		int num_1=0;//记录以注册运动员数量
		int num_2=0;//记录以注册并报名比赛的运动员数量
		int num_3=0;//记录以注册的管理员数量
		
		int apply_flag=1;//比赛赛是否可以报名,flag为1时可以报名，为0时不可报名；
		
		Main m=new Main();
		int select1=1;
		while(select1!=0) {
			m.infa();
			select1=input.nextInt();
			switch(select1) {
			
			case 1:{
				//注册运动员账号
				Sportsman s=m.createS();
				for(int i=0;i<num_1;i++) {
					if(list1.get(i).getID()==s.getID()) {
						System.out.println("该账号ID已被注册");
						break;
					}
				}
				num_1++;
				list1.add(s);
			}
			break;
			
			case 2:{
				//注册管理员账号
				Administrator a=m.createA();
				for(int i=0;i<num_3;i++) {
					if(list1.get(i).getID()==a.getID()) {
						System.out.println("该账号ID已被注册");
						break;
					}
				}
				num_3++;
				list3.add(a);
			}
			break;
			
			case 3:{
				//登录运动员账号
				System.out.print("请输入账号：");
				String ID=input.next();
				System.out.print("请输入密码：");
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
					System.out.println("对不起此账号不存在");
					break;
				}
				else if(flag==1) {
					System.out.println("对不起密码错误");
					break;
				}
				else if(flag==2&&list1.get(num).getflag()==0) {
					System.out.println("账号被禁用");
					break;
				}
				else
					System.out.println("账号登录成功");
				Sportsman s=list1.get(num);//登录运动员s账号;
				//登录后输出界面
				int seclect2=1;
				//登录运动员账号后选择功能
				while(seclect2!=0) {
					
					m.infaS();
					seclect2=input.nextInt();
					switch(seclect2) {
					
					case 1:{
						if(apply_flag==1) {
							list2.add(s);//s运动员报名
							System.out.println("比赛报名成功");
						}
						else
							System.out.println("比赛报名以停止");
					}
					break;
					
					case 2:  System.out.println("运动员的成绩为："+s.getgrade()+",运动员的排名为： "+s.getrank());
					break;
					
					case 3:{
						System.out.print("");
						if(list2.size()==0) {
						    System.out.println("目前运动员成绩未录入");
						    break;
					}
						List<Sportsman>NO10=new ArrayList();
						NO10=Sort(list2);
						for(int i=0;i<10&&i<NO10.size();i++)
							System.out.println("第"+(i+1)+"名为"+NO10.get(i).getname()+"成绩为："+NO10.get(i).getgrade()+"名次为："+NO10.get(i).getrank());
					}
					break;
					
					case 4:{
						if(tongzhi.size()==0) {
							System.out.println("当前没有通知");
							break;
						}
						for(int i=0;i<tongzhi.size();i++) 
							System.out.println((i+1)+"."+tongzhi.get(i));
					}
					break;
					
					case 0:System.out.println("返回开始界面");
					break;
					}
				}
			}
			break;

		
			case 4:{
				//登录管理员账号
				System.out.print("请输入账号：");
				String ID=input.next();
				System.out.print("请输入密码：");
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
					System.out.println("对不起此账号不存在");
					break;
				}
				else if(flag==1) {
					System.out.println("对不起密码错误");
					break;
				}
				else
					System.out.println("账号登录成功");
				int seclect3=1;
				while(seclect3!=0) {
					
					m.infaA();
					//每次选择功能时输出界面
					seclect3=input.nextInt();
					//选择功能
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
								System.out.println("该账号不存在");
								break;
							}
							else {
								list2.add(s);
								System.out.println("成绩录入成功");
								break;
							}
						}
					
					case 6:m.queryall(list2);
					break;
					
					case 7:tongzhi.add(m.publish());
					break;
					
					case 0:System.out.println("返回开始界面");
					break;
					}
				}
			}
			break;
			
			}
	}
		System.out.print("系统已退出");
	}
	
	
	public static List<Sportsman> Sort(List<Sportsman> list) {
		//将运动员成绩降序排名
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;i<list.size();j++) {
				if(list.get(j).getgrade()<list.get(i).getgrade())
					Collections.swap(list, i, j);
			}
		}
		return list;
	}
	
}
	
	
