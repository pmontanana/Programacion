package banco;

import java.util.*;

public class Cuenta {
        static long numeradorCuentas = 100001;
        long numCuenta, nDNI;
        char letraDNI;
        double saldo;
        float interesAnual;
        

        public Cuenta(long nDNI, char letraDNI, double saldo, float interesAnual){
            this.nDNI = nDNI;
            this.letraDNI = letraDNI;
            this.saldo = saldo;
            this.interesAnual = interesAnual;
            this.numCuenta = numeradorCuentas;
            numeradorCuentas++;
        }

        public void aplicaInteres(){
            saldo += Math.round(saldo*interesAnual/365.0)/100.0;
        }

        public void ingresar(double cant){
            saldo += cant;
        }

        public void retirar(double cant){
            if(cant > saldo){
                System.out.println("No se puede retirar esa cantidad de dinero");
            }else{
                saldo -= cant;
            }
        }

        public void muestraDatos(){
            System.out.println("Cuenta: " + numCuenta+ "\n" + "Numero DNI: " + nDNI + "\n" + "Saldo: " + saldo + "\n" + "Interes Anual: " + interesAnual);
        }
}
