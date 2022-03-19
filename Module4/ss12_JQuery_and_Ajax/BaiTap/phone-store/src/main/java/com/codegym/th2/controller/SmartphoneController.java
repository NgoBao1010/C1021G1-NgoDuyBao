package com.codegym.th2.controller;

import com.codegym.th2.model.Smartphone;
import com.codegym.th2.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/smartphones")
public class SmartphoneController {
    @Autowired
    private ISmartphoneService smartphoneService;

    @PostMapping
    public ResponseEntity<List<Smartphone>> createSmartphone(@RequestBody Smartphone smartphone) {
        smartphoneService.save(smartphone);
        return new ResponseEntity<>((List<Smartphone>) smartphoneService.findAll(), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<Smartphone>> allPhones() {
        return new ResponseEntity<>(smartphoneService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ModelAndView getAllSmartphonePage() {
        ModelAndView modelAndView = new ModelAndView("/phones/list");
        modelAndView.addObject("smartphones", smartphoneService.findAll());
        return modelAndView;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Smartphone>> deleteSmartphone(@PathVariable Long id) {
        Optional<Smartphone> smartphoneOptional = smartphoneService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        smartphoneService.remove(id);
        return new ResponseEntity<>((List<Smartphone>) smartphoneService.findAll(),HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Smartphone> editSmartphone(@PathVariable Long id,@RequestBody Smartphone smartphone){
        Optional<Smartphone> smartphoneOptional = smartphoneService.findById(id);
        if (!smartphoneOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        smartphoneOptional.get().setProducer(smartphone.getProducer());
        smartphoneOptional.get().setModel(smartphone.getModel());
        smartphoneOptional.get().setPrice(smartphone.getPrice());
        smartphoneService.save(smartphoneOptional.get());
        return new ResponseEntity<>(smartphoneOptional.get(),HttpStatus.OK);
    }
}
