package co.edu.uniquindio.poo.clinicaveterinariapro.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private String id;
    private Mascota mascota;
    private LocalDate fecha;
    private String hora;
    private String motivo;
    private String diagnostico;
    private Veterinario veterinario;
    private List<Tratamiento> listratamientos;

    public Consulta(String id, Mascota mascota, LocalDate fecha, String hora, String motivo, String diagnostico, Veterinario veterinario) {
        this.id = id;
        this.mascota = mascota;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.veterinario = veterinario;
        this.listratamientos = new ArrayList<>();

    }
    public void agregarTratamiento(Tratamiento tratamiento) {
        App.veterinaria.agregarTratamiento(tratamiento);
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public List<Tratamiento> getListtratamientos() {
        return listratamientos;
    }

    public void setListtratamientos(List<Tratamiento> listtratamientos) {
        this.listratamientos = listtratamientos;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "id='" + id + '\'' +
                ", mascota=" + mascota +
                ", fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", motivo='" + motivo + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", veterinario=" + veterinario +
                ", listratamientos=" + listratamientos +
                '}';
    }
}

