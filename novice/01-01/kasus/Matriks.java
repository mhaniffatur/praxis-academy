import java.util.Scanner;

public class Matriks
{
    Scanner input = new Scanner(System.in);

    public void input(int baris, int kolom, int [][] matrix)
    {
        for (int i = 0; i < baris; i++)
        {
            for (int j = 0; j < kolom; j++)
            {
                System.out.print("Masukkan elemen ke-["+i+"]["+j+"] dari matrix = ");
                matrix[i][j] = input.nextInt();
            }       
        }
    }

    public void output(int [][] matrix) 
    {
       for (int i = 0; i < matrix.length; i++)
       {
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }       
            System.out.println();
        }
    }

    public void plus(int [][] matrixA, int [][] matrixB)
    {
       for (int i = 0; i < matrixA.length; i++)
       {
            for (int j = 0; j < matrixA[0].length; j++)
            {
                System.out.print(matrixA[i][j] + matrixB[i][j] + " ");
            }       
            System.out.println();
        }
    }
}