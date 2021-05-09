package id.fatih.springbootreactjs.controller;

import id.fatih.springbootreactjs.model.DefaultResponse;
import id.fatih.springbootreactjs.model.dto.BiodataDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/biodata")
public class BiodataController {

    @GetMapping("/get")
    public DefaultResponse <BiodataDto> getBiodata (){
        BiodataDto biodataDto = new BiodataDto();
        biodataDto.setNama("alfath");
        biodataDto.setAlamat("kebumen");
        return DefaultResponse.ok(biodataDto);
    }

    @GetMapping("/geterror")
    public DefaultResponse <BiodataDto> getBiodataError(){
        return DefaultResponse.error("data hilang");
    }
    @PostMapping("/save")
    public DefaultResponse <BiodataDto> saveBiodata (@RequestBody BiodataDto biodataDto){
        BiodataDto bio = new BiodataDto();
        bio.setNama("alfath");
        bio.setAlamat("kebumen");
        return DefaultResponse.ok(biodataDto);
    }
}
