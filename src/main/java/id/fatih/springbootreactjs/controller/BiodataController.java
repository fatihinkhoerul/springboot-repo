package id.fatih.springbootreactjs.controller;

import id.fatih.springbootreactjs.model.DefaultResponse;
import id.fatih.springbootreactjs.model.dto.BiodataDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biodata")
public class BiodataController {

    @GetMapping("/get")
    public DefaultResponse <BiodataDto> getBiodata (){
        BiodataDto biodataDto = new BiodataDto();
        biodataDto.setNama("alfath");
        biodataDto.setAlamat("bandung");
        return DefaultResponse.ok(biodataDto);
    }

    @GetMapping("/geterror")
    public DefaultResponse <BiodataDto> getBiodataError(){
        return DefaultResponse.error("data sudah ada di aplikasi");
    }
}
