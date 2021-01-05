import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
	Scanner input=new Scanner(System.in);
	public static void main(String[] args) {

	}
	
	
	public void infa() {
		//输出界面函数
		System.out.println("请选择功能");
		System.out.println("1.注册运动员账号");
		System.out.println("2.注册管理员账号");
		System.out.println("3.登录运动员账号");
		System.out.println("4.登录管理员账号");
		System.out.println("0.退出");
	}
	
	public void infaS() {
		//登录运动员账号后输出界面函数
		System.out.println("请选择功能");
		System.out.println("1.报名参赛");
		System.out.println("2.查询自己的成绩和排名");
		System.out.println("3.查询大赛前10名");
		System.out.println("4.查询管理员发布的有关比赛的通知");
		System.out.println("0.退出");
	}
	public void infaA() {
		//登录管理员账号后输出界面函数
		System.out.println("请选择功能");
		System.out.println("1.查询账户");
		System.out.println("2.禁用账户");
		System.out.println("3.重置账户密码");
		System.out.println("4.启停报名活动");
		System.out.println("5.录入比赛成绩");
		System.out.println("6.查询包含所有运动员成绩的排行榜");
		System.out.println("7.发布通知");
		System.out.println("0.退出");
	}
	
	public Sportsman createS() {
		//注册运动员账号
		System.out.print("请输入账号： ");
		String ID=input.next();
		System.out.print("请输入密码： ");
		String code=input.next();
		System.out.print("请输入姓名:  ");
		String name=input.next();
		Sportsman s=new Sportsman(ID,code,name);
		
		System.out.println("注册成功！");
		return s;
	}
	
	
	public Administrator createA() {
		//注册管理员账号
		System.out.print("请输入账号：");
		String ID=input.next();
		System.out.print("请输入密码：");
		String code=input.next();
		System.out.print("请输入姓名：");
		String name=input.next();
		Administrator a=new Administrator(ID,code,name);
		System.out.println("注册成功");
		return a;
	}


	public void query(List<Sportsman>list) {
		System.out.print("请输入想查询的运动员ID：");
		String ID=input.next();
		int flag=0;
		for(int i=0;i<list.size();i++) {
			if(ID.equals(list.get(i).getID())){
				flag=1;
				System.out.println("该运动员账号密码为："+list.get(i).getcode());
				System.out.println("该运动员昵称为："+list.get(i).getname());
				System.out.println("该运动员成绩为："+list.get(i).getgrade());
				System.out.println("该运动员排名为："+list.get(i).getrank());
				System.out.println("该运动员账号可用情况为："+list.get(i).getflag());
			}
		}
		if(flag==0)
			System.out.println("该运动员账号不存在");
	}
	
	public void ban(List<Sportsman>list) {
		System.out.print("请输入想禁用的运动员ID：");
		String ID=input.next();
		int flag=0;
		for(int i=0;i<list.size();i++) {
			if(ID.equals(list.get(i).getID())) {
				flag=1;
				list.get(i).setflag(0);
				System.out.println("该运动员账号已被禁用");
			}
		}
		if(flag==0)
			System.out.println("该运动员账号不存在");
	}
	
	public void resetcode(List<Sportsman>list) {
		System.out.print("请输入想重置密码的账户：");
		String ID=input.next();
		int flag=0;
		for(int i=0;i<list.size();i++) {
			if(ID.equals(list.get(i).getID())) {
				flag=1;
				System.out.println("请输入想重置的密码：");
				String code=input.next();
				list.get(i).sercode(code);
				System.out.println("该运动员账号密码已被重置");
			}
		}
		if(flag==0)
			System.out.print("该运动员账号不存在");
	}
	
	public int on_off(){
		System.out.print("请输入报名活动是否开启（1为开启，0为暂停）：");
		int flag=input.nextInt();
		return flag;
	}
	
	public Sportsman setSportsman(List<Sportsman>list) {
		Main m=new Main();
		Sportsman s=new Sportsman();
		System.out.print("请输入要录入数据的运动员ID：");
		String ID=input.next();
		int flag=0;
		for(int i=0;i<list.size();i++) {
			if(ID.equals(list.get(i).getID())) {
				flag=1;
				System.out.print("请输入比赛成绩和排名：");
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
			System.out.println("目前运动员成绩未录入");
			return ;
		}
		for(int i=0;i<list.size();i++)
			System.out.println("该运动员名称为："+list.get(i).getname()+"成绩为："+list.get(i).getgrade()+"排名为："+list.get(i).getrank());
	}
	public String publish() {
		System.out.print("请输入通知：");
		String tongzhi=input.next();
		return tongzhi;
	}
}
