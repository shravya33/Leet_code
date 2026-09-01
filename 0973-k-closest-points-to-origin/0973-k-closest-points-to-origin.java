class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> pq = new PriorityQueue<>((a,b)-> Integer.compare(b[0],a[0]));

        for(int[] p : points){
            int dist = p[0]*p[0] + p[1]*p[1];
            pq.offer(new int[]{dist,p[0],p[1]});

            if(pq.size()>k){
                pq.poll();
            }
        }

        int[][] ans = new int[k][2];
        for(int i=0; i<k; i++){
            int[] current = pq.poll();
            ans[i][0] = current[1];
            ans[i][1] = current[2];
        }

        return ans;
    }
}