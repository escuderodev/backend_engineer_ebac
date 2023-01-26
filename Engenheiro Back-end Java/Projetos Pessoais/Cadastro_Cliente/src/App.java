import br.com.escuderodev.dao.ClienteMapDAO;
import br.com.escuderodev.dao.IClienteDAO;

import javax.swing.*;

public class App {

    private  static IClienteDAO iClienteDAO;
    public static void main(String[] args) {

        iClienteDAO = new ClienteMapDAO();

        String opcaoSelecionada = JOptionPane.showInputDialog(null,"Digite 1 para cadastrar, \" + \"2 para Consultar, 3 para excluir, 4 para alterar ou 5 para sair", "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcaoSelecionada)) {
            if ("".equals(opcaoSelecionada)) {
                sair();
            } else {
                opcaoSelecionada = JOptionPane.showInputDialog(null,"Opção invalida! Digite 1 para cadastrar, " + "2 para Consultar, 3 para excluir, 4 para alterar ou 5 para sair","Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }
        }

//        continua...
    }

    private static void sair() {
    }

    private static Boolean isOpcaoValida(String opcaoSelecionada) {
        if ("1".equals(opcaoSelecionada) || "2".equals(opcaoSelecionada) || "3".equals(opcaoSelecionada) || "4".equals(opcaoSelecionada) || "5".equals(opcaoSelecionada)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isCadastrar(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isExcluir(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isAlterar(String opcao) {
        if ("4".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }
}