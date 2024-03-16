package src.OOPS_21_JAN_2024.Map_C;

import java.util.*;

public class AutomationExMaster {
    public static void main(String[] args) {

        Student stu1=new Student(1,"Aishwarya","Test@gmail.com",9999999);
        Student stu2=new Student(2,"Anya","Test2@gmail.com",9899999);
        Student stu3=new Student(3,"Ameya","Test3@gmail.com",9799999);
        Student stu4=new Student(4,"Mohit","TestM@gmail.com",9699999);
        Student stu5=new Student(5,"Spruha","TestS@gmail.com",95999999);


        List<Student> stuList1=new ArrayList<>(); //B1
        stuList1.add(stu1);
        stuList1.add(stu2);
        stuList1.add(stu3);


        List<Student> stuList2=new ArrayList<>();//B2
        stuList2.add(stu4);
        stuList2.add(stu5);



        Map<String,List<Student>> ttaATBBatches1=new TreeMap<>();
        ttaATBBatches1.put("ATB1",stuList1);
        ttaATBBatches1.put("ATB2",stuList2);

        //ATB1--->3 students
        //ATB2--->2 students

        //MTB1--->3 students
        //MTB2--->2 students

        Map<String,List<Student>> ttaMTBBatches2=new TreeMap<>();
        ttaMTBBatches2.put("MTB1",stuList1); //3students
        ttaMTBBatches2.put("MTB2",stuList2); //2students


        Map<String, Map<String ,List<Student>>> TTACourses=new HashMap<>();
        TTACourses.put("Automation",ttaATBBatches1);
        TTACourses.put("Manual",ttaMTBBatches2);

        Set<String> coursename=TTACourses.keySet();
        System.out.println(coursename);


        char ch='A';
        for (String cname: coursename) {
            System.out.println(ch++ +") Course: " + cname);

            Map<String,List<Student>> batchmap =TTACourses.get(cname);
            Set<String> batchIds=batchmap.keySet();

            for (String batchID: batchIds) {

                List<Student> stuList =batchmap.get(batchID);
                System.out.println();
                System.out.println("Students of " + batchID +" Total : "+stuList.size());
                System.out.println("=====================");

                int count=1;
                for (Student mystu:stuList) {
                    System.out.println(count++ +"."+mystu);

                }

            }


        }



















    }


}

class Student{

    private Integer sid;
    private String  sname;
    private String email;
    private  long phone;

    Student()
    {
        System.out.println("Default Constructor");
    }
    public Student(Integer sid, String sname, String email, long phone) {
        this.sid = sid;
        this.sname = sname;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        Integer local_var=10;
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }

}
