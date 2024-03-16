package src.OOPS_20_JAN_2024;

public class Lab148_P {
    public static void main(String[] args) {
        //Amit,Pramod,Lucky

        Person p1=new Person("Amit",31);
        Person p2=new Person("Pramod",50);
        Person p3=new Person("Lucky",35);

        Person[] objs = new Person[3];

        objs[0] = p1;
        objs[1] = p2;
        objs[2] = p3;


for (int i=0;i<objs.length;i++)
{
    System.out.println(objs[i].toString());
}


    }

}
