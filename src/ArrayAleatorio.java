import java.util.Random;

//Criar um vetor de 10 posições e gerar números aleatórios 
//de 0 a 100 para preencher o vetor sem repetir os números

public class ArrayAleatorio {
    public static void main(String[] args) {

        int[] vetorAleatorio = new int[10]; //CRIEI UM VETOR DE INTEIROS COM 10 POSIÇÕES
        Random random = new Random(); //CRIEI UM OBJETO DA CLASSE RANDOM QUE GERA NÚMEROS ALEATÓRIOS

        for (int i = 0; i < vetorAleatorio.length; i++) {
            int numeroAleatorio;
            boolean numeroRepetido;
            do {
                numeroAleatorio = random.nextInt(101); //GERA UM NÚMERO ALEATÓRIO DE 0 A 100
                numeroRepetido = false; //VARIÁVEL QUE VERIFICA SE O NÚMERO É REPETIDO OU NÃO
                for (int j = 0; j < i; j++) {
                    if (vetorAleatorio[j] == numeroAleatorio) {
                        numeroRepetido = true;
                    }
                }
            }
            while(numeroRepetido = false);
            vetorAleatorio[i] = numeroAleatorio;
        }
        for (int i = 0; i < vetorAleatorio.length; i++) {
            System.out.print(vetorAleatorio[i] + " ");
        }
    }
}


