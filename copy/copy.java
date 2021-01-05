package copy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class CopyFile
{
    static void copy(String srcPathStr, String desPathStr)
	{
        String newName = srcPathStr.substring(srcPathStr.lastIndexOf("\\")+1); //Ŀ���ļ���ַ
        System.out.println("Դ�ļ�:"+newName);
        desPathStr = desPathStr + File.separator + newName; //Դ�ļ���ַ
        System.out.println("Ŀ���ļ���ַ:"+desPathStr);
        try
		{
             FileInputStream fis = new FileInputStream(srcPathStr);//��������������
             FileOutputStream fos = new FileOutputStream(desPathStr); //�������������               
             byte datas[] = new byte[1024*8];//�������˹���
             int len = 0;//��������   
             while((len = fis.read(datas))!=-1)//ѭ����ȡ����
			{
				fos.write(datas,0,len);
            } 
                fis.close();//�ͷ���Դ
                fis.close();//�ͷ���Դ
        }
			catch (Exception e)
			{
                e.printStackTrace();
            }
    }
    public static void main(String[] args)
	{     
        String srcPathStr = "C:\\Users\\Administrator\\Desktop\\java\\zhl.txt"; //Դ�ļ���ַ
		String desPathStr = "C:\\Users\\Administrator\\Desktop"; //Ŀ���ļ���ַ
        copy(srcPathStr, desPathStr);
    } 
}