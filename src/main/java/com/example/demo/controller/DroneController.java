package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dao.DroneRepository;
import com.example.demo.model.Drone;

import jakarta.validation.Valid;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.springframework.validation.BindingResult;


@RestController
@RequestMapping("/drone")
public class DroneController {

    @Autowired
    DroneRepository droneRepository;

    @PostMapping("/register")

    // public ResponseEntity<String> createMember(@Valid @RequestBody Drone drone) throws SQLIntegrityConstraintViolationException {
    // public ResponseEntity<String> createMember(@RequestBody @Valid @ModelAttribute("drone") ValidatedDrone drone, BindingResult result) throws SQLIntegrityConstraintViolationException {

    public ResponseEntity<String> createMember(@RequestBody @Valid Drone drone, BindingResult result) throws SQLIntegrityConstraintViolationException {
        System.err.println("hehehe " + drone);
        System.err.println("tyty " + drone.getClass());
        System.err.println("get prev d:::" + drone.getPrevDir());
        System.err.println("res has errors:::" + result.hasErrors());
        // droneRepository.save(drone);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/test")
    public ResponseEntity<String> te(@RequestBody Drone drone) throws SQLIntegrityConstraintViolationException {

        System.out.println("babaski");
        System.out.println(drone.toString());

        return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).build();
    }

    @PostMapping("/move")
    public ResponseEntity<String> move(@RequestBody Drone drone) throws SQLIntegrityConstraintViolationException {
        int id = drone.getId();
        Drone droneToMove = droneRepository.findById(id);

        // if ( != null) {
        //     return new ResponseEntity<String>("No drone presented " + drone.getId(), HttpStatus.BAD_REQUEST);
        // }

        System.out.println("babaski");
        System.out.println(drone.toString());

        return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).build();
    }

    @GetMapping("/test")
    public String test(){
        String testing = "testing drones";
        return testing;
    }

    @GetMapping("/all")
    public List<Drone> getAllDrones() {
        return droneRepository.findAll();
    }

    // @GetMapping(value = "/{id}")
    // public ResponseEntity<?> getMember(@PathVariable("id") Integer id){
    //     FamilyMember familyMember = familyRepository.getNameById(id);
    //     if(familyMember == null) {
    //         return new ResponseEntity<>("No member found with this " + id, HttpStatus.NOT_FOUND);
    //     }
    //     return new ResponseEntity<>(familyMember, HttpStatus.OK);
    // }

    // @PostMapping("/add")
    // public ResponseEntity<String> createMember(@RequestBody FamilyMember familyMember) throws SQLIntegrityConstraintViolationException {
    //     if(familyRepository.getNameById(familyMember.getId())!= null){
    //         return new ResponseEntity<String>("Duplicate Entry" + familyMember.getId(), HttpStatus.IM_USED);
    //     }
    //     familyRepository.saveMember(familyMember);
    //     return ResponseEntity.status(HttpStatus.CREATED).build();
    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<?> updateMember(@RequestBody FamilyMember member){
    //     if(familyRepository.getNameById(member.getId())  == null) {
    //         return new ResponseEntity<String>("Unable to update as Family Member id   " + member.getId() + " not founded.", HttpStatus.NOT_FOUND);
    //     }

    //     familyRepository.updateMember(member);
    //     return new ResponseEntity<FamilyMember>(member, HttpStatus.OK);
    // }

    // @DeleteMapping(value = "/{id}")
    // public ResponseEntity<?> deleteUser(@PathVariable("id") Integer id) {
    //   FamilyMember familyMember = familyRepository.getNameById(id);
    //   if(familyMember == null) {
    //       new ResponseEntity<String>("Unable to delete as Member id  " + id + " not found.", HttpStatus.NOT_FOUND);
    //   }
    //   familyRepository.deleteMember(id);
    //   return new ResponseEntity<FamilyMember>(HttpStatus.NO_CONTENT);
    // }
}
