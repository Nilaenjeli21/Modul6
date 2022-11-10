/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_6;

/**
 *
 * @author Administrator
 */
    import java.util.Scanner;

public class Latihan4 {
    public static void main (String[] args){
        
      
        
        Scanner b = new Scanner(System.in);
        
        System.out.println("--------->Program Perpangkatan<---------");
        System.out.print("Masukkan nilai angka : ");
        int input = b.nextInt();

        System.out.print("Masukkan nilai pangkat : ");
        int pangkat = b.nextInt();

        int i = 0;
        int h = 1;
        
        do{
           
           h = h*input;
           i++; 
          
        }while(i<pangkat);
        
        System.out.println("Hasil dari" + " ==> " + input + " ^ " + pangkat + " = " + h);
    }
}
