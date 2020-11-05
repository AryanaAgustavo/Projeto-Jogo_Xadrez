package boardGame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board){
        this.board = board;
        position = null; //A peça inicia sem uma posição
    }

    protected Board getBoard() {
        return board;
    }

}
