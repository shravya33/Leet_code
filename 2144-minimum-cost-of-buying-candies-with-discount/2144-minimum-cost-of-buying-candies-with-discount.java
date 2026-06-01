class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int totalcost=0;
        int count=0;

        // if(cost.length<3){
        //     for (int c : cost) {
        //         totalcost += c;
        //     }

        //     return totalcost;
        // }

        for(int i=cost.length-1; i>=0; i--){
            count++;
            if(count % 3 !=0 ){
                totalcost+=cost[i];
            }
        }

        return totalcost;
    }
}