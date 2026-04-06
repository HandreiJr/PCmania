PCMania

Nome: Handrei Marques de Oliveira Junior
Curso: GES
Matrícula: 700

Observações:
- Durante o desenvolvimento do projeto foi utilizado algumas vezes ajuda de um programador amigo que ja trabalha com Java para sanar algumas duvidas,
  também foi bastante utilizado como ajuda e modelo os própios slides das aulas para que fosse tudo feito da mesma maneira que foi passada na sala de aula.
  No final do projeto também foi pedido ajuda da IA para verificar erros.

Uso de IA:
- MODELO UTILIZADO: Claude Sonnet 4.6
- PROMPT USADO: "Agora você é um programador Sênior com mais de 10 anos de experiência em Java e Orientação a Objetos,
  analise esse código e veja o que precisa ser corrigido ou o que poderia ser feito de alguma forma diferente" (Upload do Código ja desenvolvido)
  
- RESULTADO: O resultado foi satisfatório. Foi encontrado os seguintes tipos de problemas que foram corrigidos... 

1. No diagrama UML na classe "HardwareBasico" diz que a capacidade deveria ser float, mas não tem necessecidade explícita para que seja float, 
   então foi alterado e feito com "int" ja que a variavel aparenas armazena um valor inteiro.

2. O setSistemaOperacional tinha sido criado como setter convencional, mas não deveria ser.
   O diagrama UML do exercício mostra que Computador tem o método "+addMemoriaUSB(musb: MemoriaUSB)" mas para o sistema operacional não há método definido no UML. 
   O setter setSistemaOperacional tinha criado sem necessidade explícita. O mais seguro era inicializar o SO dentro do próprio construtor de Computador, ou receber ele como parâmetro.

3. Foi corrigido a nomenclatura para constantes da variavel "matricula" para "MATRICULA".

- Esses foram os erros observados e corrigidos no código de acordo com a IA.

Referências:
- Slides das aulas de POO
- Exemplos do GitHub do Chris https://github.com/chrislima-inatel/C206_C125
