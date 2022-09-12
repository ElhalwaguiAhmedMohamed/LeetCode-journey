function maxSubArray(nums: number[]): number {
    if(nums.length == 1)
        return nums[0];
    let local = 0 ;
    let global = -Infinity;
    
    for(const num of nums){
        local = Math.max(num , local+num)
        if(local > global) 
            global = local
    }
    return global;
};


