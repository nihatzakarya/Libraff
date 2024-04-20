package az.ingress.eCommerceSystem.service;

import az.ingress.eCommerceSystem.dto.request.LibraffRequest;
import az.ingress.eCommerceSystem.dto.response.LibraffResponse;
import az.ingress.eCommerceSystem.entity.Libraff;
import az.ingress.eCommerceSystem.repository.LibraffRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LibraffService {

    private final ModelMapper modelMapper;

    private final LibraffRepository libraffRepository;
    public LibraffResponse save(LibraffRequest libraffRequest) {
        Libraff libraff = modelMapper.map(libraffRequest, Libraff.class);
        return modelMapper.map(libraffRepository.save(libraff), LibraffResponse.class);
    }

    public Libraff update(Long id, LibraffRequest libraffRequest) {
        libraffRepository.findById(id).orElseThrow(() -> new RuntimeException ());
        Libraff responseLibraff = modelMapper.map(libraffRequest, Libraff.class);
        responseLibraff.setId(id);
        return modelMapper.map(libraffRepository.save(responseLibraff), Libraff.class);
    }
    public LibraffResponse findById(Long id) {
        Libraff libraff = libraffRepository.findById(id).orElseThrow(() -> new RuntimeException ());
        return modelMapper.map(libraff, LibraffResponse.class);
    }

    public List<LibraffResponse> findAll() {
        return libraffRepository
                .findAll()
                .stream()
                .map(hotel -> modelMapper.map(hotel, LibraffResponse.class))
                .collect(Collectors.toList());
    }

    public void delete(Long id) {
        Libraff libraff = libraffRepository.findById(id).orElseThrow(() -> new RuntimeException ());
        libraffRepository.delete(libraff);
    }
}
