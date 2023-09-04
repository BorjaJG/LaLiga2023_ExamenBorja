public class partido {
    private String id ;

    private  Date fechaPartido;
    private String equipoLocal;
    private String eqipoVisitante;

    public Date getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(Date fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEqipoVisitante() {
        return eqipoVisitante;
    }

    public void setEqipoVisitante(String eqipoVisitante) {
        this.eqipoVisitante = eqipoVisitante;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}