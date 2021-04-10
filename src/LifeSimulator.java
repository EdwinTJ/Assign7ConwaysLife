public class LifeSimulator extends ConwaysLife {
    private int sizeX;
    private int sizeY;
    private boolean grid[][];

    public LifeSimulator(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        grid = new boolean[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                grid[i][j] = false;
            }
        }
    }

    public int getSizeX() {
        return sizeX;
    }
    public int getSizeY() {
        return sizeY;
    }
    public boolean getCell(int x, int y) {
        return grid[x][y];
    }

    public void insertPattern (Pattern pattern, int startX, int startY) {
        for (int i = 0; i < pattern.getSizeX(); i++) {
            for (int j = 0; j < pattern.getSizeY(); j++) {
                grid[startX + i][startY + j] = pattern.getCell(i, j);
            }
        }
    }

    private boolean isValid(int x, int y) {
        if(x >= 0 && x < sizeX && y >= 0 && y < sizeY)
            return true;
        else
            return false;
    }

    private int countNeighbours(int x, int y) {
        int count =0 ;
        for(int i =x-1; i <= x+1; i++) {
            for(int j = y - 1; j <= y+1; j++) {
                if(isValid(i,j)) {
                    if(!(i==x && j == y) && grid[i][j])
                        count++;
                }
            }
        }
        return count;
    }

    public void update() {
        // for loop too update live or dead cells in pattern.
        boolean[][] newGrid = new boolean[sizeX][sizeY];
        for(int i =0; i < sizeX; i++) {
            for(int j = 0; j < sizeY; j++) {
                int count = countNeighbours(i, j);
                if(grid[i][j]) {
                    //living cell
                    if(count == 2 || count == 3)
                        newGrid[i][j] = true;
                    else
                        newGrid[i][j] = false; //dies of underpopulation or overpopulation
                }
                else {
                    //non-living
                    if(count == 3) //has 3 living neighbours, comes alive
                        newGrid[i][j] = true;
                    else
                        newGrid[i][j] = false;
                }
            }
        }
        grid = newGrid;
    }
}