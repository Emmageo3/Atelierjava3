import java.util.Scanner;

public class TestValeur
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez le premier nombre");
        int nbr1 = sc.nextInt();

        System.out.println("Saisissez le second nombre");
        int nbr2 = sc.nextInt();

        int somme = nbr1 + nbr2;

        System.out.println("la somme de ces deux nombres est : " + somme);

        if (nbr1 > nbr2) {
            System.out.println(nbr1 + "est le plus grand nombre");
        } else{
            System.out.println(nbr2 + "est le plus grand nombre");
        }


    }
}