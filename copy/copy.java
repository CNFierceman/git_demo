package copy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class CopyFile
{
    static void copy(String srcPathStr, String desPathStr)
	{
        String newName = srcPathStr.substring(srcPathStr.lastIndexOf("\\")+1); //目标文件地址
        System.out.println("源文件:"+newName);
        desPathStr = desPathStr + File.separator + newName; //源文件地址
        System.out.println("目标文件地址:"+desPathStr);
        try
		{
             FileInputStream fis = new FileInputStream(srcPathStr);//创建输入流对象
             FileOutputStream fos = new FileOutputStream(desPathStr); //创建输出流对象               
             byte datas[] = new byte[1024*8];//创建搬运工具
             int len = 0;//创建长度   
             while((len = fis.read(datas))!=-1)//循环读取数据
			{
				fos.write(datas,0,len);
            } 
                fis.close();//释放资源
                fis.close();//释放资源
        }
			catch (Exception e)
			{
                e.printStackTrace();
            }
    }
    public static void main(String[] args)
	{     
        String srcPathStr = "C:\\Users\\Administrator\\Desktop\\java\\zhl.txt"; //源文件地址
		String desPathStr = "C:\\Users\\Administrator\\Desktop"; //目标文件地址
        copy(srcPathStr, desPathStr);
    } 
}