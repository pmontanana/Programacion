package tiempo;

import java.util.*;

public class Hora {

    int horas, minutos, segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;

        valida();
    }

    public void pedirHora() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la hora");
        horas = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce los minutos");
        minutos = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce los segundos");
        segundos = Integer.parseInt(sc.nextLine());

        valida();
    }

    private void valida() {
        if (segundos < 0) {
            segundos = 59;
            minutos--;
        }

        if (minutos < 0) {
            minutos = 59;
            horas--;
        }
        if (horas < 0) {
            horas = 0;
            minutos = 0;
            segundos = 0;
        }
        if (segundos > 59) {
            minutos = minutos + segundos / 60;
            segundos = segundos % 60;
        }
        if (minutos > 59) {
            horas = horas + minutos / 60;
            minutos = minutos % 60;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public int muestraSegundos() {
        return horas * 3600 + minutos * 60 + segundos;
    }

    public void deSegundos(int numerosec) {
        if (numerosec > 3600) {
            horas = numerosec / 3600;
            numerosec = numerosec % 3600;
        }
        if (numerosec > 60) {
            minutos = numerosec / 60;
            numerosec = numerosec % 60;
        }
        segundos = numerosec;

    }

    public int segundosDesde(Hora hora1) {
        return hora1.muestraSegundos() - muestraSegundos();
    }

    public void siguiente() {
        segundos++;
        valida();
    }

    public void anterior() {
        segundos--;
        valida();
    }

    public Hora copia() {
        return new Hora(horas, minutos, segundos);
    }

    public boolean igualQue(Hora temp) {
        return horas == temp.horas && minutos == temp.minutos && segundos == temp.segundos;
    }

    public boolean menorQue(Hora temp) {
        if (horas < temp.horas) {
            return true;
        }
        if (minutos < temp.minutos) {
            return true;
        }
        if (segundos < temp.segundos) {
            return true;
        }
        return false;
    }

    public boolean mayorQue(Hora temp) {
        if (horas > temp.horas) {
            return true;
        }
        if (minutos > temp.minutos) {
            return true;
        }
        if (segundos > temp.segundos) {
            return true;
        }
        return false;
    }
}
