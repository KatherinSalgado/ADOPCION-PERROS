import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<persona> listpersona = new ArrayList<>();
        List<perro> listperrodisponible = new ArrayList<>();

        int op1;

        do {

            System.out.println("""
                    ====================== SK ADOPCIONES ======================
                    1) REGISTAR PERSONA 
                    2) REGISTRAR PERRO
                    3) VER PERSONA REGISTRADA
                    4) VER PERROS REGISTRADOS
                    5) ADOPTAR PERRO
                    6) CONSULTAR EL PERRO MAS VIEJO ADOPTADO
                    7) SALIR 
                    ===========================================================
                    """);
            op1 = teclado.nextInt();
            switch (op1) {
                case 1 -> {

                    String nombre;
                    String apellido;
                    int edad;
                    String documento;

                    System.out.println(" === INGRESE NOMBRE === ");
                    nombre = teclado.next();
                    System.out.println(" === INGRESE APELLIDO === ");
                    apellido = teclado.next();
                    System.out.println(" === INGRESE EDAD === ");
                    edad = teclado.nextInt();
                    System.out.println(" === INGRESE DOCUMENTO === ");
                    documento = teclado.next();

                    listpersona.add(new persona(nombre, apellido, edad, documento));

                }
                case 2 -> {
                    String placa;
                    String nombre;
                    String raza;
                    int edad;
                    String tamaño;

                    System.out.println(" === INGRESE PLACA === ");
                    placa = teclado.next();
                    System.out.println(" === INGRESE NOMBRE === ");
                    nombre = teclado.next();
                    System.out.println(" === INGRESE RAZA === ");
                    raza = teclado.next();
                    System.out.println(" === INGRESE EDAD === ");
                    edad = teclado.nextInt();
                    System.out.println(" === INGRESE TAMAÑO === ");
                    tamaño = teclado.next();
                    perro nuevoperro = new perro(placa, nombre, raza, edad, tamaño);
                    listperrodisponible.add(nuevoperro);

                }
                case 3 -> {
                    for (persona e : listpersona) {
                        System.out.println(" " + e);
                    }
                }
                case 4 -> {
                    for (perro e : listperrodisponible) {
                        System.out.println(" " + e);
                    }
                }
                case 5 -> {
                    String documento;
                    String placa;

                    System.out.println(" DIGITE SU DOCUMENTO ");
                    documento=teclado.next();
                    System.out.println(" DIGITE LA PLACA DEL PERRO QUE DESEA AOPTAR ");
                    placa=teclado.next();

                    perro perroadoptar=null;
                    persona personaadopta=null;

                    for (persona persona : listpersona){
                        if (persona.getDocumento().equals(documento)){
                            personaadopta=persona;
                        }
                    }

                    for (perro perro : listperrodisponible){
                        if (perro.getPlaca().equals(placa)){
                            perroadoptar=perro;
                        }
                    }
                    if (personaadopta.Adoptarperro(perroadoptar)){
                        listperrodisponible.remove(perroadoptar);
                        System.out.println(" PERRO ADOPTADO CON EXITO ");
                    }else {
                        System.out.println(" YA SUPERO SU LIMITE DE ADOPCION ");
                    }
                }
                case 6 -> {
                    String documento;

                    System.out.println(" DIGITE SU DOCUMENTO ");
                    documento= teclado.next();

                    persona personaadopto = null;
                    for (persona persona : listpersona){
                        if (persona.getDocumento().equals(documento)){
                            personaadopto=persona;
                            System.out.println("  " + personaadopto.perromasgrande());
                        }else {
                            System.out.println(" PERSONA NO ENCONTRADA ");
                        }
                    }
                }
                case 7 -> {
                    System.out.println(" === GRACIAS POR ADOPTAR UN AMIGO, SALIENDO === ");
                }default -> System.out.println(" === OPCION INVALIDA, INTENTE DE NUEVO === ");
            }

        } while (op1 != 7);
    }
}