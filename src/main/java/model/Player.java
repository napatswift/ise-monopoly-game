package model;

public class Player {
    private String name;
    private Piece piece;
    private Die[] dice;
    private Board board;


    public void takeTurn() {
        int fvTot = 0;
        for(Die die: dice) {
            die.roll();
            fvTot += die.getFaceValue();
        }

        Square oldLoc = this.piece.getLocation();
        Square newLoc = this.board.getSquare(oldLoc, fvTot);
        this.setLocation(newLoc);
    }

    private void setLocation(Square square) {
        this.piece.setLocation(square);
    }

}
