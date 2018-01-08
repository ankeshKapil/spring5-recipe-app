package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class Notes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @OneToOne
    private  Recipe recipe;
    @Lob
    private String recipeNotes;

}
