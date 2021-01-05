package a7_test;

public class a7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a=new int[50];
		int num=1;
		a[0]=2;
		for(int i=3;num<50;i++){
			int flag=1;
			for(int j=0;a[j]<=Math.sqrt(i)&&j<num;j++) {
				if(i%a[j]==0) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				a[num]=i;
				num++;
			}
		}
		System.out.println("前50个素数为：");
		for(int i=0;i<50;i++)
			System.out.println("            "+a[i]);
	}

}
