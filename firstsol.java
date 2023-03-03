
    public class Main{
        public static void main(String [] args){
        Solution sol = new Solution();
        int[] array=new int[]{1,2,3,4};
        sol.runningSum(array);
        returnSum(array);
        
    }
    public static void returnSum(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    }
  
    class Solution{
        public int[] runningSum(int[] nums) {
            int x=0;
            for(int i=nums.length-1;i>0;i--){
                x=nums[i];
                for(int j=0;j<i;j++){
                    x=x+nums[j];
                }
                nums[i]=x;
                x=0;
            }
            return nums;
       
    }
    }
   
