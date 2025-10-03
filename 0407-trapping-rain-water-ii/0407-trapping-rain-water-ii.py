class Solution(object):
    def trapRainWater(self, heightMap):
        """
        :type heightMap: List[List[int]]
        :rtype: int
        """
        m = len(heightMap)
        n = len(heightMap[0])

        min_heap =[]
        visited = [[False]*n for _ in range(m)]
        directions =[(-1,0), (1,0), (0,-1), (0,1)]

        for i in range(m):
            for j in range(n):
                if (i==0) or (i==m-1) or (j==0) or (j==n-1):
                    heapq.heappush(min_heap, (heightMap[i][j],i,j))
                    visited[i][j] = True
        
        water=0
        while min_heap:
            height, x, y = heapq.heappop(min_heap)

            for dx, dy in directions:
                nx,ny = x+dx, y+dy

                if((0 <= nx < m) and (0<=ny<n) and not visited[nx][ny]):
                    if heightMap[nx][ny] < height:
                        water = water + (height - heightMap[nx][ny])

                    heapq.heappush(min_heap, (max(heightMap[nx][ny], height) , nx, ny))
                    visited[nx][ny] = True

        return water 