import java.util.*;
class abc{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String a[]=new String[10];
        for(int i=0;i<10;i++){
            a[i]=in.nextLine();
        }
        System.out.println("Enetr The index");
        int x=in.nextInt();
        System.out.println("Value -"+a[x]);
    }
}