package hashingQuestions;
import java.util.HashSet;

public class UnionOfArray {
    public static void main(String[] args) {
        int[] A={2,3,4,5,5,3,2,4,5};
        int[] B={2,3,4};
        System.out.println(unionArray(A, B));
        System.out.println( Intersection(A, B));

    }
    public static int unionArray(int[] A, int[] B){
        HashSet<Integer> set=new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        for (int j = 0; j < B.length; j++) {
            set.add(B[j]);
            
        }
       return set.size();
        
    }
    public static int Intersection(int[] A, int[] B){
        HashSet<Integer> set2=new HashSet<>();
        
        for (int i = 0; i < A.length; i++) {
            set2.add(A[i]);
        }
        int count=0;
        for (int j = 0; j < B.length; j++) {
            
            if(set2.contains(B[j])){
                count++;
                set2.remove(B[j]);
            }
        }
        return count;
    }
}
