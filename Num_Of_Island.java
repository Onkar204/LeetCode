public class Num_Of_Island {

    public static int numIslands(char[][] grid) {

        int count = 0;

        // Traverse whole grid
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                // If land found
                if(grid[i][j] == '1')
                {
                    count++;

                    // Visit all connected land
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    public static void dfs(char[][] grid, int i, int j)
    {
        // Boundary conditions
        if(i < 0 || j < 0 || 
           i >= grid.length || 
           j >= grid[0].length || 
           grid[i][j] == '0')
        {
            return;
        }

        // Mark visited
        grid[i][j] = '0';

        // Explore 4 directions
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }

    public static void main(String args[])
    {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

        int result = numIslands(grid);

        System.out.println("Number of Islands: " + result);
    }
}