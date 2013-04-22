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
    if(GanaHorizontal(x)||GanaVertical(x)||GanaDiagonal(x)){
        estado="X win";
    }else if(GanaHorizontal(Y)||GanaVertical(Y)||GanaDiagonal(Y)){
        estado="Y win";
    }else if(!Terminado()){
            estado="Game has not completed";
    }else
    {
        estado="Draw";
    }
    return estado;
}

private boolean GanaHorizontal(char valor){
    boolean gana=false;
    int contador=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                //System.out.println(matriz[i][j]);
                if(matriz[i][j]==valor){
                    contador++;
                    if((contador==3&&ExisteT(matriz[i]))||contador==4){
                        gana=true;
                        break;
                    }
                }
            }
            contador=0;
        }
    
    return gana;
}

    @SuppressWarnings("empty-statement")
    private boolean GanaVertical(char valor){
    boolean gana=false;
    int contador=0;
    char lom[]=new char[matriz.length];
        for(int i=0;i<matriz.length;i++){
            //System.out.println(contador);
            for(int j=0;j<matriz.length;j++){
                //System.out.println(matriz[j][i]);
                if(matriz[j][i]==valor){
                    contador++;
//                    System.out.println("\n");
                    for(int k=0;k<matriz.length;k++){
                        lom[k]=matriz[k][i];
                        //System.out.println(lom[k]);
                    }
                    if((contador==3&&ExisteT(lom))||contador==4){
                        gana=true;
                        break;
                    }
                }
            }
            contador=0;
        }
    
    return gana;
}

private boolean ExisteT(char[] lista){
    boolean existe=false;
    for(int i=0;i<lista.length;i++){
        if(lista[i]=='T'){
            existe=true;
            break;
        }
    }
    return existe;
}

    private boolean GanaDiagonal(char valor) {
        boolean result=false;
        int contador=0;
        char lomatriz[]=new char[4];
        for(int i=0;i<matriz.length;i++){
        lomatriz[i]=matriz[i][i];
        }
        for(int i=0;i<matriz.length;i++){
            if(matriz[i][i]==valor){
                 contador++;
                 if((contador==3&&ExisteT(lomatriz))||contador==4){
                     result=true;
                     break;
                 }
             }
        }
        if(result==false){
            contador=0;
            for(int i=0;i<matriz.length;i++){
                lomatriz[i]=matriz[i][matriz.length-i-1];
            }
            for(int i=0;i<matriz.length;i++){
                if(matriz[i][matriz.length-i-1]==valor){
                     contador++;
                     if((contador==3&&ExisteT(lomatriz))||contador==4){
                         result=true;
                         break;
                     }
                 }
            }
        }
        
        return result;
    }

    private boolean Terminado() {
        boolean terminado=true;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(matriz[i][j]=='.'){
                    terminado=false;
                    break;
                }
            }
        }
        return terminado;
    }

}
