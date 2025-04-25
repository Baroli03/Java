package meuPacote;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Metodos {


    // Melhorando a leitura da entrada e a verificação de números válidos

    public int lerNumeroValido(BufferedReader reader) {
        while (true) {
            try {
                System.out.println("");
                String input = reader.readLine();
    
                if (input != null && !input.trim().isEmpty()) {
                    if (input.trim().equalsIgnoreCase("sair")) {
                        System.out.println("Encerrando a entrada...");
                        break; // Sai do loop
                    }
                    return Integer.parseInt(input); // Retorna o número válido
                } else {
                    System.out.println("Entrada vazia. Por favor, insira um número válido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            } catch (IOException e) {
                System.err.println("Erro ao ler a entrada: " + e.getMessage());
            }
        }
        return -1; // Valor padrão caso o loop seja interrompido (se "sair" for digitado)
    }
    


    public static int getDiaAtual() {
        // Pega a data atual
        LocalDate dataAtual = LocalDate.now();

        // Converte a data para string no formato padrão (AAAA-MM-DD)
        String dataString = dataAtual.toString();  // Isso gera a data como "AAAA-MM-DD"

        // Separa a data utilizando o "-" como delimitador
        String[] partesData = dataString.split("-");

        int diaAtual = Integer.parseInt(partesData[2]);


        return diaAtual;

    }

    public static int getMesAtual() {
        // Pega a data atual
        LocalDate dataAtual = LocalDate.now();

        // Converte a data para string no formato padrão (AAAA-MM-DD)
        String dataString = dataAtual.toString();  // Isso gera a data como "AAAA-MM-DD"

        // Separa a data utilizando o "-" como delimitador
        String[] partesData = dataString.split("-");

        int mesAtual = Integer.parseInt(partesData[1]);

        return mesAtual;

    }



    public static String showXDias(Genero genero, String nome, int limite) throws InterruptedException {
        LocalDate diaAtual = LocalDate.now();
        LocalDate diaLimite = diaAtual.plusDays(limite - 1); // Ajuste para o limite correto (inclusive)
        int vaitershow = 0;
    
        System.out.println("Essas são as bandas do Gênero (" + nome + ") que tocarão nos próximos " + limite + " dias:");
    
        for (Banda banda : genero.getBandas()) {
            LocalDate diaDoShow = LocalDate.of(diaAtual.getYear(), banda.getMesDoShow(), banda.getDiaDoShow());
    
            // Verifica se o show está dentro do intervalo de dias desejado
            if (!diaDoShow.isBefore(diaAtual) && !diaDoShow.isAfter(diaLimite)) {
                System.out.print(banda.getNome());
                System.out.println(" " + banda.getDiaDoShow() + "/" + banda.getMesDoShow());
                Thread.sleep(500);  // Pausa de 500ms
                vaitershow++;
            }
        }

        if (vaitershow == 0) {
            Thread.sleep(500);
            System.out.println("O gênero (" + nome + ") não terá show nos próximos " + limite + " dias.\n");
            return " ";
        }
        System.out.print("\n");
        return " ";
    }
    



public static String showTodas(Genero genero, String nome) throws InterruptedException {
    int vaitershow = 0;

    System.out.println("Essas são as bandas do Gênero (" + nome + ") registradas");

    for (Banda banda : genero.getBandas()) {
        System.out.print(banda.getNome());
        System.out.println(" " + banda.getDiaDoShow() + "/" + banda.getMesDoShow());
        Thread.sleep(500);  // Pausa de 500ms
        vaitershow ++;
    }

    if (vaitershow == 0) {
        System.out.println("O gênero (" + nome + ") não tem shows registrados.\n");
        return " ";
    }
    
    System.out.print("\n");
    return " ";
}


    public static String shows(Genero genero, String nome) throws InterruptedException {
        // Imprime o título da seção, com o gênero e um espaço após a palavra "gênero"
        System.out.println("Bandas do gênero " + nome + ":");
        
        // Aguarda 1 segundo antes de começar a mostrar as bandas
        Thread.sleep(1000);
    
        // Exibe as bandas e as informações do show
        for (Banda banda : genero.getBandas()) {
            System.out.print(banda.getNome());  // Exibe o nome da banda
            System.out.println(" " + banda.getDiaDoShow() + "/" + banda.getMesDoShow());  // Exibe o dia e mês do show
            Thread.sleep(500);  // Pausa de 500ms entre as bandas
        }
    
        // Aguarda mais 1 segundo antes de finalizar
        Thread.sleep(1000);
    
        // Retorna uma mensagem indicando que a exibição foi concluída
        return "Exibição de shows concluída.";
    }


    public void pesquisaGenero(Genero alternative, Genero rock, Genero eletronic, Genero pop, Genero reggae, Genero punk) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println(
    "\nQual Genero deseja pesquisar? " +
    "\n1 = Alternative" +
    "\n2 = Rock" +
    "\n3 = Eletronic" +
    "\n4 = Pop" +
    "\n5 = Reggae" +
    "\n6 = Punk" +
    "\n7 = Sair"
    );
        int resposta = scanner.nextInt();
            
        switch (resposta) {

            case 1:
                shows(alternative, "Alternative");
                
                break;
            case 2:
                shows(rock, "Rock"); 
                break;
            case 3:
                shows(eletronic, "Eletronic");
                break;

            case 4:
                shows(pop, "Pop");
                break;

            case 5:
                shows(reggae, "Reggae");
                break;

            case 6:
                shows(punk, "Punk");
                break;

            case 7:
                return;
            
            default:
            System.out.println("Opção inválida.");
        }

    }
}


public void exibirShowsNosProximos7Dias(Genero... generos) throws InterruptedException {
    for (Genero genero : generos) {
        showXDias(genero, genero.getNome(), 7);
    }
}


public void exibirShowsNoMes(Genero... generos) throws InterruptedException {
    for (Genero genero : generos) {
        showXDias(genero, genero.getNome(), 30);
    }
}

public void exibirTodas(Genero... generos) throws InterruptedException {
    for (Genero genero : generos) {
        showTodas(genero, genero.getNome());
    }
}


    
}