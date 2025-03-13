package meuPacote;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Criando gêneros

        // #OBJETIVOS CRIAR MAIS GÊNEROS
        Genero rock = new Genero("Rock");
        Genero metal = new Genero("Metal");



        // #OBJETIVOS CRIAR MAIS BANDAS
        // Criando bandas com Nome, dia do show e Mês do show
        Banda banda1 = new Banda("The Rockers", 15, 5, rock);
        Banda banda2 = new Banda("Metal Storm", 22, 5, metal);
        Banda banda3 = new Banda("Jazz Vibes", 15, 5, rock);


        // #OBJETIVOS NÃO ESQUECER DE ADICIONAR AS BANDAS
        // Adicionando bandas aos gêneros
        rock.adicionarBanda(banda1);
        rock.adicionarBanda(banda3);
        metal.adicionarBanda(banda2);
        

        // Pega a data atual
        LocalDate dataAtual = LocalDate.now();
        
        // Converte a data para string no formato padrão (AAAA-MM-DD)
        String dataString = dataAtual.toString();  // Isso gera a data como "AAAA-MM-DD"
        
        // Separa a data utilizando o "-" como delimitador
        String[] partesData = dataString.split("-");

        // CRIAR MAIS FUNCIONALIDADES PARA O PROGRAMA
        // Exibindo bandas de um gênero específico (por exemplo, Rock)
        while (true){

            // USAR ISSO PARA CRIAR FUNCIONALIDADES EXEMPLO "todos os show do mês atual"
            
            System.out.println("Dia atual = " + partesData[2] );
            System.out.println("Mês atual = " + partesData[1] );
            System.out.println("Ano atual = " + partesData[0] );



            System.out.println("\nQual Genero deseja pesquisar? " +
            "\n1 = Rock" +
            "\n2 = Metal" +
            "\n3 = Sair");
            int resposta = scanner.nextInt();
            // Mostrando bandas do gênero rock
            if (resposta == 1){
                System.out.println("Bandas do gênero Rock:");
                for (Banda banda : rock.getBandas()) {
                    System.out.print(banda.getNome());
                    System.out.println(" " + banda.getDiaDoShow() + "/"+ banda.getMesDoShow());
                } 
            // Mostrando bandas do gênero Metal
            }else if (resposta == 2) {
                System.out.println("Bandas do gênero Metal:");
                for (Banda banda : metal.getBandas()) {
                    System.out.print(banda.getNome());
                    System.out.println(" " + banda.getDiaDoShow() + "/"+ banda.getMesDoShow());

                    }    
                } 
            // Opção para encerrar o loop
            else if (resposta == 3) {
                    scanner.close();
                    break;
                }
            }
        }
    }

