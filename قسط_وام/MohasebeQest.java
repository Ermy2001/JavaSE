import java.util.Scanner;


public class MohasebeQest{
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("لطفا مبلغ وام خود را به میلیون وارد کنید: ");
    float mablaqVam = scanner.nextFloat();


    System.out.print("لطفا تعداد سال را وارد کنید: ");
    int tedadMah = scanner.nextInt();


    System.out.print("لطفا سود وام را وارد کنید: ");
    float sodVam = scanner.nextFloat();

    double q = mwqdarQest(mablaqVam, tedadMah, sodVam);

    System.out.println("مقدار پرداختی هر ماه شما :" + q);
  }

  public static double mwqdarQest(float v,int sal, float s){
    int m = sal*12;
    float darsadSod;
    darsadSod =s/1200;
    double darsadSodtavan;
    darsadSodtavan = Math.pow((darsadSod+1), m);
    double qest;
    qest = (darsadSodtavan *v *darsadSod) / (darsadSodtavan - 1);
    return qest;
  }
}