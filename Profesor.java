import java.util.List;

public class Profesor extends Persona {
    String str;
    int edad;
    List<Prestamo> prestamos;


    public Profesor(String numeroDeTelefono, String numeroDeTelefono1) {
            super(numeroDeTelefono);
        }

        public void printInformacionPersonal () {
            toString();
        }

        public void printTodaLaInformacion () {
            toString();
            for (Prestamo p : prestamos) {
                System.out.println(p);
            }
        }

        public String toString(){
        return "Nombre: "+str+"\n"+"Edad: "+edad+"\n"+"Telefono: "+numeroDeTelefono;
        }

    }