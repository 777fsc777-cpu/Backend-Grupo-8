package pe.edu.pe.smartrent_backend.DTOS.contractDTOS;

public class EstateWithoutActiveContractDTO {

    private Integer idEstate;
    private String estateTitle;

    public EstateWithoutActiveContractDTO() {
    }

    public EstateWithoutActiveContractDTO(Integer idEstate, String estateTitle) {
        this.idEstate = idEstate;
        this.estateTitle = estateTitle;
    }

    public Integer getIdEstate() {
        return idEstate;
    }

    public void setIdEstate(Integer idEstate) {
        this.idEstate = idEstate;
    }

    public String getEstateTitle() {
        return estateTitle;
    }

    public void setEstateTitle(String estateTitle) {
        this.estateTitle = estateTitle;
    }
}