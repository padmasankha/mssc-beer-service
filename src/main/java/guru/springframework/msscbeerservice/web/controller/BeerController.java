package guru.springframework.msscbeerservice.web.controller;

import com.sun.net.httpserver.Headers;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import guru.springframework.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {


    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){

//        Todo: Impl
        return new ResponseEntity<>(BeerDto.builder()
                .beerStyle(BeerStyleEnum.ALE)
                .upc("12L")
                .price(new BigDecimal(12.4))
                .build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveBeer(@RequestBody BeerDto beerDto){
        //        Todo: Impl
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){
        //        Todo: Impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
