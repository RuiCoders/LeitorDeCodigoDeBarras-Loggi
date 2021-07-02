# LeitorDeCodigoDeBarras-Loggi
**O Leitor de código de barras da Loggi**

A Loggi está em constante expansão e precisa da sua ajuda para
conectar o Brasil. O processo de separação de pacotes acontece de
modo automático, uma esteira inteligente lê o código de barras dos
pacotes e os agrupa pelas regiões de destino. O código de barras do
pacote é composto por 15 dígitos, onde cada trinca numérica
representa uma informação do pacote.

Ordem das Trincas
1 Região de Origem
2 Região de Destino
3 Código da Loggi
4 Código do Vendedor do produto
5 Tipo do produto

Região Código
Centro-oeste 111
Nordeste 333
Norte 555
Sudeste 888
Sul 000

Tipo do Produto Código
Jóias 000
Livros 111
Eletrônicos 333
Bebidas 555
Brinquedos 888

Exemplo:

Código: 888 333 555 999 000
Região de origem: Sudeste
Região de destino: Nordeste
Código Loggi: 555
Código do vendedor do produto: 999
Tipo do produto: Jóias
Considere as seguintes restrições:

1) A Loggi não envia produtos que não sejam dos tipos acima
informados.

2) Não é possível despachar pacotes contendo jóias tendo como
região de origem o Centro-oeste;

3) O vendedor 584 está com seu CNPJ inativo e, portanto, não pode
mais enviar pacotes pela Loggi, os códigos de barra que
estiverem relacionados a este vendedor devem ser considerados
inválidos.

Considere a lista de pacotes:
Pacote 1: 888555555123888
Pacote 2: 333333555584333
Pacote 3: 222333555124000
Pacote 4: 000111555874555
Pacote 5: 111888555654777
Pacote 6: 111333555123333
Pacote 7: 555555555123888
Pacote 8: 888333555584333
Pacote 9: 111333555124000
Pacote 10: 333888555584333
Pacote 11: 555888555123000
Pacote 12: 111888555123555
Pacote 13: 888000555845333
Pacote 14: 000111555874000
Pacote 15: 111333555123555

A Loggi precisa:

a) Identificar o destino de cada pacote.

b) Saber quais pacotes possuem códigos de barras válidos e/ou
inválidos.

c) Identificar se algum pacote que tem como origem a região Sul tem
Brinquedos em seu conteúdo.

d) Listar os pacotes agrupados por região de destino (Considere apenas
pacotes válidos).

e) Listar o número de pacotes enviados por cada vendedor (Considere
apenas pacotes válidos).

f) Gerar o relatório/lista de pacotes por destino e por tipo (Considere
apenas pacotes válidos)
