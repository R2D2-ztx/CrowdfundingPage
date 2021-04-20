package org.toocoldtocode.crowdfund.persistence.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="user")
public class User extends AbstractModel {

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private Double amount;
}