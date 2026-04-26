package pe.edu.pe.smartrent_backend.DTOS.userbackgorundDTOS;

import java.time.LocalDate;

public class UserBackgroundGETDTO {

    private Integer idUserBackground;
    private String type;
    private String description;
    private String source;
    private LocalDate registrationDate;
    private Integer idUser;

    public Integer getIdUserBackground() {
        return idUserBackground;
    }

    public void setIdUserBackground(Integer idUserBackground) {
        this.idUserBackground = idUserBackground;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
}
