package az.ingress.eCommerceSystem.controller;

import az.ingress.eCommerceSystem.dto.request.LibraffRequest;
import az.ingress.eCommerceSystem.dto.response.LibraffResponse;
import az.ingress.eCommerceSystem.entity.Libraff;
import az.ingress.eCommerceSystem.service.LibraffService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class LibraffController {
    private final LibraffService libraffService;

    @GetMapping
    public ResponseEntity<List<LibraffResponse>> findAll() {
        return new ResponseEntity<>(libraffService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LibraffResponse> findById(@PathVariable Long id){
        return new ResponseEntity<>(libraffService.findById(id), HttpStatus.OK);
    }
    @PostMapping("/libraff")
    public ResponseEntity<LibraffResponse> save(@RequestBody LibraffRequest libraffRequest){
        return new ResponseEntity<>(libraffService.save(libraffRequest), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Libraff> update(@PathVariable Long id, @RequestBody LibraffRequest libraffRequest){
        return new ResponseEntity<>(libraffService.update(id, libraffRequest), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        libraffService.delete(id);
    }
}
