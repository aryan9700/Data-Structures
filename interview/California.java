
public class California {
    public static void main(String[] args) {
        String s="california";
        System.out.println(exist(s));
    }
        public static boolean exist(String s){
      for (int i = 0; i < s.length(); i++) {
        if( s.charAt(i)=='l'){
            if( s.charAt(i+1)=='i' ){
                if( s.charAt(i+2)=='f' ){
                    if( s.charAt(i+3)=='o' ){
           return true;
                    }
           
                }
           
            }
        }   
      }
    return false;
}}