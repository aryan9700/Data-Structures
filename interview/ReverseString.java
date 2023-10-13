import java.util.Arrays;

class ReverseString//inplace O(1)
    {
        public static void main(String[] args) {
            char[] s= {'h','e','l','l','o'};
            reverseString(s);
            System.out.println(Arrays.toString(s));
        }
    
    //     static void reverseString(char[] s){
    //         int start = 0;
    //         int end = s.length-1; //becoz index start with 0,1,2
    
    //         while(start < end){
    //             //swap
    //             swap(s, start, end);
    //             start++;
    //             end--;
    
    //         }}
    //         static void swap(char[] s,int index1 , int index2){
    //             char temp = s[index1];
    //             s[index1]=s[index2];
    //             s[index2]=temp;
    //            }
    // }
   
        public static void reverseString(char[] s){
    
            if(s == null || s.length <= 1){
                System.out.println("Invalid array.");
            }
            for (int i = 0; i < s.length / 2; i++) {
                char temp = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - 1 - i] = temp;
            }
            return;
        }
        }
