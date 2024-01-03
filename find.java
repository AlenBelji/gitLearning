import java.util.*;
public class find {
    public static void main(String args[]){
        int x[]={1,2,3,4,5,6,7,8,9,10};
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number to find");
        int y=in.nextInt();
        for(int i=0;i<10;i++){
            if(x[i]==y)
            System.out.println("found it");
        }
        in.close();
    }
}
