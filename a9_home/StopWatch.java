package a9_home;

public class StopWatch 
{

	// TODO Auto-generated method stub
	private long startTime;
	private long endTime;
	public void StopWatch()
	{
		java.util.Date date=new java.util.Date();
		startTime=date.getTime();
	}
	public void start(long startTime)
	{
		this.startTime=startTime;
	}
	public void stop(long endTime)
	{
		this.endTime=endTime;
	}
	public long getElapsedTime()
	{
		java.util.Date time=new java.util.Date();
		return time.getTime();
	}
	public long getStartTime()
	{
		return startTime;
	}
	public long getEndTime()
	{
		return endTime;
	}
}
