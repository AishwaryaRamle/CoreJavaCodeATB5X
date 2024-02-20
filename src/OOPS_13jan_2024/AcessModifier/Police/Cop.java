package src.OOPS_13jan_2024.AcessModifier.Police;

public class Cop {
    public int gun;
    // modifier return name_variable

    public Cop(int gun)
    {
    this.gun=gun;
    }

    protected void canIShoot()
    {
        System.out.println("Of-course, Shoot");
    }
    void printdetails()
    {
        System.out.println("Contain Cops and Junior Cops Details in this Package");
    }
}
