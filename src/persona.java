import java.util.ArrayList;
import java.util.List;

public class persona {
    public String nombre;
    public String apellido;
    public int edad;
    public String documento;

    public List<perro> listperro;

    public persona() {
    }

    public persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.listperro = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<perro> getListperro() {
        return listperro;
    }

    public void setListperro(List<perro> listperro) {
        this.listperro = listperro;
    }


    public boolean Adoptarperro(perro perro) {
        if (listperro.size()>3){
            return false;
        }else {
            listperro.add(perro);
            return true;
        }

    }

    public String perromasgrande() {

        perro perromayor=listperro.get(0);

        for (perro perro : listperro){
            if (perro.getEdad()>perromayor.getEdad()){
                perromayor=perro;
            }
        }
        System.out.println(" EL PERRO MAYOR ES : ");
                return perromayor.getNombre();
    }

    @Override
    public String toString() {
        return "============= PERSONA =============" +
                " \n NOMBRE : " + nombre +
                " \n APELLIDO : " + apellido +
                " \n EDAD : " + edad +
                " \n DOCUMENTO : " + documento +
                " \n listperro=" + listperro ;
    }
}