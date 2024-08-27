class Solution(object):
    def maxProbability(self, n, edges, succProb, start_node, end_node):
        distance = [0]*n
        distance[start_node]=1

        for _ in range(n-1):
            update=False
            for i, (u,v) in enumerate(edges):
                if distance[u]*succProb[i] > distance[v]:
                    distance[v] = distance[u]*succProb[i]
                    update=True
                if distance[v]*succProb[i] > distance[u]:
                    distance[u] = distance[v]*succProb[i]
                    update=True

            if not update:
                break
            
        return distance[end_node]