package tiempo;

import java.util.*;

public class Fecha {

    int dia, mes, ano;

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public void leerFecha(){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Escribe un dia del 1 al 31");
            dia = Integer.parseInt(sc.nextLine());
        }while(dia < 1 || dia > 31);

        do{
            System.out.println("Escribe un mes del 1 al 12");
            mes = Integer.parseInt(sc.nextLine());
        }while(mes < 1 || mes > 12);

        do{
            System.out.println("Escribe un año del 1900 al 2050");
            ano = Integer.parseInt(sc.nextLine());
        }while(ano < 1900 || ano > 2050);

    }

    public String toString(){
        return String.format("%02d/%02d/%4d", dia, mes, ano);
    }

    public boolean esBisiesto(){
        return ano % 4 == 0;
    }

    public int diasMes(int mes){
        int[] meses = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        

        if (mes == 2 && esBisiesto()){
            meses[1] = 29;
        }
        return meses[mes - 1];
    }

    public boolean validar(){
        return mes > 0 && mes < 13 && dia > 0 && dia < diasMes(mes) && ano > 1899 && ano < 2051;
    }

    public void fechaCorta(){
        System.out.println(String.format("%02d-%02d-%04d", dia, mes, ano)); 
    }

    public void fechaLarga(){
        String[] meses = new String[] {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        System.out.println(dia + " de " + meses[mes-1] + " de " + ano);
    }

    public void siguienteDia(){
        dia++;
        if (dia > diasMes(mes)){
            dia = 1;
        }
    }

    public void anterior(){
        dia--;
        if (dia < 1){
            dia = diasMes(mes);
        }
    }

    public Fecha copiaFecha(){
        return new Fecha(dia, mes, ano);
    }

    public boolean igualQue(Fecha temp){
        return temp.dia == dia && temp.mes == mes && temp.ano == ano;
    }

    public boolean menorQue(Fecha temp){
        if (ano < temp.ano){
            return true;
        }if (mes < temp.mes){
            return true;
        }if (dia < temp.dia){
            return true;
        }
        return false;
    }

    public boolean mayorQue(Fecha temp){
        if (ano > temp.ano){
            return true;
        }if (mes > temp.mes){
            return true;
        }if (dia > temp.dia){
            return true;
        }
        return false;
    }
}
