package a9_test;


public class a9_6 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StopWatch object =new StopWatch();
		int[] n=new int[100000];
		for(int i=0;i<100000;i++)
		{n[i]=(int)(Math.random()*100);}
		selectionSort(n);
		object.stop(object.getElapsedTime());
		long time=object.getEndTime()-object.getStartTime();
		System.out.print(time);
	}
	public static void selectionSort(int[] list)
	{
		for(int i=0;i<list.length-1;i++)
		{
			int max=list[i];
			int max_index=i;
			for(int j=i+1;j<list.length;j++)
			{
				if(max<list[j])
				{
					max=list[j];
					max_index=j;
				}
			}
			if(max_index!=i)
			{
			    list[max_index]=list[i];
			    list[i]=max;
			}
		}
	}

}
