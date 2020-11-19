package leetcode1293;


public int shortestPath(int[][] grid, int k) {
        if(grid == null || grid.length == 0 || grid[0].length == 0){
        return -1;
        }

        int m = grid.length;
        int n = grid[0].length;

        int [][] visited = new int[m][n];
        for(int [] arr : visited){
        Arrays.fill(arr, Integer.MAX_VALUE);
        }

        int level = 0;
        LinkedList<int []> que = new LinkedList<>();
        if(grid[0][0] == 0){
        que.add(new int[]{0, 0, 0});
        visited[0][0] = 0;
        }else{
        if(k < 1){
        return -1;
        }

        que.add(new int[]{0, 0 ,1});
        visited[0][0] = 1;
        }

        int [][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        while(!que.isEmpty()){
        int size = que.size();
        while(size-- > 0){
        int [] cur = que.poll();
        if(cur[0] == m - 1 && cur[1] == n - 1){
        return level;
        }

        for(int [] dir : dirs){
        int x = cur[0] + dir[0];
        int y = cur[1] + dir[1];
        if(x < 0 || x >= m || y < 0 || y >= n){
        continue;
        }

        int step = grid[x][y] + cur[2];
        if(step > k || visited[x][y] <= step){
        continue;
        }

        que.add(new int[]{x, y, step});
        visited[x][y] = step;
        }
        }

        level++;
        }

        return -1;
        }
        }