package src.JavaPracticeProgram;

public class ReverseNew {
    public static void main(String[] args) {
    String name="Hello World";
    String rev="";
    int ch;
       /* for (int i = name.length()-1; i >=0 ; i--) {
            rev=rev+name.charAt(i);
        }*/

        for (int i = 0; i <name.length() ; i++) {
            rev=name.charAt(i)+rev;

            // OR ch=name.charAt(i);
            //rev=ch+rev
        }
        System.out.println(rev);

        //character Array approach
       /* char[] a=name.toCharArray();
        int len=a.length;
        for (int i = len-1; i >0 ; i--) //e.g. 3 2 1 0 -1
        {
            rev=rev+a[i];//dlroW-->i=3 2 1 0...
        }
        System.out.println("Reversed String is:+rev");*/
    }

}
