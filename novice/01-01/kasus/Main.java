import java.util.Scanner;

class  Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    Matriks matriks = new Matriks();

    int baris = 0;
    int kolom = 0;

    System.out.print("Masukkan jumlah kolom = ");
    baris = input.nextInt();
    System.out.print("Masukkan jumlah baris = ");
    kolom = input.nextInt();

    System.out.println("Matriks A");
    System.out.println("============================");
    int matrixA[][] = new int[baris][kolom];
    matriks.input(baris, kolom, matrixA);

    System.out.println("Matriks B");
    System.out.println("============================");
    int matrixB[][] = new int[baris][kolom];
    matriks.input(baris, kolom, matrixB);

    matriks.plus(matrixA, matrixB);

  }
}