package java;
import java.util.*;
public  class Student implements Comparable<Student>
{
    private Integer num;
    private String name;
    private Integer age;

    public int compareTo(Student stu)
    {
        return this.age - stu.age;
    }
    public String toString()
    {
        return "Student [age=" + age + ", name=" + name
                + ", num=" + num + "]";
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Set<Student> stuSet = saveStudentInfo();
        Iterator<Student> it = stuSet.iterator();
        while (it.hasNext())
        {
            String info = it.next().toString();
            System.out.println(info);
        }
    }
    private static Set<Student> saveStudentInfo()
    {
        Scanner input = new Scanner(System.in);
        Set<Student> stuSet = new TreeSet<Student>();
        while (true)
        {
            System.out.println("请输入学生信息:(学号#姓名#年龄)");
            String inputData = input.nextLine();
            if ("exit".equals(inputData))
            {
                break;
            }
            String[] info = inputData.split("#");
            Student stu
                    = new Student(Integer.parseInt(info[0]), info[1],
                            Integer.parseInt(info[2]));
            stuSet.add(stu);
        }
        return stuSet;
    }
}