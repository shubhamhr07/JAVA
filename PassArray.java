class PassArray{
    public static void main(String[] args){
        int[] num = {2,4,6,8,10,12};
        arrayDisplay(num);
    }
    public static void arrayDisplay(int[] nums){
        for(int i=0;i<nums.length;i++)
            System.out.println("num["+i+"] = "+nums[i]);
    }
}