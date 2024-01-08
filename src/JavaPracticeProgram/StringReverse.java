package src.JavaPracticeProgram;

public class StringReverse {
    public static void main(String[] args) {

    String name="Pramod";
    char[] charArray=name.toCharArray();
        System.out.println(charArray.length);

        int left=0;
        int right=charArray.length-1;
        while (left<right)
        {
            char temp=charArray[left]; //temp value =p
            charArray[left]=charArray[right]; //left value=d
            charArray[right]=temp;//right value =p
            left++;
            right--;
        }
        String rev_name=new String(charArray);
       System.out.println(rev_name);
    }
}


