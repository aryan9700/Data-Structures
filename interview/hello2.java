public class hello2 {
    public static void main(String[] args) {
        String hello ="Hello my name is khan";
         String str[]=hello.split(" ");
        System.out.println(str.length);
        for (int i = str.length-1; i >= 0; i--) {
            System.out.print(str[i]);
            System.out.print(" ");
        }  
    }
   
       
}
