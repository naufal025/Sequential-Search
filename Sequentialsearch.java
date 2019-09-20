
package sequentialsearch;
import java.util.Scanner;
public class Sequentialsearch {
    public static void main(String[] args){
        String cari;
        boolean found = false;
        String[] makanan = new String []{"tempe","ayam goreng","Semur daging","Soto","Rawon"};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data yang ingin dicari");
        cari = input.nextLine();
        for (int i = 0; i < makanan.length; i++){
            if(cari.equalsIgnoreCase(makanan[i])){
                found = true;
                break;
            }
        
    }
        if (found == true) {
            System.out.println("Data ditemukan:");
        }else{
            System.out.println("Data tidak ditemukan:");
        }
    }
}

    