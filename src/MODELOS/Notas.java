package MODELOS;

public class Notas {
    private Long id;
    private Integer nota;

    public Notas() {
    }

    public Notas(Integer nota, Long id) {
        this.nota = nota;
        this.id = id;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
