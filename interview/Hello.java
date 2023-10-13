//Print Hello world remove all vowels
public class Hello {
    public static void main(String[] args) {
        skip("", "Hello World");
    }
    public static void skip(String unvowel, String vowel){
        if(vowel.isEmpty()){
            System.out.println(unvowel);
            return;
        }
        char Ch=vowel.charAt(0);
        if(Ch=='a'||Ch=='e'||Ch=='i'||Ch=='o'||Ch=='u'){
            skip(unvowel, vowel.substring(1));
        }else{
            skip(unvowel+Ch, vowel.substring(1));
        }
    }
    
}
