class PatternBlinker extends Pattern {
    boolean blinker[][];
    public int sizeX;
    public int sizeY;

    public PatternBlinker() {
        blinker = new boolean[][] {
                { false, true, false, false, false, false, false },
                { false, false, false, true, false, false, false },
                { true, true, false, false, true, true, true }
        };
        this.sizeX = 7;
        this.sizeY = 3;
    }

    public PatternBlinker(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    @Override
    public boolean getCell(int x, int y) {
        return blinker[y][x];
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
