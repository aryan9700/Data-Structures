import java.util.Scanner;
//time complexity 0(root n) scape complexity 0(1)
public class primeOrNot{
    public static void main(String[] args) {
        
      Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
           if(num==1){
            System.out.println("not a prime");
            return;
        }
        int c = 2;
        while (c*c <= num) {
            if(num%c==0){
                System.out.println("not a prime");
                return;
            }c++;
    } System.out.println("output prime");
}
        
//         for (int c = 2; c < num; c++) {
//             if(num%c==0){
//                 System.out.println("not a prime");
//                 return;
//             }
//     } System.out.println("output prime");
// }
}