package NextBill.ERP.infraestructure.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import NextBill.ERP.api.dtos.request.ClanRequest;
import NextBill.ERP.api.dtos.response.ClanResponseNoUsers;
import NextBill.ERP.domain.entities.Clan;
import NextBill.ERP.domain.repositories.ClanRepository;
import NextBill.ERP.infraestructure.abstract_service.IClanService;
import NextBill.ERP.util.exeptions.BadRequestException;
import NextBill.ERP.util.messages.ErrorMessages;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;



@Service
@Transactional
@AllArgsConstructor
public class ClanService implements IClanService{
    
    @Autowired
    private final ClanRepository clanRepository;
    
    @Override
    public ClanResponseNoUsers create(ClanRequest request) {
        Clan clanForSaving =  this.ClanRequestToEntity(request);
        Clan savedClan = clanRepository.save(clanForSaving);
        ClanResponseNoUsers clanResponsing = entityToClanResponse(savedClan);
        return clanResponsing;
    }

    

    @Override
    public void delete(Integer id) {
        
        
        
    }

    @Override
    public Page<ClanResponseNoUsers> getAll(int page, int size) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ClanResponseNoUsers getById(Integer id) {
        ClanResponseNoUsers  clanResponseNoUsers = entityToClanResponse(this.intermediateFind(id));
        return clanResponseNoUsers;
    }

 


    @Override
    public ClanResponseNoUsers update(ClanRequest request, Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
    



    //METODOS INTERMEDIARIOS

    private Clan intermediateFind(Integer id) {
        Clan response = clanRepository.findById(id).orElseThrow(()-> new BadRequestException(ErrorMessages.idNotFound("Clan")));
        return response;
    }

    //MOVER A UTILS CREANDO CLASES DE MAPEOS
    public Clan ClanRequestToEntity(ClanRequest request){
        Clan entity = Clan.builder().
                        id(request.getId()).
                        name(request.getName()).
                        cohort(request.getCohort()).
                        urlImage(Boolean.valueOf(request.getUrlImage())? request.getUrlImage(): "urlPrueba").
                        points(request.getPoints())
                    .build();
        return entity;
    }

    public ClanResponseNoUsers entityToClanResponse(Clan savedClan) {
        return ClanResponseNoUsers.builder().
                    id(savedClan.getId()).
                    cohort(savedClan.getCohort()).
                    urlImage(savedClan.getUrlImage()).
                    points(savedClan.getPoints()).
                    name(savedClan.getName()).
                build();
    }
    
}
