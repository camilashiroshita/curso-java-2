## 1. Exercicio de encapsulamento:
Crie uma classe chamada ContaBancaria com os atributos privados numeroConta (Integer), saldo (Double), e titular (String). Utilize um construtor canônico para inicializar os atributos. Implemente dois métodos públicos para depositar e sacar dinheiro. O programa não deve permitir que a conta fique com saldo negativo!

Ao final, crie um método toString que retorne os dados da conta no seguinte formato: { numeroConta: 1, titular: Giuliana, saldo: 10.0 }.


## 2. Exercício de Herança  
Crie uma classe chamada FiguraGeometrica, que deve ser uma classe abstrata. Essa classe deve conter um atributo tipo (String), que deve estar acessível apenas para as suas subclasses. Declare um método abstrato chamado getArea , que deve retornar um Integer e deve ser implementado pelas subclasses.

Crie uma classe Triangulo que vai herdar de FiguraGeometrica. Essa classe deve ter os atributos privados base (Integer) e altura (Integer). A classe deve ter um construtor canônico para inicializar seus atributos e também deve inicializar o atributo herdado tipo com o valor "Triangulo". Implemente o método getArea herdado da superclasse, usando a fórmula: (base * altura) / 2. Finalmente, crie o método toString retornando os dados do triângulo no seguinte formato: { base: 4, altura: 2, tipo: Triangulo }.    

Crie uma classe Retangulo que vai herdar de FiguraGeometrica. Essa classe deve ter os atributos privados altura (Integer) e largura (Integer). A classe deve ter um construtor canônico para inicializar seus atributos e também deve inicializar o atributo herdado tipo com o valor "Retangulo". Implemente o método getArea herdado da superclasse, usando a fórmula: (altura * largura). Finalmente, crie o método toString retornando os dados do retângulo no seguinte formato: { altura: 4, largura: 2, tipo: Retangulo }.



