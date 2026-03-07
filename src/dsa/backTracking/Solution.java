package dsa.backTracking;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private void solve(int[]nums,List<Integer>output,int index,List<List<Integer>>ans){
        //Base Case
        if(index>=nums.length){
            ans.add(new ArrayList<>(output));//Add a copy of the subset//creates duplicates
            return;
        }
        //Exclude Case
        solve(nums,output,index+1,ans);
        //Include Case
        output.add(nums[index]);//Store that value and move to the next index
        solve(nums,output,index+1,ans);
        //BackTrack and remove the last answer from the output and go to next
        output.remove(output.size()-1);//output 2d array must be stored in ans that is in base class//to remove duplicates
        //to get the all the ans we need to backtrack that is -1
    }
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>output=new ArrayList<>();
        int index=0;
        solve(nums,output,index,ans);
        return ans;
    }
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[]nums={1,2,3};
        List<List<Integer>>result=solution.subsets(nums);
        for(List<Integer>subset:result){
            System.out.println(subset);
        }
    }
}
//Refer the notes