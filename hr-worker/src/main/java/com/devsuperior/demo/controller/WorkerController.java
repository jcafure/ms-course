package com.devsuperior.demo.controller;

import com.devsuperior.demo.entity.Worker;
import com.devsuperior.demo.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

    @Autowired
    private final WorkerRepository workerRepository;

    public WorkerController(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> listWorker = workerRepository.findAll();
        return ResponseEntity.ok(listWorker);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        Worker obj = workerRepository.findById(id).get();
        return ResponseEntity.ok(obj);
    }
}
