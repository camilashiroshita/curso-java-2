## 1. Reverter String
Escreva um programa em Java que contenha uma classe chamada ReversorDeString. Essa classe deve ter um método estático chamado reverterString que recebe uma string como parâmetro e retorna a string revertida.


## 2. Palíndromos
Escreva um programa em Java que contenha uma classe chamada Palindromo. Essa classe deve ter um método estático chamado isPalindromo que recebe uma string como parâmetro e retorna um valor booleano indicando se a string é um palíndromo ou não.

Um palíndromo é uma sequência de caracteres que é lida da mesma forma tanto da esquerda para a direita quanto da direita para a esquerda, desconsiderando espaços e diferenciação entre maiúsculas e minúsculas.

Por exemplo, "Socorram me subi no onibus em Marrocos" é um palíndromo.

Para a classe ReversorDeString, você deve utilizar a sua solução do exercício anterior, e com ela reverter a String para verificar se ela é ou não um palíndromo.

## 3. Jogo da Forca
Você deve criar uma classe Forca que vai implementar o famoso jogo da forca:

A classe deve conter 3 atributos privados: forca (char[]), palavra (String) e tentativas (Integer).

Crie um construtor para inicializar palavra e tentativas. A forca deve ser inicializada como um caractere '_' ao invés das letras da palavra original.

Crie o método void fazerPalpite que recebe um parâmetro palpite (char) e checa se ele existe na palavra. Se existir, substitua no atributo forca o '_' pela letra encontrada. Não se esqueça de subtrair as tentativas em caso de erro, e também verifique se ainda existem tentativas para fazer um palpite.

Crie um método exibirForca que retorna o atributo forca como String, caso ainda existam tentativas, ou o texto "A palavra era java. Você possui 0 tentativas."
