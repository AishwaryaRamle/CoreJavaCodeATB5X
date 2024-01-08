package src.JavaPracticeProgram;

public class primenew {
   public static void main(String[] args) {
       /* int num=23;
        boolean prime =true;
        for (int i = 2; i < num ; i++) {
            if(num%i==0)
            {
                prime=false;
                break;
            }

        }
        System.out.println(prime);
    }*/

       //Natural Number >1
       //which has only 2 factors 1 and itself
       int number = 3;
       int count = 0;
       if (number > 1) {

           for (int i = 1; i <=number ; i++) {
               if(number%i==0)
                   count++;
           }
           if(count==2) //in this case number is divided by  1 and itself .
           {
               System.out.println("Number is Prime Number!!!");
           }
           else {
               System.out.println("Number is not Prime Number!!!");
           }

       } else {
           System.out.println("Not prime Number");
       }
   }
}
