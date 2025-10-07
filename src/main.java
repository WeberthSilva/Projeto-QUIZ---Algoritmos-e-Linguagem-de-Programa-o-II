import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        ArrayList<Questao> quiz = new ArrayList<>();

        // Questão 1
        Questao q1 = new Questao();
        q1.pergunta = "1) Qual é a capital do estado de São Paulo?";
        q1.opcaoA = "A) Campinas";
        q1.opcaoB = "B) São Paulo";
        q1.opcaoC = "C) Santos";
        q1.opcaoD = "D) Ribeirão Preto";
        q1.opcaoE = "E) Sorocaba";
        q1.correta = "B";
        quiz.add(q1);

        // Questão 2
        Questao q2 = new Questao();
        q2.pergunta = "2) Qual é a capital do estado do Rio de Janeiro?";
        q2.opcaoA = "A) Niterói";
        q2.opcaoB = "B) Petrópolis";
        q2.opcaoC = "C) Rio de Janeiro";
        q2.opcaoD = "D) Volta Redonda";
        q2.opcaoE = "E) Angra dos Reis";
        q2.correta = "C";
        quiz.add(q2);

        // Questão 3
        Questao q3 = new Questao();
        q3.pergunta = "3) Qual é a capital do estado da Bahia?";
        q3.opcaoA = "A) Feira de Santana";
        q3.opcaoB = "B) Salvador";
        q3.opcaoC = "C) Vitória da Conquista";
        q3.opcaoD = "D) Ilhéus";
        q3.opcaoE = "E) Porto Seguro";
        q3.correta = "B";
        quiz.add(q3);

        // Questão 4
        Questao q4 = new Questao();
        q4.pergunta = "4) Qual é a capital do estado de Minas Gerais?";
        q4.opcaoA = "A) Belo Horizonte";
        q4.opcaoB = "B) Uberlândia";
        q4.opcaoC = "C) Juiz de Fora";
        q4.opcaoD = "D) Contagem";
        q4.opcaoE = "E) Ouro Preto";
        q4.correta = "A";
        quiz.add(q4);

        // Questão 5
        Questao q5 = new Questao();
        q5.pergunta = "5) Qual é a capital do estado do Paraná?";
        q5.opcaoA = "A) Londrina";
        q5.opcaoB = "B) Maringá";
        q5.opcaoC = "C) Curitiba";
        q5.opcaoD = "D) Ponta Grossa";
        q5.opcaoE = "E) Foz do Iguaçu";
        q5.correta = "C";
        quiz.add(q5);

        // Questão 6
        Questao q6 = new Questao();
        q6.pergunta = "6) Qual é a capital do estado de Pernambuco?";
        q6.opcaoA = "A) Olinda";
        q6.opcaoB = "B) Caruaru";
        q6.opcaoC = "C) Recife";
        q6.opcaoD = "D) Petrolina";
        q6.opcaoE = "E) Jaboatão dos Guararapes";
        q6.correta = "C";
        quiz.add(q6);

        // Questão 7
        Questao q7 = new Questao();
        q7.pergunta = "7) Qual é a capital do estado do Rio Grande do Sul?";
        q7.opcaoA = "A) Porto Alegre";
        q7.opcaoB = "B) Caxias do Sul";
        q7.opcaoC = "C) Pelotas";
        q7.opcaoD = "D) Santa Maria";
        q7.opcaoE = "E) Canoas";
        q7.correta = "A";
        quiz.add(q7);

        // Questão 8
        Questao q8 = new Questao();
        q8.pergunta = "8) Qual é a capital do estado do Ceará?";
        q8.opcaoA = "A) Sobral";
        q8.opcaoB = "B) Fortaleza";
        q8.opcaoC = "C) Juazeiro do Norte";
        q8.opcaoD = "D) Maracanaú";
        q8.opcaoE = "E) Caucaia";
        q8.correta = "B";
        quiz.add(q8);

        // Questão 9
        Questao q9 = new Questao();
        q9.pergunta = "9) Qual é a capital do estado do Amazonas?";
        q9.opcaoA = "A) Manaus";
        q9.opcaoB = "B) Parintins";
        q9.opcaoC = "C) Itacoatiara";
        q9.opcaoD = "D) Coari";
        q9.opcaoE = "E) Manacapuru";
        q9.correta = "A";
        quiz.add(q9);

        // Questão 10
        Questao q10 = new Questao();
        q10.pergunta = "10) Qual é a capital do estado de Goiás?";
        q10.opcaoA = "A) Anápolis";
        q10.opcaoB = "B) Goiânia";
        q10.opcaoC = "C) Aparecida de Goiânia";
        q10.opcaoD = "D) Rio Verde";
        q10.opcaoE = "E) Catalão";
        q10.correta = "B";
        quiz.add(q10);

        // Questão 11
        Questao q11 = new Questao();
        q11.pergunta = "11) Qual é a capital do estado de Santa Catarina?";
        q11.opcaoA = "A) Joinville";
        q11.opcaoB = "B) Blumenau";
        q11.opcaoC = "C) Florianópolis";
        q11.opcaoD = "D) Chapecó";
        q11.opcaoE = "E) Criciúma";
        q11.correta = "C";
        quiz.add(q11);

        // Questão 12
        Questao q12 = new Questao();
        q12.pergunta = "12) Qual é a capital do estado do Pará?";
        q12.opcaoA = "A) Santarém";
        q12.opcaoB = "B) Belém";
        q12.opcaoC = "C) Marabá";
        q12.opcaoD = "D) Altamira";
        q12.opcaoE = "E) Bragança";
        q12.correta = "B";
        quiz.add(q12);

        // Questão 13
        Questao q13 = new Questao();
        q13.pergunta = "13) Qual é a capital do estado do Maranhão?";
        q13.opcaoA = "A) Imperatriz";
        q13.opcaoB = "B) São Luís";
        q13.opcaoC = "C) Caxias";
        q13.opcaoD = "D) Timon";
        q13.opcaoE = "E) Bacabal";
        q13.correta = "B";
        quiz.add(q13);

        // Questão 14
        Questao q14 = new Questao();
        q14.pergunta = "14) Qual é a capital do estado de Mato Grosso?";
        q14.opcaoA = "A) Cuiabá";
        q14.opcaoB = "B) Várzea Grande";
        q14.opcaoC = "C) Rondonópolis";
        q14.opcaoD = "D) Sinop";
        q14.opcaoE = "E) Barra do Garças";
        q14.correta = "A";
        quiz.add(q14);

        // Questão 15
        Questao q15 = new Questao();
        q15.pergunta = "15) Qual é a capital do estado da Paraíba?";
        q15.opcaoA = "A) Campina Grande";
        q15.opcaoB = "B) João Pessoa";
        q15.opcaoC = "C) Patos";
        q15.opcaoD = "D) Sousa";
        q15.opcaoE = "E) Guarabira";
        q15.correta = "B";
        quiz.add(q15);

        // Sistema de pontuação
        int pontuacao = 0;
        for (Questao q : quiz) {
            q.escrevaQuestao();
            String resposta = q.leiaResposta();
            if (q.isCorreta(resposta)) {
                pontuacao++;
            }
        }

        System.out.println("Fim do quiz! Sua pontuação foi: " + pontuacao + "/" + quiz.size());
    }
}

