package chess;

import boardGame.Board;
import boardGame.Position;
import chess.pieces.King;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
        initialSetup();
    }

    //Mostra as peças de xadrez para cada partida
    public ChessPiece[][] getPieces(){
        ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];

        for (int i=0; i<board.getRows(); i++){
            for(int j=0; j<board.getColumns(); j++){
                matriz[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return matriz;
    }

    //Iniciar uma partida
    private void initialSetup(){
        board.placePiece(new King(board, Color.BLACK), new Position(0,4));
    }
}
