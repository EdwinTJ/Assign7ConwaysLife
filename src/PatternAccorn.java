class PatternAcorn extends Pattern {
    boolean acorn[][];
    public int sizeX = 7;
    public int sizeY = 3;

    public PatternAcorn() {
        acorn = new boolean[][] {
                { false, true, false, false, false, false, false },
                { false, false, false, true, false, false, false },
                { true, true, false, false, true, true, true }
        };
    }

    public PatternAcorn(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    @Override
    public boolean getCell(int x, int y) {
        return acorn[x][y];
    }
    @Override
    public int getSizeX() {
        return sizeX;
    }
    @Override
    public int getSizeY() {
        return sizeY;
    }
}
