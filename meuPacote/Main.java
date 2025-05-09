package meuPacote;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    // ATENÇÃO THROWS INTERRUPTEDEXCEPTION DEVIDO AO THREAD.SLEEP() POIS ESSA CHAMADA PAUSA O PROGRAMA POR ALGUNS MINUTOS

    public static void main(String[] args) throws InterruptedException {

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

        Metodos lernum = new Metodos();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Declaração aqui


        // TRY CATCH USADO PARA PEGAR A EXCESSÃO IOException É USADA POIS O .readLine() CAUSA ESSA EXCESSÃO
        try {
            System.out.println("\nDeseja entrar em um Usuário? [1 Para Sim], [2 Para Não]");
            int user = lernum.lerNumeroValido(reader);
        
            if (user == 1) {
                System.out.println("Bem-vindo à área de cadastro...");
        
                // Escolha do tipo de identificação
                System.out.println("Você deseja se identificar com: [1 - Nome] ou [2 - ID]?");
                int escolha = lernum.lerNumeroValido(reader);
        
                String email, senha;
                Usuario usuario = null;
        
                // Entrada comum para email e senha
                System.out.println("Digite seu e-mail: ");
                email = reader.readLine();
        
                System.out.println("Digite sua senha: ");
                senha = reader.readLine();
        
                if (escolha == 1) {
                    System.out.println("Digite seu nome: ");
                    String nome = reader.readLine();
                    usuario = new Usuario(nome, email, senha);  // construtor com nome
                } else if (escolha == 2) {
                    System.out.println("Digite seu ID: ");
                    String id = reader.readLine();
                    usuario = new Usuario(id, email, senha, true);  // construtor com ID
                } else {
                    System.out.println("Opção inválida.");
                }
        
                if (usuario != null) {
                    System.out.println("Cadastro concluído!");
                    if (usuario.getNome() != null) {
                        System.out.println("Seu nome é: " + usuario.getNome());
                    } else {
                        System.out.println("Seu ID é: " + usuario.getId());
                    }
                    System.out.println("Seu email é: " + usuario.getEmail());
                    System.out.println("Sua senha é: " + usuario.getSenha());
                }
            }
        
        } catch (IOException e) {
            System.err.println("Erro ao ler a entrada: " + e.getMessage());
        }
        
       

        boolean continuar = true;
        int menu = 0;  // Declarando a variável menu fora do loop

        while (continuar) {
            System.out.println("Bem-vindo ao");
            Thread.sleep(1000);
            System.out.println(
                "\nSSSSS    OOO  U   U  N   N  DDDD     III  N   N      CCCC   III  TTTTT  Y     Y" +
                "\nS       O   O U   U  NN  N  D   D     I   NN  N     C        I     T     Y   Y" +
                "\n SSS    O   O U   U  N N N  D   D     I   N N N     C        I     T      YYY" +
                "\n    S   O   O U   U  N  NN  D   D     I   N  NN     C        I     T       Y" +
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

            menu = lernum.lerNumeroValido(reader);
            if (menu < 1 || menu > 6) {
                System.out.println("Por favor, insira uma opção válida (1 a 6).");
                continue;  // Retorna ao loop caso a opção seja inválida
            }

            Thread.sleep(2000);

            Metodos Exibir = new Metodos();
            switch (menu) {
                case 1:
                System.out.println("Somos uma turma da Faculdade Positivo, cursando Análise e Desenvolvimento de Sistemas, atualmente no segundo semestre. Este projeto é parte da disciplina de Desenvolvimento de Software,\n onde aplicamos conceitos de programação orientada a objetos, desenvolvimento ágil e gestão de sistemas.\r\n" + //

 

                "\r\n" + //


                "Nosso objetivo com este projeto é criar uma aplicação que auxilie na consulta de shows de diferentes gêneros musicais, apresentando informações sobre as bandas e seus respectivos eventos,\n proporcionando uma experiência interativa e dinâmica para o usuário.\r\n" + //


                "\r\n" + //


                "Ao longo do desenvolvimento, tivemos a oportunidade de trabalhar em equipe, aprender sobre as melhores práticas de codificação e também de enfrentar desafios técnicos,\n como integração de dados e estruturação de informações. Cada membro da equipe contribuiu com suas habilidades e aprendizado para o sucesso do projeto, que reflete nosso crescimento acadêmico e profissional.\r\n" + //


                "\r\n" + //


                "Agradecemos pela sua visita e esperamos que aproveite nossa aplicação!");
                    break;
                case 2:
                    Exibir.pesquisaGenero(alternative, rock, eletronic, pop, reggae, punk);
                    break;
                case 3:
                    Exibir.exibirShowsNosProximos7Dias(alternative, rock, eletronic, pop, reggae, punk);
                    break;
                case 4:
                    Exibir.exibirShowsNoMes(alternative, rock, eletronic, pop, reggae, punk);
                    break;
                case 5:
                    Exibir.exibirTodas(alternative, rock, eletronic, pop, reggae, punk);
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Comando Inválido");
                    break;
    }
}

System.out.println("Finalizando programa...");

    }
}
