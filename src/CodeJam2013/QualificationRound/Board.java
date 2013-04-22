/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeJam2013.QualificationRound;

/**
 *
 * @author Gerardo
 */
public class Board {
final char x='X';
final char Y='Y';
final char T='T';
final char vacio='.';

char[][] matriz;

public Board(char m[][]){
matriz=m;
}

public String ObtenerEstado(){
    String estado="";
    boolean existeT=false;
    int cx=0,cy=0,ct=0, cp=0;
    //Horizontal
    for(int i=0;i<4;i++){
        cx=0;
        cy=0;
        ct=0;
        cp=0;
        existeT=false;
        
        for(int j=0;j<4;j++){
        if(matriz[i][j]=='T'){
        existeT=true;
        }
        }
        for(int j=0;j<4;j++){
            if(matriz[i][j]=='X'){
            cx++;
            if((existeT &cx==3)||(!existeT&cx==4))
            {estado="X Gana";
            return estado;}
            }
            if(matriz[i][j]=='Y'){
            cy++;
                if((existeT &cy==3)||(!existeT&ct==4))
                {estado="Y Gana";return estado;}
                
            }
            if(matriz[i][j]=='.'){
            cp++;
            if(cp>=1){
                estado="Game has not completed";return estado;}
            }           
        }
    }
//    //Vertical
//    for(int j=0;j<4;j++){
//        cx=0;
//        cy=0;
//        ct=0;
//        cp=0;
//        existeT=false;
//        
//        for(int i=0;i<4;i++){
//        if(matriz[i][j]=='T'){
//        existeT=true;
//        }
//        }
//        for(int i=0;i<4;i++){
//            if(matriz[i][j]=='X'){
//            cx++;
//            if((existeT &cx==3)||(!existeT&cx==4))
//                estado="X Gana";
//            }
//            if(matriz[i][j]=='Y'){
//            cy++;
//                if((existeT &cy==3)||(!existeT&ct==4))
//                estado="Y Gana";
//            }
//            if(matriz[i][j]=='.'){
//            cp++;
//            if(cp>=1)
//                estado="Game has not completed";
//            }           
//        }
//    }
    
    
    return estado;
}
}
