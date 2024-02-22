package co.edu.uniquindio.poo;

public record Estudiante(String nombres,String apellidos,String numeroIdentificion,String telefono,String correo,byte edad) {

    public Estudiante{
        
    }
    public void presentarExamen( String enunciado){
        System.out.println("Resolver examen :" + enunciado);
    }
}
