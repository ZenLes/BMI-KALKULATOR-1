
import java.util.Scanner;

public class BmiKalkulator {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Masukkan tinggi badan Anda: ...Cm");
        double tinggiBadan = input.nextDouble();
        System.out.println("Silahkan Masukan berat badan Anda: ...KG");
        double beratBadan = input.nextDouble();
        double tinggiBadanM = tinggiBadan / 100.0;
        double bmi = hitungBMI(tinggiBadanM, beratBadan);
        System.out.println("BMI kamu adalah: " + bmi);

        if (bmi < 18.5)
        {
            System.out.println("Saat ini Kamu kekurangan Gizi");
        }
        else if (bmi >= 18.5 && bmi <= 24.9)
        {
            System.out.println("Berat badan kamu normal");
        }
        else if (bmi >= 25 && bmi <= 29.9)
        {
            System.out.println("Saat ini Berat Badan Anda melebihi rata rata");
        }
        else
        {
            System.out.println("Saat ini Anda Terkena Obesitas");
        }
    }
    private static double hitungBMI(double tinggiBadanM, double beratBadan)
    {
        return beratBadan / (tinggiBadanM * tinggiBadanM);
    }
}


