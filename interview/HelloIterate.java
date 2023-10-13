public class HelloIterate {
    public static void main(String[] args) {
        StringBuilder build =new StringBuilder("Hello World");
        for (int i = 0; i < build.length(); i++) {
            if(build.charAt(i)=='a'||build.charAt(i)=='e'||build.charAt(i)=='i'||build.charAt(i)=='o'||build.charAt(i)=='u')
            {
                build.deleteCharAt(i);
            }
        }
        System.out.println(build);
        
    }
}
