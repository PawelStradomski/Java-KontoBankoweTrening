
package treningkontobankowe;
/**
 * 
 * @author pawelstradomski
 */

public class TreningKontoBankowe {

   
    public static void main(String[] args) {
        
        KontoBankowe oszczednosciowe = new KontoBankowe();
        {
            if(oszczednosciowe.wyplac(50))
                System.out.println("wyplacono");
            else
                System.out.println("nie wyplacono");
        }
        {
            if(oszczednosciowe.wplac(10))
                System.out.println("wplacono");
            else
                System.out.println("za mala wplata");
        }
        System.out.println("Na koncie masz" + oszczednosciowe.getSaldo());
        
    }
    
}
class KontoBankowe
{
    public KontoBankowe()
    {
        saldo = 1000;
    }
    int getSaldo()
    {
        return saldo;
    }
    boolean setSaldo(int saldo)
    {
        this.saldo = saldo;
        return true;
    }
    boolean wplac(int ile)
    {
        if(ile<100)
            return false;
        saldo += ile;
        return true;
    }
    boolean wyplac(int ile)
    {
        if(ile>saldo)
            return false;
        saldo -= ile;
        return true;
    }
    
    
    
    private int saldo;
}