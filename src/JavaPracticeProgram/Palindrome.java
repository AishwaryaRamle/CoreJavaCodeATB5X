package src.JavaPracticeProgram;

public class Palindrome {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int n=151;//It is the number variable to be checked for palindrome

        temp=n;

        while(n>0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if(temp==sum)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Plaindrome Number");
    }
}
