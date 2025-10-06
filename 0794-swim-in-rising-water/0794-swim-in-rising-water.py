class Solution(object):
    def swimInWater(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        n = len(grid)
        directions = [(-1,0), (1,0), (0,1), (0, -1)]

        pq = [(grid[0][0], 0, 0)]

        visited = [[False] * n for _ in range(n)]
        visited[0][0] = True

        while (pq):
            t, x, y = heapq.heappop(pq)
            if(x==n-1 and y==n-1):
                return t

            for dx,dy in directions:
                nx, ny = x+dx, y+dy

                if(0<=nx<n and 0<=ny<n and not visited[nx][ny]):
                    visited[nx][ny] = True
                    heapq.heappush(pq, (max(t, grid[nx][ny]), nx, ny))

        return -1