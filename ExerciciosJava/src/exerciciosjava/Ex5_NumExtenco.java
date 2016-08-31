package exerciciosjava;

import javax.swing.JOptionPane;

public class Ex5_NumExtenco {
   public static void main(String args[]) {

        int c, d, u, cmilhar, dmilhar, umilhar, numero;
        String msg = "";
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        cmilhar = (int) numero / 1000;
        dmilhar = (int) (numero % 1000) / 100;
        umilhar = (int) (numero % 1000) % 100;
        c = (int) numero / 100;
        d = (int) (numero % 100) / 10;
        u = (int) (numero % 100) % 10;

        switch (c) {
            case 1: {
                if ((d == 0) && (u == 0)) {
                    msg = "cem ";
                } else {
                    msg = "cento e ";
                }
            }
            break;
            case 2: {
                if ((d == 0) && (u == 0)) {
                    msg = "duzentos ";
                } else {
                    msg = "duzentos e ";
                }
            }
            break;
            case 3: {
                if ((d == 0) && (u == 0)) {
                    msg = "trezentos ";
                } else {
                    msg = "trezentos e ";
                }
            }
            break;
            case 4: {
                if ((d == 0) && (u == 0)) {
                    msg = "quatrocentos ";
                } else {
                    msg = "quatrocentos e ";
                }
            }
            break;
            case 5: {
                if ((d == 0) && (u == 0)) {
                    msg = "quinhentos ";
                } else {
                    msg = "quinhentos e ";
                }
            }
            break;
            case 6: {
                if ((d == 0) && (u == 0)) {
                    msg = "seiscentos ";
                } else {
                    msg = "seiscentos e ";
                }
            }
            case 7: {
                if ((d == 0) && (u == 0)) {
                    msg = "setecentos ";
                } else {
                    msg = "setecentos e ";
                }
            }
            break;
            case 8: {
                if ((d == 0) && (u == 0)) {
                    msg = "oitocentos ";
                } else {
                    msg = "oitocentos e ";
                }
            }
            break;
            case 9: {
                if ((d == 0) && (u == 0)) {
                    msg = "novecentos ";
                } else {
                    msg = "novecentos e ";
                }
            }
        }

        switch (d) {
            case 1: {
                switch (u) {
                    case 0:
                        msg = msg + "dez ";
                        break;
                    case 1:
                        msg = msg + "onze ";
                        break;
                    case 2:
                        msg = msg + "doze ";
                        break;
                    case 3:
                        msg = msg + "treze ";
                        break;
                    case 4:
                        msg = msg + "quatorze ";
                        break;
                    case 5:
                        msg = msg + "quinze ";
                        break;
                    case 6:
                        msg = msg + "dezesseis ";
                        break;
                    case 7:
                        msg = msg + "dezessete ";
                        break;
                    case 8:
                        msg = msg + "dezoito ";
                        break;
                    case 9:
                        msg = msg + "dezenove ";
                        break;
                }
            }
            break;
            case 2: {
                if (u == 0) {
                    msg = msg + "vinte ";
                } else {
                    msg = msg + "vinte e ";
                }
            }
            break;
            case 3: {
                if (u == 0) {
                    msg = msg + "trinta ";
                } else {
                    msg = msg + "trinta e ";
                }
            }
            break;
            case 4: {
                if (u == 0) {
                    msg = msg + "quarenta ";
                } else {
                    msg = msg + "quarenta e ";
                }
            }
            break;
            case 5: {
                if (u == 0) {
                    msg = msg + "cinquenta ";
                } else {
                    msg = msg + "cinquenta e ";
                }
            }
            break;
            case 6: {
                if (u == 0) {
                    msg = msg + "sessenta ";
                } else {
                    msg = msg + "sessenta e ";
                }
            }
            break;
            case 7: {
                if (u == 0) {
                    msg = msg + "setenta ";
                } else {
                    msg = msg + "setenta e ";
                }
            }
            break;
            case 8: {
                if (u == 0) {
                    msg = msg + "oitenta ";
                } else {
                    msg = msg + "oitenta e ";
                }
            }
            break;
            case 9: {
                if (u == 0) {
                    msg = msg + "noventa ";
                } else {
                    msg = msg + "noventa e ";
                }
            }
        }


        if (d != 1) {
            switch (u) {
                case 1:
                    msg = msg + "um";
                    break;
                case 2:
                    msg = msg + "dois";
                    break;
                case 3:
                    msg = msg + "três";
                    break;
                case 4:
                    msg = msg + "quatro";
                    break;
                case 5:
                    msg = msg + "cinco";
                    break;
                case 6:
                    msg = msg + "seis";
                    break;
                case 7:
                    msg = msg + "sete";
                    break;
                case 8:
                    msg = msg + "oito";
                    break;
                case 9:
                    msg = msg + "nove";
                    break;
            }

        }
        
        JOptionPane.showMessageDialog(null, msg);
    } 
}
