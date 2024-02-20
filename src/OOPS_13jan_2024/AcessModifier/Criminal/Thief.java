package src.OOPS_13jan_2024.AcessModifier.Criminal;

import src.OOPS_13jan_2024.AcessModifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c=new Cop(10);
        System.out.println(c);
       // c.canIShoot(); Thief is outside Police Folder
        //He is not in the Protect Police folder
    }
}
