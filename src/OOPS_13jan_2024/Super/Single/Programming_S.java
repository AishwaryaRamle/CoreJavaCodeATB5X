package src.OOPS_13jan_2024.Super.Single;

public class Programming_S {
        int version;
        String author;

        Programming_S()
        {

            System.out.println("I am default");
        }


        Programming_S(int version, String author)
        {
            this.author = author;
            this.version = version;
        }

        void printInfo()
    {
        System.out.println("This Programming Language is Created by " + author + " Had version :  " + version);
    }
    }

