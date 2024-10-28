## PROGRAMAÇÃO ORIENTADA AOS OBJETOS

## 2024 /202 5

## EXERCÍCIO DE AVALIAÇÃO #

Prazo de entrega: 04 /11/202 4 Cotação: 1.5 valores

Plataforma: Inforestudante

```
Notas Importantes :
```
```
1 – Este exercício deverá ser realizado em grupo (2 estudantes da mesma turma).
```
```
2 – A fraude denota uma grave falta de ética e constitui um comportamento não
admissível. Qualquer tentativa de fraude leva a anulação do exercício tanto do
facilitador como do prevaricador.
```
O Laboratório NCS ( _Networks, Communications, and Security, Redes, Comunicações
e Segurança_ ) encomendou o desenvolvimento de um programa que permita a gestão
da sua infraestrutura ICT ( _Information and Communication Technologies, Tecnologias
de Informação e Comunicação_ ). O laboratório tem diferentes tipos de computadores
que incluem servidores, laptops, e Raspberry Pis. Os servidores estão ao nível de
_Cloud_ , os laptops ao nível de _Edge_ , e os Raspberry Pis ao nível _IoT_ ( _Internet of Things,
Internet das Coisas_ ). Para alem do seu nível dentro da infraestrutura ICT, todos os
computadores têm um ID gerado pelo _Helpdesk_ , memoria RAM, espaço de
armazenamento (disco), capacidade de processamento (CPU), e uma arquitetura que
pode ser x64 ou ARM. Para cada tipo de computador, os níveis iniciais são aleatórios^1 ,
segundo as gamas seguintes:

```
Tipo RAM (GB) Disco (GB) CPU (GHz)
```
```
Servidor 128 - 512 1024 - 16384 3.0-4.
```
```
Laptop 16 - 64 256 - 1024 2.0-3.
```
```
Raspberry Pi 2 - 8 16 - 128 1.0-2.
```
(^1) Para valores de RAM e disco o resultado deve ser um número potência de 2.


Pretende-se desenvolver um programa para a gestão dos computadores do Laboratório
NCS. Para isso, deve completar as seguintes alíneas:

```
A. Crie as classes necessárias para representar o problema descrito.
B. Crie a classe “NCSLab” e defina uma estrutura (ArrayList de Computadores) que
contenha 5 servidores, 5 laptops, e 5 Raspberry Pis para verificar as
funcionalidades indicadas nas alíneas seguintes.
C. Desenvolva o código necessário para imprimir todos os computadores (ID, RAM,
disco, CPU, nível).
D. Desenvolva o código necessário para mostrar todos os computadores de
arquitetura x64.
E. Desenvolva o código necessário para calcular o consumo energético do
computador em watts, tendo em conta as fórmulas seguintes:
```
```
Tipo Fórmula
```
```
Servidor 80 x frequência CPU
```
```
Laptop (50 x frequência CPU x 1. 2 ); se tem GPU;
(50 x frequência CPU); se não tem GPU
```
```
Raspberry Pi 20 x frequência CPU
```
Serão penalizadas soluções que não sigam os princípios da programação orientada aos
objetos e os conceitos de herança e polimorfismo. As soluções devem ter em
consideração boas práticas de programação. Não é permitido o uso dos métodos
_instaceOf(), getClass()_ e semelhantes. Não deverão ser usados métodos estáticos (para
além do main), nem variáveis estáticas.

ENTREGA: Deve ser feita na plataforma _InforEstudante_ num ficheiro em formato .zip
seguindo o formato: _Exercicio2NomesAlunos.zip_. Este ficheiro deverá conter apenas o
código fonte da aplicação.

