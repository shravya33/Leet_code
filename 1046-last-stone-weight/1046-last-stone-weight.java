class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int s : stones){
            pq.offer(s);
        }

        while(pq.size()>1){
            int y = pq.poll();
            int x = pq.poll();

            if(x!=y){
                pq.offer(y-x);
            }
        }

        if(pq.isEmpty()){
            return 0;
        }

        return pq.peek();
    }
}