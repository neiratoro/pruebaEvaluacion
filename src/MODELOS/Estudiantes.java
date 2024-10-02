package MODELOS;

public class Estudiantes {
    private Long id;
    private String nombre;
    private String documentoIdentidad;

    public Estudiantes() {
    }

    public Estudiantes(String documentoIdentidad, String nombre, Long id) {
        this.documentoIdentidad = documentoIdentidad;
        this.nombre = nombre;
        this.id = id;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
