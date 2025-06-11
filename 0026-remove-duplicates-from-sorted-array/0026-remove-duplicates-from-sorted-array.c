int removeDuplicates(int* nums, int numsSize) {
    int j=0;
    int k=0;
    for (int i=0; i<numsSize; i++){
        if (nums[j]!=nums[i]){
            k++;
            j++;
            nums[j] = nums[i];
        }
    }

    return k+1;
}