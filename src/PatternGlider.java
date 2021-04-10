 class PatternGlider extends Pattern{
     boolean glider[][];
     public int sizeX;
     public int sizeY;

     public PatternGlider() {
         glider = new boolean[][] {
                 { false, true, false, false, false, false, false },
                 { false, false, false, true, false, false, false },
                 { true, true, false, false, true, true, true }
         };
         this.sizeX = 7;
         this.sizeY = 3;
     }

     public PatternGlider(int sizeX, int sizeY) {
         this.sizeX = sizeX;
         this.sizeY = sizeY;
     }
     @Override
     public boolean getCell(int x, int y) {
         return glider[y][x];
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
