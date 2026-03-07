package dsa.collections.maps;

import java.util.HashMap;

public class FrequencyMap {
    public static void main(String[] args) {
        int[]arr={1,2,2,3,1,4};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            //{1=0+1}->1,{2=1+1}->2....
            map.put(num,map.getOrDefault(num,0)+1);
            //takes in the first value = index value+1
        }
        System.out.println(map);
        System.out.println(map.get(2));//prints how many two's are there
    }
}
