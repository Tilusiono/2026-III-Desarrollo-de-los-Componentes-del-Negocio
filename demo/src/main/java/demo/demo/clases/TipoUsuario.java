package demo.demo.clases;

public class TipoUsuario {

    private String tipoUsuarioId;
    private String tipoUsuarioDescripcion;
    private boolean tipoUsuarioEstado = true;

    public TipoUsuario(String id, String descripcion, boolean estado) {
        this.tipoUsuarioId = id;
        this.tipoUsuarioDescripcion = descripcion;
        this.tipoUsuarioEstado = estado;
    }

    public TipoUsuario(String id, String descripcion) {
        this.tipoUsuarioId = id;
        this.tipoUsuarioDescripcion = descripcion;
    }

    public String getTipoUsuarioId() {
        return tipoUsuarioId;
    }

    public String getTipoUsuarioDescripcion() {
        return tipoUsuarioDescripcion;
    }

    public boolean isTipoUsuarioEstado() {
        return tipoUsuarioEstado;
    }
}