public class Main {
    public static void main(String[] args) {

        // Inicializa o array com alguns números inteiros
        int[] numeros = {44, 15, 12, 28, 53, 60};

        // Variável para percorrer o array
        int i = 0;

        // Inicializa as variáveis para armazenar o maior e o menor número
        int maior = 0;
        // Inicialmente definido como o primeiro elemento do array
        int menor = numeros[0];

        //Loop para encontrar o maior e o menor número
        while (i < numeros.length) {
            // Atualiza o maior número se o número atual for maior
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            // Atualiza o menor número se o número atual for menor
            if (numeros[i] < menor){
                menor = numeros[i];
            }
            // Incrementa o índice para a próxima iteração
            i++;

        }

        // Exibe o maior/menor número encontrado
        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);




        // Cria arrays para armazenar números pares e ímpares
        int[] pares = new int[numeros.length];
        int[] impares = new int[numeros.length];
        // Índices para controlar onde adicionar os números pares e ímpares
        int indiciPares = 0;
        int indiciImpares = 0;
        int j = 0;

        // Reinicializa o índice para percorrer o array novamente
        i = 0;

        // Loop para separar os números em pares e ímpares
        while (i < numeros.length) {
            // Verifica se o número é par
            if (numeros[i] % 2 == 0) {
                // Adiciona o número par ao array de pares e incrementa o índice dos pares
                pares[indiciPares] = numeros[i];
                indiciPares++;
            } else {
                // Adiciona o número ímpar ao array de ímpares e incrementa o índice dos ímpares
                impares[indiciImpares] = numeros[i];
                indiciImpares++;
            }
            // Incrementa o índice para a próxima iteração
            i++;
        }

        // Exibe os números pares armazenados
        System.out.print("Números pares: ");
        for ( j = 0; j < indiciPares; j++) {
            System.out.print(pares[j] + " ");
        }
        System.out.println();

        // Exibe os números ímpares armazenados
        System.out.print("Números ímpares: ");
        for ( j = 0; j < indiciImpares; j++) {
            System.out.print(impares[j] + " ");
        }
        System.out.println();

        // Verifica se cada número é primo
        boolean[] primo = new boolean[numeros.length];

        for (i = 0; i < numeros.length; i++) {
            primo[i] = ehPrimo(numeros[i]);
        }

        // Exibe a verificação de números primos
        System.out.println("Verificação se o número é primo:");
        for (i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " é primo? " + primo[i]);
        }
}


    // Método para verificar se um número é primo
    public static boolean ehPrimo (int numero) {


        if (numero <= 1) {
            return false;
        }

        if (numero == 2) {
            return true;
        }

        if (numero % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;

    }
}



