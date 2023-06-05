/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exerciciosjava;
import java.util.Scanner;

/**
 *
 * @author senai
 */
public class SobremesaElseIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resposta;
        System.out.println("Qual sobremesa deseja?1=Bombom 2=Pudim,3=Café");
        
        Scanner scanner= new Scanner (System.in);
        resposta= scanner.nextInt();
        
        if (resposta==1){
        System.out.println("Você Escolheu Bombom");
    }else if(resposta==2){
        System.out.println("Você Escolheu Pudim");
    }else if(resposta==3){
        System.out.println("Você Escolheu Café");
    }
    }
    
}
