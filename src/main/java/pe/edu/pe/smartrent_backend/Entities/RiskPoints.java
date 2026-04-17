package pe.edu.pe.smartrent_backend.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "RiskPoints")
public class RiskPoints {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRiskPoints;

    @Column(name = "description", length = 100, nullable = false)
    private String description;

    @Column(name = "cordX",nullable = false)
    private double cordX;

    @Column(name = "cordY", nullable = false)
    private double cordY;

    @Column(name = "cordZ", nullable = false)
    private double cordZ;

    @Column(name = "severity", length = 100, nullable = false)
    private String severity;

    @OneToMany
    @JoinColumn(name = "idModels3D")
    private Models3D models3D;

    public RiskPoints() {
    }

    public RiskPoints(Integer idRiskPoints, String description, double cordX, double cordY, double cordZ, String severity, Models3D models3D) {
        this.idRiskPoints = idRiskPoints;
        this.description = description;
        this.cordX = cordX;
        this.cordY = cordY;
        this.cordZ = cordZ;
        this.severity = severity;
        this.models3D = models3D;
    }

    public Integer getIdRiskPoints() {
        return idRiskPoints;
    }

    public void setIdRiskPoints(Integer idRiskPoints) {
        this.idRiskPoints = idRiskPoints;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCordX() {
        return cordX;
    }

    public void setCordX(double cordX) {
        this.cordX = cordX;
    }

    public double getCordY() {
        return cordY;
    }

    public void setCordY(double cordY) {
        this.cordY = cordY;
    }

    public double getCordZ() {
        return cordZ;
    }

    public void setCordZ(double cordZ) {
        this.cordZ = cordZ;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Models3D getModels3D() {
        return models3D;
    }

    public void setModels3D(Models3D models3D) {
        this.models3D = models3D;
    }
}
