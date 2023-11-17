
package pideciuygulamasi;

import java.util.Scanner;


public class Uygulama {

   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int secim = -1,n;
        System.out.println("Kuyruk yapisinin eleman sayisi:"); n=scanner.nextInt();
        Queue kuyruk =new Queue(n);
        
        while(secim!=0){
            System.out.println("1- Yeni Musteri Ekle:");
            System.out.println("2- Bekleyen Musterileri Yazdir:");
            System.out.println("3- Satis Yap:");
            System.out.println("4- Toplam Gelir:");
            System.out.println("0- Cikis:");
            System.out.print("Seciminiz:");
            secim=scanner.nextInt();
            
            
            
            switch(secim){
            case 1:kuyruk.enQueue();
            break;
            case 2:kuyruk.print();
            break;
            case 3:kuyruk.deQueue();
            break;
            case 4:System.out.println("Toplam Gelir:"+kuyruk.toplamGelir);
            break;
            case 0:System.out.println("Cikis Yaptiniz.");
            break;
            default:System.out.println("Hatali İslem.");
            
            }
        }
        
        
    }
    
}
