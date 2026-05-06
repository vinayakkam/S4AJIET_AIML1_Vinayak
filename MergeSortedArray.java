class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=nums1.length;
        int j=0;
        int temp;
        if(m==0){
            for(int i=m;i<k;i++){
                nums1[i]=nums2[j];
                j++;
            }
            for(int i=0;i<k;i++){
                for(j=0;j<k-i-1;j++){
                    if(nums1[j]>nums1[j+1]){
                        temp=nums1[j];
                        nums1[j]=nums1[j+1];
                        nums1[j+1]=temp;
                    }
                }
            }
        }
        else if(n==0){
            return;
        }
        else{
            for(int i=m;i<k;i++){
                nums1[i]=nums2[j];
                j++;
            }
            for(int i=0;i<k;i++){
                for(j=0;j<k-i-1;j++){
                    if(nums1[j]>nums1[j+1]){
                        temp=nums1[j];
                        nums1[j]=nums1[j+1];
                        nums1[j+1]=temp;
                    }
                }
            }
        }
              
        
    }
}
