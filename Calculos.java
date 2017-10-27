/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDD;

/**
 *
 * @author 31649033
 */
public class Calculos {
    public float calc(int[] digitos, int modo){
        int total = 0;
        switch(modo){
            case 1:
                total= digitos[0] + digitos[1]+ digitos[2] +digitos[3]
                       + digitos[4]+digitos[5]+ digitos[6]+ digitos[7];
                break;
            case 2:
                total = (digitos[0] + digitos[1]+ digitos[2] +digitos[3]
                       + digitos[4]+digitos[5]+ digitos[6]+ digitos[7])/8;
                break;
            case 3:
                total = digitos[0];
                for (int i =1;i<=7;i++){
                    if (digitos[i] > total){
                        total = digitos[i];
                    }
                }
                break;
            case 4:
                total = digitos[0];
                for (int i =1;i<=7;i++){
                    if (digitos[i] < total){
                        total = digitos[i];
                    }
                }
                break;
            case 5:
                int valor = 0;               
                for (int i =0;i<=7;i++){
                    int cont=1;
                    valor = digitos[i];
                    for (int j =i+1;j<=7;j++){
                        if (valor==digitos[j]){
                            cont++;
                        }
                    }
                    if (total<=cont){
                        total = cont;
                    }
                }
                if (total==1){
                    total=-1;
                }
                break;
            case 6:
                for (int i=0;i<=7;i++){
                    if (digitos[i]%2==0){
                        total+=1;
                    }
                }
                break;
            case 7:
                for (int i=0;i<=7;i++){
                    if (digitos[i]%2!=0){
                        total+=1;
                    }
                }
                break;
            case 8:
                int total1=0;
                for (int i=0;i<=7;i++){
                    if (i<4){
                        total = total + digitos[i];
                    }else{
                        total1 = total1 + digitos[i]; 
                    }
                }
                total = total / total1;
                break;
            case 9:
                total = digitos[0];
                for (int i=1;i<=7;i++){
                    if (digitos[i]!=0){
                        total = total * digitos[i];
                    }
                }
                break;
            case 10:
                int maior;
                maior = digitos[0];
                total = digitos[0];
                for (int i =1;i<=7;i++){
                    if (digitos[i] > maior){
                        maior = digitos[i];
                    }
                }
                for (int i =1;i<=7;i++){
                    if ((digitos[i]!=maior) && (digitos[i]!=0)){
                        total = total * digitos[i];
                    }
                }
                break;           
        }
        return total;
    }
}
