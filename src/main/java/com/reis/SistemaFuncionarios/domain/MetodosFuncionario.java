//package com.reis.SistemaFuncionarios.domain;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class MetodosFuncionario {
//    static List<Funcionario> funcionarios = new ArrayList<>();
//
//    public static void cadastrar(){
//        LocalDateTime agora = LocalDateTime.now();
//        Scanner scanner = new Scanner(System.in);
//        // quantidade de funcionarios para cadastrar
//        System.out.println("Digite a quantidade de funcionarios: ");
//        int quantidade = scanner.nextInt();
//        for(int i = 1; i < quantidade; i++) {
//            System.out.println();
//            System.out.println("Functionary: " + i);
//        }
//        // CADASTRAR FUNCIONARIO
//        for(int i = 0; i < quantidade; i++){
//            System.out.println("Id: ");
//            try{
//                int id = scanner.nextInt();
//                boolean idExiste = funcionarios.stream().anyMatch(funcionario -> funcionario.getId() == id);
//                if(idExiste){
//                    throw new RuntimeException("Este id já existe na lista.");
//                }
//
//                System.out.println("Digite o nome: ");
//                scanner.nextLine();
//                String nome = scanner.nextLine();
//                System.out.println("Salario: ");
//                Double salario = scanner.nextDouble();
//                funcionarios.add(new Funcionario(id, nome, salario));
//                // data/hora atual
//
//                // formatar a data
//                DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
//                String dataCadastro = formatterData.format(agora);
//                // formatar a hora
//                DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
//                String horaCadastro = formatterHora.format(agora);
//                System.out.println("Funcionario " + nome + " cadastrado em " + dataCadastro + " ás " + horaCadastro);
//            }catch(RuntimeException e){
//                System.out.println("Erro no cadastro");
//            }
//    }
//    }
//    public static void aumentarSalario(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite o id do funcionario para o aumento: ");
//        int idPesquisa = scanner.nextInt();
//        Funcionario funcionario = funcionarios.stream().filter(x -> x.getId() == idPesquisa).findFirst().orElse(null);
//        if(funcionario == null){
//            throw new RuntimeException("Funcionario não existe");
//        }
//        else{
//            System.out.println("Digite a porcentagem de aumento: ");
//            double porcentagem = scanner.nextDouble();
//            funcionario.aumentoSalario(porcentagem);
//            LocalDateTime agora = LocalDateTime.now();
//            DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
//            String dataAumento = formatterData.format(agora);
//            // formatar a hora
//            DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
//            String horaAumento = formatterHora.format(agora);
//            System.out.println("Funcionario(a) " + funcionario.getNome() + " salario reajustado em " + dataAumento + " ás " + horaAumento);
//        }
//    }
//    public static List<Funcionario> listarFuncionarios(){
//       try{
//           if(funcionarios == null || funcionarios.isEmpty()){
//               throw new RuntimeException("\nLista de funcionarios vazia.");
//           }
//           for(Funcionario func: funcionarios){
//               System.out.println(func);
//           }
//       }catch(RuntimeException e){
//           System.out.println("\nErro na lista de funcionarios" + e.getMessage());
//           //e.printStackTrace();
//
//           throw e;
//       }
//        return funcionarios;
//    }
//    private static boolean hasId(List<Funcionario> funcionarios, int id) {
//        Funcionario funcionario = funcionarios.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
//        return funcionario !=null;
//    }
//
//}
