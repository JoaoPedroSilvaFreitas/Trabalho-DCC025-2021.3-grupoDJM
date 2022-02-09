package ufjf.dcc025.grupodmj.controller.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Arquivo 
{

    public static String lerArquivo(String caminho) throws FileNotFoundException 
    {
        StringBuilder conteudo = new StringBuilder();
        File arquivo = new File(caminho);
        Scanner sc = new Scanner(arquivo);
        
        while (sc.hasNextLine()) 
        {
            conteudo.append(sc.nextLine()).append("\n");
        }

        return conteudo.toString();
    }

    public static void escreverArquivo(String caminho, String conteudo) throws IOException 
    {
        FileWriter fwArquivo;
        BufferedWriter bwArquivo;

        File arquivo = new File(caminho);
        fwArquivo = new FileWriter(arquivo, false);
        bwArquivo = new BufferedWriter(fwArquivo);

        bwArquivo.write(conteudo);

        bwArquivo.close();
        fwArquivo.close();

    }
}