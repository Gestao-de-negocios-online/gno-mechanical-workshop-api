package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.infrastructure.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "addresses")
public class AddressEntity extends BaseEntity {

    @Column(name = "street", nullable = false, length = 100)
    private String street;

    @Column(name = "number", nullable = false)
    private Integer number;

    @Column(name = "complement", length = 100)
    private String complement;

    @Column(name = "neighborhood", nullable = false, length = 100)
    private String neighborhood;

    @Column(name = "city", nullable = false, length = 100)
    private String city;

    @Size(min = 2, max = 20, message = "O estado deve ter entre 2 e 20 caracteres")
    @Column(name = "state", nullable = false, length = 20)
    private String state;
}
