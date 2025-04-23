public class perro {
    public String placa;
    public String nombre ;
    public String raza ;
    public int edad;
    public String tamaño;

    public perro() {
    }

    public perro(String placa, String nombre, String raza, int edad, String tamaño) {
        this.placa = placa;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "============= PERRO =============" +
                " \n PLACA : " + placa +
                " \n NOMBRE : " + nombre +
                " \n RAZA : " + raza +
                " \n EDAD : " + edad +
                " \n TAMAÑO : " + tamaño;
    }
}
