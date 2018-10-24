class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1Len = nums1.length;
        int num2Len = nums2.length;
        if (num1Len > num2Len) return findMedianSortedArrays(nums2, nums1);
        int num1Min = 0, num1Max = num1Len, halfLen = (num1Len + num2Len + 1) / 2;
        
        while (true) {
            int nums1Index = (num1Min + num1Max) / 2;
            int nums2Index = halfLen - nums1Index;
            if (nums1Index < num1Max && nums2[nums2Index-1] > nums1[nums1Index]) num1Min = nums1Index + 1;
            else if (nums1Index > num1Min && nums1[nums1Index-1] > nums2[nums2Index]) num1Max = nums1Index - 1;
            else {
                int maxLeft = 0;
                if (nums1Index == 0) maxLeft = nums2[nums2Index-1];
                else if (nums2Index == 0) maxLeft = nums1[nums1Index-1];
                else maxLeft = Math.max(nums1[nums1Index-1], nums2[nums2Index-1]);
                
                if ((num1Len + num2Len) % 2 == 1) return maxLeft;
                int minRight = 0;
                if (nums1Index == num1Len) minRight = nums2[nums2Index];
                else if (nums2Index == num2Len) minRight = nums1[nums1Index];
                else minRight = Math.min(nums2[nums2Index], nums1[nums1Index]);

                return (double) (maxLeft + minRight) / 2;
            }
        }
    }
}