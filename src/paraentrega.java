public class paraentrega {
    public static void main(String[] args) {
        int[] numeros1 = {8, 9, 7};
        int[] numeros2 = {4, 5, 6};
        double media1 = calcularMedia(numeros1);
        double media2 = calcularMedia(numeros2);
        double somaDasMedias = media1 + media2;
        System.out.println("A média dos números 8, 9 e 7 é: " + media1);
        System.out.println("A média dos números 4, 5 e 6 é: " + media2);
        System.out.println("A soma das duas médias é: " + somaDasMedias);
        double divisãodamedia = somaDasMedias / 2;
        System.out.println(" media total " + divisãodamedia);
    }
    public static double calcularMedia(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return (double) soma / numeros.length;
    }
}
