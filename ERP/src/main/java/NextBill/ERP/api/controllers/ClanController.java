package NextBill.ERP.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import NextBill.ERP.api.dtos.request.ClanRequest;
import NextBill.ERP.api.dtos.response.ClanResponseNoUsers;
import NextBill.ERP.infraestructure.abstract_service.IClanService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/clans")
@AllArgsConstructor
public class ClanController {

    @Autowired
    private final IClanService clanService;


   
    @GetMapping
    public ResponseEntity<Page<ClanResponseNoUsers>> getAll(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(this.clanService.getAll(page - 1, size));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClanResponseNoUsers> getMethodName(@PathVariable Integer id) {
        return ResponseEntity.ok(this.clanService.getById(id));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        this.clanService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ClanResponseNoUsers> update(
            @Validated @PathVariable Integer id,
            @RequestBody ClanRequest clan) {

        return ResponseEntity.ok(this.clanService.update(clan, id));
    }

    @PostMapping
    public ResponseEntity<ClanResponseNoUsers> insert(
            @Validated @RequestBody ClanRequest clan) {
        return ResponseEntity.ok(this.clanService.create(clan));
    }
    

}

