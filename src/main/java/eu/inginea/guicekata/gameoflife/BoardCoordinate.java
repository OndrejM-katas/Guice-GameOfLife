package eu.inginea.guicekata.gameoflife;

public class BoardCoordinate {

    private int row;
    private int column;

    public BoardCoordinate() {
        this(0,0);
    }

    private BoardCoordinate(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public BoardCoordinate right() {
        return right(1);
    }

    public BoardCoordinate right(int offset) {
        return new BoardCoordinate(row, column + offset);
    }

    public BoardCoordinate down() {
        return down(1);
    }

    public BoardCoordinate down(int offset) {
        return new BoardCoordinate(row + offset, column);
    }

    public int getRowIndex() {
        return row;
    }

    public int getColumnIndex() {
        return column;
    }

    @Override
    public String toString() {
        return "[" + row + "," + column + "](" + super.toString() + ")";
    }
}
