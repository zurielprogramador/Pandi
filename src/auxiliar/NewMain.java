/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.util.Random;

/**
 *
 * @author litzy
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numbers= new int[16];
    int count=0;
    while(count<16){
    Random r= new Random();
    int na=r.nextInt(8)+1;
    int n=0;
        for (int i = 0; i < 16; i++) {
            if(numbers[1]==na){
            n++;
            }
        }
        if(n<2){
        numbers[count]=na;
        count++;
        }
        // TODO code application logic here
        
            
        
        }
    for (int i = 0; i < 16; i++) {
    System.out.print(numbers[i]+" ");
    }
    
    }
}
