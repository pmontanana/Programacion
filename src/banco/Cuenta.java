package banco;

import java.util.*;

public class Cuenta {
        static long numeradorCuentas = 100001;
        long numCuenta, nDNI;
        char letraDNI;
        int saldo;
        float interesAnual;
        

        public Cuenta(long nDNI, char letraDNI, int saldo, float interesAnual){
            this.nDNI = nDNI;
            this.letraDNI = letraDNI;
            this.saldo = saldo;
            this.interesAnual = interesAnual;
            this.numCuenta = numeradorCuentas;
            numeradorCuentas++;

        }
}
