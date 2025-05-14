package conexion;


import java.sql.Date;

public class Animal {
    private int id;
    private String nombre;
    private String especie;
    private Date fechaNacimiento;
    private String historiaMedica;
    private String descripcion;
    private String foto;
    private int recintoId;

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getHistoriaMedica() { return historiaMedica; }
    public void setHistoriaMedica(String historiaMedica) { this.historiaMedica = historiaMedica; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getFoto() { return foto; }
    public void setFoto(String foto) { this.foto = foto; }

    public int getRecintoId() { return recintoId; }
    public void setRecintoId(int recintoId) { this.recintoId = recintoId; }
}
