// Fazer um programa que imprima na tela a média dos números ímpares que estão no intervalo entre 0 e 100.

public class Ex3 {
    public static void main(String[] args) {
        int i;
        int count=0;
        int sum=0;
        int med;
        for(i=0; i<=100; i++){
            if(i%2!=0){
                count++;
                sum=sum+i;
            }
        }
        med=sum/count;
        System.out.println(med);
}
}
