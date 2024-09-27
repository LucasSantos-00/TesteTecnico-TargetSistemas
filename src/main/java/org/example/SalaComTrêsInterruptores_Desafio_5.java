// 5)
/* Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes.
*  Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser.
*  Seu objetivo é descobrir qual interruptor controla qual lâmpada.
*  Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?*/

/*RESPOSTA 1 (principal)*/

// partindo do princípio de que as lâmpadas ficam quentes depois de um certo tempo que estão ligadas,
// eu faria da seguinte forma e tendo em mente que tenho apenas duas idas para a sala das lampadas

// Primeiro passo:

// ligaria o primeiro interruptor e deixaria ligado por um certo tempo
// logo em seguinda apagaria o primeiro interruptor e logo em seguida ativaria o segundo interruptor e iria a até a sala das lampadas

// Segundo passo:

// em seguinda anotaria as lampadas que estao acesas que naturalmente corresponderiam ao interruptor 2 (atualmente ligado)

// logo depois anotaria as lampadas que estao apagadas e quentes que iram corresponder ao interruptor 1 anteriomente ligado

// com isso as lampadas que estao desligadas e frias consequentemente correspondem ao interruptor 3 que nunca foi ligado


// pensei nessa logica partindo do principio que as lampadas nao teriam apenas dois estados(ligados/desligado), mais sim ligado, desligado quente,
// desligado frio


/*RESPOSTA 2*/

// Uma outra soluçao seria deixar uma camera provalmente de um Smartphone na sala das lampadas e marca o tempo em que ligo os interuptores
// e ver quais lampadas acendem no determinado tempo que acendi o determinado interuptor

// EXEMPLO:

// Entre o periodo inicial da gravaçao até os 10 segundos, deixei o primeiro interuptor ligado

// Entre o periodo dos 10 segundos da gravaçao até os 20 segundos, deixei o segundo interuptor ligado

// Entre o periodo dos 20 segundos da gravaçao até os 30 segundos, deixei o terceiro interuptor ligado

// logo depois teoricamente era só ver na gravaçao quais lampadas acenderam em determinado periodo de tempo.