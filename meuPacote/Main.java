package meuPacote;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Criando gêneros
        Genero rock = new Genero("Rock");
        Genero metal = new Genero("Metal");

        // Criando bandas
        Banda banda1 = new Banda("The Rockers", 15, 5, rock);
        Banda banda2 = new Banda("Metal Storm", 22, 5, metal);
        Banda banda3 = new Banda("Jazz Vibes", 15, 5, rock);

        // Adicionando bandas aos gêneros
        rock.adicionarBanda(banda1);
        rock.adicionarBanda(banda3);
        metal.adicionarBanda(banda2);

        // Exibindo bandas de um gênero específico (por exemplo, Rock)

        while (true){
            System.out.println("\nQual Genero deseja pesquisar? " +
            "\n1 = Rock" +
            "\n2 = Metal");
            int resposta = scanner.nextInt();
            if (resposta == 1){
                System.out.println("Bandas do gênero Rock:");
                for (Banda banda : rock.getBandas()) {
                    System.out.println(banda.getNome());
                } 
            }else if (resposta == 2) {
                System.out.println("Bandas do gênero Metal:");
                for (Banda banda : metal.getBandas()) {
                    System.out.print(banda.getNome());
                    System.out.println(" " + banda.getDiaDoShow() + "/"+ banda.getMesDoShow());

                    }    
                }
            }
        }
    }

