package Sequentiasearch;

import java.util.Scanner;

/**
 *
 * @author grand
 */
public class Pratikum1 {
    public static void main(String[] args){
        
        int cari;
        int a=0;
        boolean found=false;
        int[]data=new int[]{74,98,72,74,72,90,81,72};
        Scanner input=new Scanner(System.in);
        
        System.out.println("Data pada array:");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+"\t");
        if(data[i]<a){
                a=data[i];
        }
        
    }
        System.out.print("\nMasukkan nilai yang ingin dicari:");
        cari=input.nextInt();

        for(int i=0;i<data.length;i++){
            if(cari == data[i]){
                a++;
            }
            
        }
        System.out.println("Data yang dicari ditemukan sebanyak "+a+" kali");
        if(a == 0){
            System.out.println("Data tidak ditemukan!");
        }
    }
}
    
        
                

        
    

    

