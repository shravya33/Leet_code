int maxAdjacentDistance(int* nums, int numsSize) {
    if (numsSize<2){
        return 0;
    }
    
    int max=abs(nums[0]-nums[numsSize-1]);

    for(int i=0; i<numsSize-1; i++){
        int dif = abs(nums[i] - nums[i+1]);

        if(dif>max){
            max=dif;
        }
    }

    return max;
}