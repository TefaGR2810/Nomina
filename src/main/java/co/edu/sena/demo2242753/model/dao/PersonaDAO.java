package co.edu.sena.demo2242753.model.dao;

public class PersonaDAO {
    private String nombres;
    private String apellidos;
    private int documento;
    private int dias_trabajados;
    private int Sueldo_mensual;

    public PersonaDAO(String nombres, String apellidos, int documento, int dias_trabajados, int sueldo_mensual) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.dias_trabajados = dias_trabajados;
        this.Sueldo_mensual = sueldo_mensual;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getDias_trabajados() {
        return dias_trabajados;
    }

    public void setDias_trabajados(int dias_trabajados) {
        this.dias_trabajados = dias_trabajados;
    }

    public int getSueldo_mensual() {
        return Sueldo_mensual;
    }

    public void setSueldo_mensual(int sueldo_mensual) {
        Sueldo_mensual = sueldo_mensual;
    }


}
