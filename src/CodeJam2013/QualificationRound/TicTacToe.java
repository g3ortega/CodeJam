/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeJam2013.QualificationRound;

/**
 *
 * @author Gerardo
 */
public class TicTacToe {

//

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char matriz[][]={{'X','X','0','T'},{'.','.','.','.'},{'0','0','.','.'},{'.','.','.','.'}};
        char matriz1[][]={{'X','X','.','T'},{'.','.','.','.'},{'0','0','0','T'},{'.','.','.','.'}};
        char matriz2[][]={{'X','X','X','T'},{'.','.','.','.'},{'0','0','.','.'},{'.','.','.','.'}};
        char matriz3[][]={{'X','X','X','T'},{'.','.','.','.'},{'0','0','.','.'},{'.','.','.','.'}};
        Board tablero=new Board(matriz);
        System.out.println(tablero.ObtenerEstado());
    }
}
