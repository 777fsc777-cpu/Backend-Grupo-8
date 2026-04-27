package pe.edu.pe.smartrent_backend.ServicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.smartrent_backend.DTOS.contractDTOS.EstateWithoutActiveContractDTO;
import pe.edu.pe.smartrent_backend.DTOS.contractDTOS.LessorIncomeDTO;
import pe.edu.pe.smartrent_backend.Entities.Contract;
import pe.edu.pe.smartrent_backend.Repositories.IContractRepository;
import pe.edu.pe.smartrent_backend.ServicesInterfaces.IContractService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContractServiceImplement implements IContractService {

    @Autowired
    private IContractRepository cR;

    @Override
    public List<Contract> list() {
        return cR.findAll();
    }

    @Override
    public Contract insert(Contract c) {
        return cR.save(c);
    }

    @Override
    public Optional<Contract> listId(int id) {
        return cR.findById(id);
    }

    @Override
    public void update(Contract c) {
        cR.save(c);
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public List<LessorIncomeDTO> getIncomeByLessor() {
        return cR.getIncomeByLessor().stream().map(row ->
                new LessorIncomeDTO(
                        ((Number) row[0]).intValue(),
                        (String) row[1],
                        ((Number) row[2]).longValue(),
                        ((Number) row[3]).doubleValue()
                )
        ).collect(Collectors.toList());
    }

    @Override
    public List<EstateWithoutActiveContractDTO> getEstatesWithoutActiveContract() {
        return cR.getEstatesWithoutActiveContract().stream().map(row ->
                new EstateWithoutActiveContractDTO(
                        ((Number) row[0]).intValue(),
                        (String) row[1]
                )
        ).collect(Collectors.toList());
    }
}
