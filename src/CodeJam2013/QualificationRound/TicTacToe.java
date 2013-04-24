/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeJam2013.QualificationRound;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

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
        String cadena=args[0];
        int N=0;
        char matriz[][]=new char[4][4];
        Board tablero=new Board();
        RegularExpression r=new RegularExpression("/d*");
        for(int i=0;i<N;i++){
            System.out.println(tablero.ObtenerEstado(matriz));
        }
        
    }
}
