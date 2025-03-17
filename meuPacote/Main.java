package meuPacote;
import java.util.Scanner;



public class Main {

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
        // Bandas alternativas
        Banda banda1 = new Banda("Garbage", 23, 3, alternative);
        Banda banda2 = new Banda("Pitty", 20, 4, alternative);
        Banda banda3 = new Banda("Ney Matogrosso", 15, 3, alternative);
        Banda banda4 = new Banda("Bush", 1, 4, alternative);
        Banda banda5 = new Banda("Hermanos Gutiérrez", 11, 3, alternative);

        // Bandas de rock
        Banda banda6 = new Banda("The Offspring", 10, 3, rock);
        Banda banda7 = new Banda("Alanis Morissette", 30, 5, rock);
        Banda banda8 = new Banda("Ben Harper & The Innocent Criminals", 12, 4, rock);
        Banda banda9 = new Banda("Incubus", 8, 4, rock);
        Banda banda10 = new Banda("Bush", 1, 4, rock);

        // Bandas eletrônicas
        Banda banda11 = new Banda("Devochka", 8, 3, eletronic);
        Banda banda12 = new Banda("Momentum DJs", 7, 4, eletronic);
        Banda banda13 = new Banda("Overdrive", 9, 3, eletronic);
        Banda banda14 = new Banda("Club Vibe DJs", 6, 4, eletronic);
        Banda banda15 = new Banda("DM7 Artists", 10, 5, eletronic);

        // Bandas pop
        Banda banda16 = new Banda("Olivia Rodrigo", 26, 3, pop);
        Banda banda17 = new Banda("Jorge Vercillo", 11, 4, pop);
        Banda banda18 = new Banda("Paula Toller", 26, 4, pop);
        Banda banda19 = new Banda("Camila Fremder", 26, 3, pop);
        Banda banda20 = new Banda("Thiaguinho", 26, 4, pop);

        // Bandas reggae
        Banda banda21 = new Banda("Natiruts", 26, 5, reggae);
        Banda banda22 = new Banda("Armandinho", 15, 3, reggae);
        Banda banda23 = new Banda("Chimarruts", 18, 4, reggae);
        Banda banda24 = new Banda("Inner Circle", 9, 5, reggae);
        Banda banda25 = new Banda("Tribo de Jah", 12, 4, reggae);

        // Bandas punk
        Banda banda26 = new Banda("The Offspring", 10, 3, punk);
        Banda banda27 = new Banda("Rise Against", 14, 4, punk);
        Banda banda28 = new Banda("The Damned", 13, 3, punk);
        Banda banda29 = new Banda("Amyl and The Sniffers", 12, 4, punk);
        Banda banda30 = new Banda("Sublime", 15, 5, punk);

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



        System.out.println("Deseja entrar em um Usuário? [1 Para Sim], [2 Para não]");
            int user = scanner.nextInt();

            if (user == 1) {
                scanner.nextLine();
                // Cadastro de usuário
                System.out.println("Bem vindo a area de cadastro...");

                System.out.println("Digite seu nome: ");
                String nome = scanner.nextLine(); // Lê a linha inteira ("nome do usuário")
            
                System.out.println("Digite seu e-mail: ");
                String email = scanner.nextLine();  // Lê a linha inteira (e-mail do usuário)
            
                System.out.println("Digite sua senha: ");
                String senha = scanner.nextLine();  // Lê a linha inteira (senha do usuário)


                // Criando o objeto Usuario
                Usuario usuario = new Usuario(nome , email, senha);
            
                // Exibindo os dados do usuário
                System.out.println("\nUsuário cadastrado com sucesso!");
                usuario.imprimirUsuario(); // Imprime os dados do usuário
            } else {
                scanner.nextLine();  // Consumir a linha pendente
            }
            

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
                "\n4 - Bandas que vão tocar nos próximos 30 dias" +
                "\n5 - Todas as bandas" +
                "\n6 - Sair" 
                );
            int menu = scanner.nextInt();
            Thread.sleep(2000);


            Metodos Exibir = new Metodos();
            switch (menu) {
                // Sobre nós
                
                case 1:
                    System.out.println("Somos uma turma da Faculdade Positivo, cursando Análise e Desenvolvimento de Sistemas, atualmente no segundo semestre. Este projeto é parte da disciplina de Desenvolvimento de Software,\n onde aplicamos conceitos de programação orientada a objetos, desenvolvimento ágil e gestão de sistemas.\r\n" + //
                                                "\r\n" + //
                                                "Nosso objetivo com este projeto é criar uma aplicação que auxilie na consulta de shows de diferentes gêneros musicais, apresentando informações sobre as bandas e seus respectivos eventos,\n proporcionando uma experiência interativa e dinâmica para o usuário.\r\n" + //
                                                "\r\n" + //
                                                "Ao longo do desenvolvimento, tivemos a oportunidade de trabalhar em equipe, aprender sobre as melhores práticas de codificação e também de enfrentar desafios técnicos,\n como integração de dados e estruturação de informações. Cada membro da equipe contribuiu com suas habilidades e aprendizado para o sucesso do projeto, que reflete nosso crescimento acadêmico e profissional.\r\n" + //
                                                "\r\n" + //
                                                "Agradecemos pela sua visita e esperamos que aproveite nossa aplicação!");
                    break;

                // Pesquisa de músicas com gêneros
                case 2:
                    Exibir.pesquisaGenero(alternative, rock, eletronic, pop, reggae, punk);
                    break;

                // Imprimir os shows que terão nos próximos 7 dias
                case 3:

                    Exibir.exibirShowsNosProximos7Dias(alternative, rock, eletronic, pop, reggae, punk);
                    break;

                // Imprimir todas as bandas que irão tocar esse mês
                case 4:
                    Exibir.exibirShowsNoMes(alternative, rock, eletronic, pop, reggae, punk);
                    break;

                // Imprimir todos os shows registrados
                case 5:
                    
                    Exibir.exibirTodas(alternative, rock, eletronic, pop, reggae, punk);
                    break;
                
                // Fechar o aplicativo
                case 6:
                    break;

                // Em caso de comando invalido
                default:
                    System.out.println("Comando Inválido");
                    break;

        }
        
        // Finalizando o programa
        if (menu == 6){
            scanner.close();
            System.out.println("Finalizando programa...");
            break;
        }

    }
}
}



