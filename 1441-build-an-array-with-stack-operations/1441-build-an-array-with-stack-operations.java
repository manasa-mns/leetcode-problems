class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res=new ArrayList<>();
        int indextarget=0;
        for(int i=1;i<=n;i++){
            res.add("Push");
            if(indextarget<target.length && i==target[indextarget]){
                indextarget++;
            }else{
                res.add("Pop");
            }
            if(indextarget==target.length){
                break;
            }
        }
        return res;
    }
}