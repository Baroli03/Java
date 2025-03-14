package meuPacote;
import java.util.Scanner;
import java.time.LocalDate;
public class Main {

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



    public static String show7Dias(Genero genero, String nome) throws InterruptedException {
    LocalDate diaAtual = LocalDate.now();
    LocalDate diaLimite = diaAtual.plusDays(6); // Limite de 7 dias
    int vaitershow = 0;

    System.out.println("Essas são as bandas do Gênero (" + nome + ") que tocarão nos próximos dias:");

    for (Banda banda : genero.getBandas()) {
        LocalDate diaDoShow = LocalDate.of(diaAtual.getYear(), banda.getMesDoShow(), banda.getDiaDoShow());

        // Verifica se o show está dentro dos próximos 7 dias
        if (!diaDoShow.isBefore(diaAtual) && !diaDoShow.isAfter(diaLimite)) {
            System.out.print(banda.getNome());
            System.out.println(" " + banda.getDiaDoShow() + "/" + banda.getMesDoShow());
            Thread.sleep(500);  // Pausa de 500ms
            vaitershow++;
        }
    }

    if (vaitershow == 0) {
        Thread.sleep(500);
        return "O gênero (" + nome + ") não terá show nos próximos 7 dias.\n";
    }

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


    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Criando gêneros

        Genero alternative = new Genero("Alternative");
        Genero rock = new Genero("Rock");
        Genero eletronic = new Genero("Eletronic");
        Genero pop = new Genero("Pop");
        Genero reggae = new Genero("Reggae");
        Genero punk = new Genero("Punk");

        // Criando bandas com Nome, dia do show e Mês do show
        Banda banda1 = new Banda("Elder effe", 20, 3, alternative);
        Banda banda2 = new Banda("Hertz",  22, 3, alternative);
        Banda banda3 = new Banda("Garbage", 23, 3, alternative);
        Banda banda4 = new Banda("Menores Atos", 5, 4, alternative);
        Banda banda5 = new Banda("Gustavo Kaly", 12, 4, alternative); // Bandas alternativas

        Banda banda6 = new Banda("Nirvana", 30, 3, rock); // Bandas de rock
        Banda banda7 = new Banda("Foo Fighters", 5, 4, rock);
        Banda banda8 = new Banda("AC/DC", 15, 4, rock);
        Banda banda9 = new Banda("Iron Maiden", 23, 5, rock);
        Banda banda10 = new Banda("Metallica", 25, 5, rock);

        Banda banda11 = new Banda("Daft Punk", 12, 3, eletronic); // Bandas eletrônicas
        Banda banda12 = new Banda("Calvin Harris", 19, 4, eletronic);
        Banda banda13 = new Banda("Avicii", 22, 5, eletronic);
        Banda banda14 = new Banda("Skrillex", 30, 3, eletronic);
        Banda banda15 = new Banda("Zedd", 7, 4, eletronic);

        Banda banda16 = new Banda("Taylor Swift", 16, 3, pop); // Bandas pop
        Banda banda17 = new Banda("Ariana Grande", 8, 4, pop);
        Banda banda18 = new Banda("Billie Eilish", 20, 4, pop);
        Banda banda19 = new Banda("Shawn Mendes", 25, 3, pop);
        Banda banda20 = new Banda("Ed Sheeran", 1, 4, pop);

        Banda banda21 = new Banda("Bob Marley", 3, 5, reggae); // Bandas reggae
        Banda banda22 = new Banda("Damian Marley", 15, 3, reggae);
        Banda banda23 = new Banda("Ziggy Marley", 10, 4, reggae);
        Banda banda24 = new Banda("Toots and the Maytals", 18, 3, reggae);
        Banda banda25 = new Banda("Steel Pulse", 5, 5, reggae);

        Banda banda26 = new Banda("The Clash", 7, 3, punk); // Bandas punk
        Banda banda27 = new Banda("Ramones", 14, 3, punk);
        Banda banda28 = new Banda("Green Day", 21, 4, punk);
        Banda banda29 = new Banda("Sex Pistols", 1, 5, punk);
        Banda banda30 = new Banda("The Offspring", 10, 3, punk);

        // Adicionando bandas aos gêneros
        alternative.adicionarBanda(banda1);
        alternative.adicionarBanda(banda2);
        alternative.adicionarBanda(banda3);
        alternative.adicionarBanda(banda4);
        alternative.adicionarBanda(banda5);

        rock.adicionarBanda(banda6);
        rock.adicionarBanda(banda7);
        rock.adicionarBanda(banda8);
        rock.adicionarBanda(banda9);
        rock.adicionarBanda(banda10);

        eletronic.adicionarBanda(banda11);
        eletronic.adicionarBanda(banda12);
        eletronic.adicionarBanda(banda13);
        eletronic.adicionarBanda(banda14);
        eletronic.adicionarBanda(banda15);

        pop.adicionarBanda(banda16);
        pop.adicionarBanda(banda17);
        pop.adicionarBanda(banda18);
        pop.adicionarBanda(banda19);
        pop.adicionarBanda(banda20);

        reggae.adicionarBanda(banda21);
        reggae.adicionarBanda(banda22);
        reggae.adicionarBanda(banda23);
        reggae.adicionarBanda(banda24);
        reggae.adicionarBanda(banda25);

        punk.adicionarBanda(banda26);
        punk.adicionarBanda(banda27);
        punk.adicionarBanda(banda28);
        punk.adicionarBanda(banda29);
        punk.adicionarBanda(banda30);

        

        // Exibindo bandas de um gênero específico (por exemplo, Rock)
        
        while (true) {
            System.out.println("Bem vindo ao");
            Thread.sleep(1000);
            System.out.println(
                "\nSSSSS    OOO  U   U  N   N  DDDD     III  N   N      CCCC   III  TTTTT  Y     Y" +
                "\nS       O   O U   U  NN  N  D   D     I   NN  N     C        I     T     Y   Y"  +
                "\n SSS    O   O U   U  N N N  D   D     I   N N N     C        I     T      YYY"   +
                "\n    S   O   O U   U  N  NN  D   D     I   N  NN     C        I     T       Y"    +
                "\nSSSS     OOO   UUU   N   N  DDDD     III  N   N      CCCC   III    T       Y"
                );
            Thread.sleep(500);

            // Criando o menu
            System.out.println(
                "Menu:" +
                "\n1 - Sobre nós" +
                "\n2 - Pesquisa por Genêros de banda" +
                "\n3 - Bandas que vão tocar nos próximos 7 dias" +
                "\n4 - Bandas que vão tocar esse mês" +
                "\n5 - Todas as bandas" +
                "\n6 - Sair" 
                );
            int menu = scanner.nextInt();
            Thread.sleep(2000);


            // Sobre nós
            if (menu == 1){
                System.out.println("Somos um");
            }
            

            // Pesquisa por Gênero
            else if (menu == 2){
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
            

            // Mostrando bandas do gênero Alternative
            if (resposta == 1) {
                shows(alternative, "Alternative");
                } 
            // Mostrando bandas do gênero Rock
            else if (resposta == 2) {
                shows(rock, "Rock");   
                } 
            // Mostrando bandas do gênero Eletronic
            else if (resposta == 3) {
                shows(eletronic, "Eletronic");
            }
            // Mostrando bandas do gênero Pop
            else if (resposta == 4) {
                shows(pop, "Pop");
            }
            // Mostrando bandas do gênero Reggae
            else if (resposta == 5) {
                shows(reggae, "Reggae");
            }
            // Mostrando bandas do gênero Punk
            else if (resposta == 6) {
                shows(punk, "Punk");
            }
            // Opção para encerrar o loop
            else if (resposta == 7) {
                break;
                }
            }
        }

            // Bandas que irão tocar nos próximos 7 dias
            else if(menu == 3){
                // Criando uma condição para que se continuar em 0 significa que não tem show
                String resultado = show7Dias(alternative, "Alternative");
                System.out.println(resultado);

                String resultado1 = show7Dias(rock, "Rock");
                System.out.println(resultado1);

                String resultado2 = show7Dias(eletronic, "Eletronic");
                System.out.println(resultado2);

                String resultado3 = show7Dias(pop, "Pop");
                System.out.println(resultado3);

                String resultado4 = show7Dias(reggae, "Reggae");
                System.out.println(resultado4);

                String resultado5 = show7Dias(punk, "Punk");
                System.out.println(resultado5);

                }

            else {
                scanner.close();
                System.out.println("Agradecemos a sua Participação :)");
                Thread.sleep(1000);
                break;
            }
        }
    }
}



