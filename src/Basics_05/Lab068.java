package src.Basics_05;

public class Lab068 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);//will only print 0 value as 0%2 is 0 and it will get break from loop.
            if(i%2 == 0){
                break;

            }
        }
    }
}

