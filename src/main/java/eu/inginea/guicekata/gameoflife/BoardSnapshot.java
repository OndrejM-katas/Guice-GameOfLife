package eu.inginea.guicekata.gameoflife;

public class BoardSnapshot {
    private static final int height = 10;
    private static final int width = 10;
    private boolean[][] table = new boolean[height][width];

    public void setFilledAt(BoardCoordinate where, boolean value) {
        table[where.getRowIndex()][where.getColumnIndex()] = value;
    }

    public boolean isFilledAt(BoardCoordinate where) {
        return table[where.getRowIndex()][where.getColumnIndex()];
    }

    public int getHeight() {
        return table.length;
    }

    public int getWidth() {
        return table[0].length;
    }
}
