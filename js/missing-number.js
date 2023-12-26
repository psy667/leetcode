// https://leetcode.com/problems/missing-number

const missingNumber = function(nums) {
    let sum = 0;
    
    for(let i = 0; i<nums.length; i++) {
        sum+=nums[i];     
    }

    return (nums.length+1) * nums.length  / 2 - sum;
};
