package assistentedecaixa;

import javax.swing.JOptionPane;

public class ASSISTENTEDECAIXA{
    
    public static void main(String[] args) {

        String pagamento = "";

        String produto;

        int Valor1 = 0, Valor2;

        do {

            produto = JOptionPane.showInputDialog(null, "Informe o valor do produto: \n  0: CANCELA");

            Valor2 = Integer.parseInt(produto);

            Valor1 += Valor2;

        } while (Valor2 != 0);

        JOptionPane.showMessageDialog(null, "A soma de todos os produtos é: " + Valor1);

        int[] pag;

        double[] conta;

        int tam = 4;

        pag = new int[tam];

        conta = new double[tam];

        for (int i = 0; i < tam; i++) {

            pag[i] = 0;

            conta[i] = 0;

        }

        char op;

        do {

            String menu;

            menu = "Escolha a forma de pagamento:";

            menu += "\n1. Dinheiro";

            menu += "\n2. Cheque";

            menu += "\n3. Cartão de Crédito";

            menu += "\n4. Sair";

            op = JOptionPane.showInputDialog(menu).charAt(0);

            switch (op) {

                case '1':
                    double resultado2,
                     resultado1,
                     subresultado,
                     dinheiro;

                    String dinheiro1;


                    
                    resultado2 = Valor1 * 0.1;
                    dinheiro1 = JOptionPane.showInputDialog(null, "Desconto de 10%: " + resultado2 + " reais \nDigite o valor que o cliente deu em dinheiro: ");
                    dinheiro = Integer.parseInt(dinheiro1);
                    resultado1 = (Valor1 - resultado2);
                    subresultado = (dinheiro - resultado1);
                    JOptionPane.showMessageDialog(null, "É para ser devolvido em troco ao cliente: R$" + (subresultado));

                    if (resultado1 == 0.0) {

                        JOptionPane.showMessageDialog(null, "Não há troco");

                    }

                    break;

                case '2':

                    double par, result;

                    int num;

                    num = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção abaixo: \n 1 - Parcelado  \n 2 - à vista? "));

                    if (num == 1) {

                        par = Integer.parseInt(JOptionPane.showInputDialog("Parcelar em: \n2: 2X\n3: 3X "));

                        if (par == 2) {

                            result = Valor1 / 2;

                            JOptionPane.showMessageDialog(null, +result);

                        } else if (par == 3) {

                            result = Valor1 / 3;

                            JOptionPane.showMessageDialog(null, +result);

                        } else {

                            JOptionPane.showMessageDialog(null, "INVALIDO");

                        }

                        break;

                        
                    } else if (num == 2) {

                        double resulta = +Valor1 * 0.5;

                        JOptionPane.showMessageDialog(null, +Valor1 - +resulta);

                    } else {
                        JOptionPane.showMessageDialog(null, "INVALIDO");
                    }

                    break;

                case '3':

                    int valor, numer;

                    double resultado;

                    numer = Integer.parseInt(JOptionPane.showInputDialog("Infomrme a opção abaixo: \n 1 - à vista? \n 2 - Parcelado"));

                    if (numer == 1) {
                        System.out.println("mu");

                    } else if (numer == 2) {

                             valor = Integer.parseInt(JOptionPane.showInputDialog("Informe em quantas vezes o cliente irá dividir: \nOBS: Só é possivel dividir em até 10X."));
                    
                    if (valor == 2) {
                        resultado = Valor1 / 2;

                        JOptionPane.showMessageDialog(null, +resultado);

                    }
                    else if (valor == 3) {

                        resultado = Valor1 / 3;

                        JOptionPane.showMessageDialog(null, +resultado);

                    }
                    else if (valor == 4) {

                        resultado = Valor1 / 4;

                        JOptionPane.showMessageDialog(null, +resultado);

                    }
                    else if (valor == 5) {

                        resultado = Valor1 / 5;

                        JOptionPane.showMessageDialog(null, +resultado);

                    }
                    else if (valor == 6) {

                        resultado = Valor1 / 6;

                        JOptionPane.showMessageDialog(null, +resultado);

                    }
                    else if (valor == 7) {

                        resultado = Valor1 / 7;

                        JOptionPane.showMessageDialog(null, +resultado);

                    }
                    else if (valor == 8) {

                        resultado = Valor1 / 8;

                        JOptionPane.showMessageDialog(null, +resultado);

                    }
                    else if (valor == 9) {

                        resultado = Valor1 / 9;

                        JOptionPane.showMessageDialog(null, +resultado);

                    }
                    else if (valor == 10) {

                        resultado = Valor1 / 10;

                        JOptionPane.showMessageDialog(null, +resultado);

                    }
                    }
                    break;

            }

        } while (op != '4');

    }

}

