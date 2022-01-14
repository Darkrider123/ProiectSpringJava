package com.aritoncosmin.ProiectSpringJava.model;

import javax.persistence.*;

@Entity
@Table(name = "ServiceAuto")
public class ServiceAuto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer serviceAutoId;

    @Column(name = "name")
    private String name;

    @Column(name = "nr_of_workers")
    private Integer nrOfWorkers;

    @OneToOne
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

    public Integer getServiceAutoId() {
        return serviceAutoId;
    }

    public void setServiceAutoId(Integer serviceAutoId) {
        this.serviceAutoId = serviceAutoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNrOfWorkers() {
        return nrOfWorkers;
    }

    public void setNrOfWorkers(Integer nrOfWorkers) {
        this.nrOfWorkers = nrOfWorkers;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
