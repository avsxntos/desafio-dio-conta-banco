
# Desafio ContaBanco

Neste repositório foi feito um código básico de Java, onde criamos algumas variáveis sem valores atribuídos inicialmente, e utilizamos uma biblioteca chamada Scanner, atráves dessa biblioteca podemos pedir para que o usuário insira seu proprio valor sobre as variáveis consequentemente elas serão preenchidas com valor atribuido, após essa requisição, demonstramos uma imagem com os dados preenchidos pelo usuário!

## Obstáculos
Ao tentar exibir a mensagem que deveria para o usuário, não notei que estava cometendo um erro na hora da tentativa de concatenação do código, onde eu estava tentando concatenar uma string com uma variável do tipo double usando o operador +, mas não estava fechando a string corretamente.


                    


## Correção na Prática

O código com erro estava assim:
```java
System.out.println("Olá! " +nomeCliente ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia ", conta " +numero "e seu saldo é de R$" +saldo " e já está disponível para saque!");
}


```
E para conseguir resolve tive que mudar o código para:
```java
System.out.printf("Olá! %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo é de R$%.2f e já está disponível para saque!%n", 
                  nomeCliente, agencia, numero, saldo);
}


```


