package src.OOPS_13jan_2024.Interface.askInterviewQuestion;

public class RC2 {

}
class Lucky implements Pramod {

    @Override
    public void atb1() {

    }
}

interface Pramod extends Course
{
//    Pramod()  constructor cant be created of interface
//    {
//
//    }

    @Override
    void atb1();
}
interface Course
{
void atb1();
}
