package NextBill.ERP.infraestructure.abstract_service;
import org.springframework.data.domain.Page;

public interface CrudAbstractService<RQ, RS, ID> {
    Page<RS> getAll(int page, int size);

    RS create(RQ request);

    RS update(RQ request, ID id);

    void delete(ID id);

    RS getById(ID id);
}