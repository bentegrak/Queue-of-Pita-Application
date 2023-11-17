
package pideciuygulamasi;

import java.util.Scanner;


public class Queue {
    
    Scanner scanner=new Scanner(System.in);
    Node front;
    Node rear;
    int size;
    int cnt;
    String isim;
    int adet;
    int toplamGelir=0;
    
    public Queue(int size){
        this.size=size;
        cnt=0;
        front=null;
        rear=null;
    }
    
    
    
    void enQueue(){
        if(isFull()){
            System.out.println("Kuyruk Sirasi Dolu.");
        }
        else{
            System.out.print("Musteri Ismi:"); isim=scanner.nextLine();
            System.out.print("Pide Sayisi:"); adet=scanner.nextInt();
            scanner.nextLine();
            Node eleman=new Node(isim,adet);
            if(isEmpty()){
                front=eleman;
                rear=eleman;
                System.out.println("Ilk Musteri siraya girdi.");
            }
            else{
                rear.next=eleman;
                rear=eleman;
                System.out.println(rear.isim + "Isimli Musteri siraya girdi");
            }
            cnt++;
        }
    
    }
    
    void print(){
        if(isEmpty()){
            System.out.println("Kuyrukta Kimse Yok.");
        }
        else{
            Node temp=front;
            System.out.println("Kuyruktaki Insanlar:");
            while(temp!=null){
                System.out.println("|"+temp.isim+""+"|");
                temp=temp.next;
            }
        }
    }
    
    void deQueue(){
        if(isEmpty()){
            System.out.println("Kuyruk Bos.");
        }
        else{    
            toplamGelir+=front.ucret;
            System.out.println(front.isim+ " "+front.adet+"Adet pidesini aldi,Toplam Borcu="+front.ucret);
            front=front.next;
            cnt--;           
        }
    }
    
    boolean isEmpty(){
        return cnt==0;
    }
    
    boolean isFull(){
        return cnt==size;
    }
}
