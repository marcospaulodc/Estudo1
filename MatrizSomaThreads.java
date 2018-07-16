package estudo1;

import java.util.Random;
import javax.swing.JOptionPane;

public class MatrizSomaThreads extends Thread{

    static int linhas1, colunas1, linhas2, colunas2;
    static int[][] matriz1;
    static int[][] matriz2;
    int [][] matrizSoma;
    static int lin = 0, col = 0;

    public void run()
    {
        if((linhas1 == linhas2) && (colunas1 == colunas2))
        {
            matrizSoma = new int[linhas1][colunas1];
            matrizSoma[lin][col] = matriz1[lin][col] + matriz2[lin][col];
            col++;
            if(col == colunas1 - 1)
            {
                lin++;
                col = 0;
            }
        }else
        {
            System.out.println("Não se pode somar essas duas matrizes");
        }

    }

    public static void main(String[] args)
    {
        linhas1 = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas deseja que a primeira matriz tenha?"));
        colunas1 = Integer.parseInt(JOptionPane.showInputDialog("Quantas colunas deseja que a primeira matriz tenha?"));
        linhas2 = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas deseja que a segunda matriz tenha?"));
        colunas2 = Integer.parseInt(JOptionPane.showInputDialog("Quantas colunas deseja que a segunda matriz tenha?"));
        matriz1 = new int[linhas1][colunas1];
        matriz2 = new int[linhas2][colunas2];

        //Objeto Random para gerar números aleatórios
        Random gerador = new Random();

        //para a primeira matriz
        for(int i = 0; i < linhas1; i++)
        {
            for(int j = 0; j < colunas1; j++)
            {
                matriz1[i][j] = gerador.nextInt(100);
            }
        }

        //para a segunda matriz
        for(int i = 0; i < linhas2; i++)
        {
            for(int j = 0; j < colunas2; j++)
            {
                matriz2[i][j] = gerador.nextInt(100);
            }
        }

        //Criando as Threads
        for(int i = 0; i < colunas1; i++)
        {
            for(int j = 0; j < linhas1; j++)
            {
                new Thread().start();    
            }
        }    

    }

}