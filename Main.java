import java.util.Scanner;

public class Main { //docker run -it --rm -p 
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {


        String ipAddress = SC.next();
        String[] ipParts;
        ipParts = ipAddress.split("\\.");

        
        for (int i = 0; i < ipParts.length; i++) {
            System.out.println("Parte " + (i + 1) + ": " + ipParts[i]);
        }


        System.out.println("Hello, World!");
    }
}
/*
Endereço IP (binário) : 10101100.00010000.00101101.11001000
Máscara (prefixo) : /20
Máscara (decimal) : 255.255.240.0
Máscara (binário) : 11111111.11111111.11110000.00000000
Endereço da rede : 172.16.32.0
Endereço de broadcast : 172.16.47.255
Quantidade de hosts : 4094
Faixa de hosts : 172.16.32.1 a 172.16.47.254
 */