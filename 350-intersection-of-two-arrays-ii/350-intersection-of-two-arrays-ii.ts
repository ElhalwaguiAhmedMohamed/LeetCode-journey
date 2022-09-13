function intersect(nums1: number[], nums2: number[]): number[] {
    const intersection = [];
    let short, long;
    if(nums1.length < nums2.length) {
        short = nums1;
        long = nums2;
    } 
    else 
    {
        short = nums2;
        long = nums1;
    }
    
    for(const num of short){
        //Intersection
        if(short.includes(num) && long.includes(num)){
            intersection.push(num);
            const index = long.indexOf(num);
            long.splice(index,1);
        }
    }
    return intersection;
};