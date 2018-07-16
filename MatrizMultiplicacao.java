package estudo1;

import java.util.Scanner;

public class MatrizMultiplicacao 
{

  public static void main(String[] args) 
  {
    Scanner ler = new Scanner(System.in);

    int n = 4; // ordem da matriz quadrada
    int i, j, k, sm;
    int a[][] = new int[n][n];
    int b[][] = new int[n][n];
    int ab[][] = new int[n][n];

// entrada de dados
    System.out.printf("Matriz 1\n");
    for (i=0; i<n; i++) 
    {
      System.out.printf("Informe os elementos da %da. linha:\n", (i+1));
      for (j=0; j<n; j++) 
      {
        System.out.printf("a[%d][%d] = ", i, j);
        a[i][j] = ler.nextInt();
      }
      System.out.printf("\n");
    }

    System.out.printf("Matriz 2\n");
    for (i=0; i<n; i++) 
    {
      System.out.printf("Informe os elementos da %da. linha:\n", (i+1));
      for (j=0; j<n; j++) 
      {
        System.out.printf("b[%d][%d] = ", i, j);
        b[i][j] = ler.nextInt();
      }
      System.out.printf("\n");
    }

// processamento: multiplicando as matrizes de entrada
    for (i=0; i<n; i++) 
    {
      for (j=0; j<n; j++) 
      {
        sm = 0;
        for (k=0; k<n; k++) 
        {
          sm = sm + (a[i][k] * b[k][j]);
        }
        ab[i][j] = sm;
      }
    }

// saida
    System.out.printf("\n1a. Matriz\n");
    for (i=0; i<n; i++) 
    {
      System.out.printf("%da. linha: ", (i+1));
      for (j=0; j<n; j++) 
      {
        System.out.printf("%d ", a[i][j]);
      }
      System.out.printf("\n");
    }

    System.out.printf("\n2a. Matri\n");
    for (i=0; i<n; i++) 
    {
      System.out.printf("%da. linha: ", (i+1));
      for (j=0; j<n; j++) 
      {
        System.out.printf("%d ", b[i][j]);
      }
      System.out.printf("\n");
    }

    System.out.printf("\nProduto\n");
    for (i=0; i<n; i++) 
    {
      System.out.printf("%da. linha: ", (i+1));
      for (j=0; j<n; j++) 
      {
        System.out.printf("%d ", ab[i][j]);
      }
      System.out.printf("\n");
    }
  }
}