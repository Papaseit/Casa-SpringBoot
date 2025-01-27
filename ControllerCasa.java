package org.example.pruebaspringboot.Casa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/casa")
public class ControllerCasa {

    @Autowired
    private Casa casa;
    @GetMapping("casas")
    public ResponseEntity<Casa> obtenerCasa() {
        System.out.println(casa.toString());
        return ResponseEntity.ok(casa);
    }
}
