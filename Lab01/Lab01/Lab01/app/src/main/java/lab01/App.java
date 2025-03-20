/*
 * App.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

import java.io.IOException;
import java.util.Scanner;

package lab01;

/**
 * Contém a estrutura de implementação da aplicação.
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 */
public class App {

    /**
     * Aplicação principal
     * @param args
     */
    public static void main(String[] args) {
        // DEMONSTRAÇÃO CÓDIGO PRELIMINAR
        
        Local local = new Local("Allianz Parque", 300);
        Usuario usuario = new Usuario("Gabriel", "gabriel@gmail.com");

        // Dados sobre evento
        System.out.println("Local: " + local.getNome());
        System.out.println("Nome do usuário: " + usuario.getNome());

        // DEMONSTRAÇÃO PASSO 1
        //set variables to interface
        boolean running = true;
        HistoricoEventos historicoEventos = new HistoricoEventos();
        while (running) {
            //Menu Inicial
            limparTerminal();
            historicoEventos.exibir();
            System.out.print("""
                    Adicionar eventos - Aperte 1 \n
                    Comprar ingressos - Aperte 2 \n
                    """);

            //?Lê input e implementa menus
            Scanner leitor = new Scanner(System.in);
            int entrada = leitor.nextInt();
            
            switch (entrada) {
                case 1:
                    

                case 2:
                    break;
                    
                default:
                    break;
            }
        }
            //Escrito pelo chatGPT4 (funciona apenas para o terminal unix/linux)
            public static void limparTerminal() {
                try {
                    new ProcessBuilder("clear").inheritIO().start().waitFor();
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        
        
        
            

        


        // DEMONSTRAÇÃO PASSO 2



        // DEMONSTRAÇÃO PASSO 3



        // DEMONSTRAÇÃO PASSO 4



        // DEMONSTRAÇÃO PASSO 5
    }
}
