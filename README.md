# LPM-Trabalho_Final
Trabalho final de programação modular realizado no primeiro semestre de 2021. 

Uma empresa do ramo de entrega de encomendas contratou você para participar do desenvolvimento de um sistema de software que os auxilie no controle de seus custos. 
Em primeiro lugar, a preocupação da empresa é monitorar os gastos relacionados aos veículos de entrega. 
Os veículosda empresa fazem rotasdiárias. Cada rota tem um uma distância total percorrida a ser percorrida. 
Existem diversos tipos de veículos que realizam as entregas (carros, vans, furgões e caminhões). 
Cada um tem um tanque de combustívelde capacidade diferente. 
A autonomia diária (quilometragem máxima) do veículo depende do combustível utilizado.Desta maneira, as rotas só podem ser alocadas para um veículo dentro do seu limite diário. 
Além disso, os veículos precisam realizar manutenções programadas de acordo com quilometragens definidas. 
Estas regras são resumidas nos quadros abaixo:VeículoTanqueManutenção periódicaManutenção troca de peças:

Carro50L10.000km10.000km
Van60L10.000km12.000km
Furgão80L10.000km12.000km
Caminhão250L20.000km20.000km

Combustível
Gasto médio
Preço médio
Álcool7km/LR$ 4,49
Gasolina10km/LR$ 5,79
Diesel4km/LR$ 4,34

Sabendo que um veículo usa somente um tipo de combustível por vez, mas pode mudar o tipo de combustível utilizado, a empresa precisa:
a)Adicionar, para um veículo, uma rota, respeitando o limite diário.
b)Sabera quilometragem total percorrida por um veículo.
c)Realizar as manutenções de um veículo tão cedo quanto forem necessárias.
d)Calcular a despesa total de um veículo, considerando combustível e manutenções.Implemente este sistema seguindo o diagrama de classes em anexo.

Regras e tarefas:
•Grupos de até 4 alunos.
•Implemente as classes de acordo com odiagrama.Mudanças na estrutura de classes não são autorizadas sem debate prévio.
•Onde estão indicados atributos que “não interessam”o grupo pode ficar à vontade para criar atributos protegidos ou privados para resolver os problemas. 
•Métodos construtores e get/set não estão descritos no diagrama. Os get/set considerados necessários devem ter o nome no padrão “operacaoAtributo”, por exemplo, getKmRodados() em Veículo.
•Crie um sistema/app queleia dados de arquivos serializados em textos ou formato de objetos do Java e realize as tarefas de acordo com o descrito acima.
•Serão  avaliadas  tanto  a  correção  do  programa  e  o  cumprimento  dos  requisitos,  como  o  projeto  e implementação seguindo as recomendações e técnicas de modularidade e POO.
•O uso de padrão de projeto será debatido nas aulas com cada grupo de trabalho.
•Critérios básicos:oImplementação das regras de negócio de acordo com o projeto: 8 pontosoExceções e tratamento de erros: 3 pontosoSerialização dos dados: 3 pontosoUso de um padrão de projeto: 6 pontoso
