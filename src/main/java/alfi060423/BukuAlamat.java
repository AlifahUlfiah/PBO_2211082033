package alfi060423;

import java.util.Scanner;

public class BukuAlamat {
    public static void main (String args []) {
        EntryBukuAlamat data[] = new EntryBukuAlamat[100];
        int pil=0;
        int index=0;
        
        Scanner in = new Scanner(System.in);
        while(pil !=5 && pil < 5){
            System.out.println("1. Memasukkan Data");
            System.out.println("2. Menghapus Data");
            System.out.println("3. Menampilkan seluruh Data");
            System.out.println("4. Update Data");
            System.out.println("5. Exit");
            System.out.print("Jalankan perintah nomor = ");
            System.out.println();
            pil = in.nextInt();
            
            switch(pil) {
                case 1:
                    EntryBukuAlamat temp = new EntryBukuAlamat();
                    System.out.print("Nama      : ");
                    temp.setNama(in.nextLine());
                    System.out.print("Alamat    : ");
                    temp.setAlamat(in.nextLine());
                    System.out.print("Telepon   : ");
                    temp.setTelepon(in.nextLine());
                    System.out.print("Email     : ");
                    temp.setEmail(in.nextLine());
                    System.out.println();
                    data[index] = temp;
                    index++;
                    break;
                 
                case 2:
                    EntryBukuAlamat del = new EntryBukuAlamat();
                    System.out.print("index = ");
                    index = in.nextInt();
                    del.setNama(null);
                    del.setAlamat(null);
                    del.setTelepon(null);
                    del.setEmail(null);
                    System.out.println();
                    data[index] = del;
                    break;
                    
                case 3:
                    for(int i=0;i<100;i++){
                        EntryBukuAlamat tam = new EntryBukuAlamat();
                        System.out.println("data ke-"+(index+1));
                        System.out.println("Nama      : "+tam.getNama());
                        System.out.println("Alamat    : "+tam.getAlamat());
                        System.out.println("Telepon   : "+tam.getTelepon());
                        System.out.println("Email     : "+tam.getEmail());
                        System.out.println();
                    }
            }
        }
    }
}
