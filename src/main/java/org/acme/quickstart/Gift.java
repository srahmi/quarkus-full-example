package org.acme.quickstart;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NamedQueries(
        @NamedQuery(name = "Gift.getAllGifts", query = "SELECT g from Gift g")
)
@Data
@NoArgsConstructor
public class Gift {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="giftSeq")
    private Long id;
    private String name;

}
