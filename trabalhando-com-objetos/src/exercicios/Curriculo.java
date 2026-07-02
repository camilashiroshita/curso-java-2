package exercicios;

import java.util.Arrays;

/* Escreva uma classe chamada Curriculo para montar o seu currículo profissional.
Ela deve ter atributos nome, idade, competencias e experiencias. 
Além disso, deve ter um método sobreMim que imprime um resumo do currículo da seguinte forma: "Olá, eu sou XXXX, 
trabalho com [Java], e minhas experiências foram [XXXXX, XXXXXXXXXXX]". */

public class Curriculo {
    public String nome = "  Camila Ono";
    public int idade = 25;
    public String[] competencias = { "Java", "SQL" };
    public String[] experiencias = { "Desenvolvimento de Software", "Análise de Sistemas" };
    
    public String sobreMim() {
        return "Olá, eu sou " + nome + 
        ", tenho " + idade + " anos, trabalho com " +
        Arrays.toString(competencias) + ", e minhas experiências foram " + Arrays.toString(experiencias);
    }
}

