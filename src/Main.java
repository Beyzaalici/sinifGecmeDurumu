import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.println("Turkce notunuz: ");
        turkce = input.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.println("Muzik notunuz: ");
        muzik = input.nextInt();

        double ortalama = (mat+fizik+turkce+kimya+muzik)/5;



      if(ortalama<=55){
            System.out.println("sinifta kaldiniz, seneye tekrar gorusmek uzere !");

        }else{
            System.out.println("Tebrikler, sinifi gectiniz");
        }
        System.out.println("ortalama: "+ ortalama);
      
    }
}
