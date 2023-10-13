package hashingQuestions;
import java.util.HashMap;

public class majorityElements {
    public static void main(String[] args) {//O(n) complexity bruteforce 2 nested for loop but complexity O(n^2)
        int nums[]={1,2};//1
        majorityelement(nums);
    }
    public static void majorityelement(int nums[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){//true
                map.put(nums[i], map.get(nums[i])+1);
            }else{//false
                map.put(nums[i], 1);
            }
        }
        for( int key: map.keySet()){
            if(map.get(key) > nums.length/3){
                System.out.println(key);
            }

        }
    }
}
