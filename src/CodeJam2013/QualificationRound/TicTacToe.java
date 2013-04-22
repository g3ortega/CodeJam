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
        char matriz[][]={{'X','X','X','X'},
                         {'Y','.','.','.'},
                         {'Y','0','.','.'},
                         {'T','.','.','.'}};//X win
        char matriz1[][]={{'Y','Y','Y','T'},
                          {'.','.','.','.'},
                          {'Y','Y','X','T'},
                          {'.','.','.','.'}};//y win
        char matriz2[][]={{'X','X','Y','T'},
                          {'Y','Y','X','X'},
                          {'X','Y','Y','Y'},
                          {'X','X','Y','X'}};//Draw
        char matriz3[][]={{'X','X','0','T'},
                          {'X','.','.','.'},
                          {'X','0','.','.'},
                          {'Y','.','.','.'}};//Not finished
        Board tablero=new Board(matriz2);
        System.out.println(tablero.ObtenerEstado());
    }
}
