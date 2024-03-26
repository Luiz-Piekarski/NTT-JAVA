package model;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
    public static  void main(String [] args) {
        System.out.println("Bem Vindo!");
        System.out.println("Cadastro CX Filmes");

        Scanner ler = new Scanner(System.in);

        int opcao;

            System.out.println("Opções:\n" + "1-Cadastro de Filmes\n" + "2-Lista de Filmes");
//            List<Filme> filmes = new ArrayList<>();

            Filme filme = creatFilme(ler);

            System.out.println(filme.getNomeFilme());
            System.out.println(filme.getGenero());
            System.out.println(filme.getListaDiretor());
            System.out.println(filme.getListaAtores());
            System.out.println(filme.getEndereco());
            System.out.println(filme.getTempoFilmagem());
            System.out.println(filme.getDataInicio());
            System.out.println(filme.getDataFim());

//            opcao = ler.nextInt();

//            switch (opcao) {
//                case 1:
//                    filmes.add(creatFilme(ler));
//                    break;
//                case 2:
////                    if (!filmes.isEmpty()) {
//                    for (int i = 0; i < filmes.size(); i++) {
//                System.out.println(filmes.get(i));
//            }
//
////                    }else {
////                        System.out.println("A lista está vazia.");
////                    }
//                    default:
//                    System.out.println("Opção inválida!");
//            }
//
//
//       System.out.println(Array);
//       System.out.println(filme.getGenero());
//       System.out.println(filme.getDataInicio());


    }

    private static  Filme creatFilme(Scanner ler) {

        Filme filme = new Filme();

        System.out.println("Digite o nome do Filme: ");
        filme.setNomeFilme(ler.next());

        System.out.println("Digite o gênero do Filme: ");
        filme.setGenero(ler.next());

        List<Diretor> diretors = new ArrayList<>();
        diretors.add(creatDiretor(ler));
        filme.setListaDiretor(diretors);

        int aux1 = 1;

        List<Ator> ators = new ArrayList<>();
        ators.add(creatAtor(ler));
        filme.setListaAtores(ators);

        while (true) {
            System.out.println("Deseja cadastrar outro ator? 1-Sim/ 0-Não");
            aux1 = ler.nextInt();

            if (aux1 == 0) {
                break;
            } else if (aux1 == 1) {
                ators.add(creatAtor(ler));
                filme.setListaAtores(ators);

            } else {
                System.out.println("Entrada inválida");
            }
        }

        System.out.println("Digite o endereço da filmagem: ");
        filme.setEndereco(ler.next());

        System.out.println("Digite o tempo de filmagem(h): ");
        filme.setTempoFilmagem(ler.nextInt());

        System.out.println("Digite a data de início (dd/mm/aaaa): ");
        filme.setDataInicio(ler.next());

        System.out.println("Digite a data de término (dd/mm/aaaa): ");
        filme.setDataFim(ler.next());

      //  LocalDate data = null;
       // try {
        //    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       //     data = LocalDate.parse(dataString, formatter);

      //  } catch (java.time.format.DateTimeParseException e) {
      //      System.out.println("Formato de data inválido. Certifique-se de que está no formato dd/MM/yyyy.");
      //  }

        return filme;
    }

    private static  Diretor creatDiretor(Scanner ler)
    {
        Diretor diretor = new Diretor();

        System.out.println("Digite o nome do Diretor: ");
        diretor.setNome(ler.next());

        return diretor;
    }


    private static  Ator creatAtor(Scanner ler)
    {
        Ator ator = new Ator();

        System.out.println("Digite o nome do Ator: ");
        ator.setNome(ler.next());

        return ator;
    }

}
