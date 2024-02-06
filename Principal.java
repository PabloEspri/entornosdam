import java.util.Date;
import java.text.SimpleDateFormat;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        mostrarFechaHoraActual();
    }

    public static void mostrarFechaHoraActual() {
        Date fechaHoraActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaHoraFormateada = formato.format(fechaHoraActual);
        System.out.println("Fecha y hora actual: " + fechaHoraFormateada);
    }
}

