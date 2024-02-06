import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Principal {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        mostrarFechaHoraActual();

        int cantidad = 0;
        boolean ok = false;

        while (ok!= true) {
            try {
                System.out.print("Introduzca la cantidad de usuarios que quiere crear: ");
                cantidad = sc.nextInt();
                sc.nextLine();
                if(cantidad > 0){
                    ok = true;
                }else{
                    System.out.println("Debe de introducir un número mayor a 0");
                }
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Debe de introducir un número entero");
            }
        }
        

        Usuario[] usuarios = creaArrayUsuarios(cantidad);

        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Usuarios Creados");
        System.out.println("---------------------------");
        for(Usuario usuario : usuarios){
            System.out.println("Nombre del Usuario: "+ usuario.nombre);
            System.out.println("Apellidos del Usuario: "+ usuario.apellidos);
            System.out.println("Email del Usuario: "+ usuario.email);
            System.out.println();
        }

    }

    public static void mostrarFechaHoraActual() {
        Date fechaHoraActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaHoraFormateada = formato.format(fechaHoraActual);
        System.out.println("Fecha y hora actual: " + fechaHoraFormateada);
    }

    public static Usuario[] creaArrayUsuarios(int cantidad){
        Usuario[] usuarios = new Usuario[cantidad];

        String nombre;
        String apellidos;
        String email;

        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Creación de Usuarios");
        System.out.println("---------------------------");
        for(int i = 0; i < cantidad; i++){
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            System.out.print("Apellidos: ");
            apellidos = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();

            System.out.println();
            usuarios[i] = new Usuario(nombre, apellidos, email);
        }

        return usuarios;
    }
}

