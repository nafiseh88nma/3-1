/**
 * Created by admin on 10/5/2019.
 */
public class Main {
    public static void main(String[] args) {
        try
        {
            transferMoney(-9);
        }
        catch (Melli melli) {
            melli.printStackTrace();
        }
    }
    public  static  void transferMoney( int x) throws Melli
    {
        System.out.println("start");
        if (x<=0)
        {
            throw new Melli("Traanfer Money Error");
        }else {
            System.out.println("ok");
        }
        System.out.println("end");
    }
}
