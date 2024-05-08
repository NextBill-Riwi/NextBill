package NextBill.ERP.infraestructure.abstract_service;



import NextBill.ERP.api.dtos.request.ClanRequest;

import NextBill.ERP.api.dtos.response.ClanResponseNoUsers;


public interface IClanService 
    extends CrudAbstractService<ClanRequest,ClanResponseNoUsers,Integer> {
}