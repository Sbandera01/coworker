package edu.unimagdalena.coworker.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "spaces")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Space {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 120)
    private String name;

    @Column(length = 200)
    private String address;

    @OneToMany(mappedBy = "space")
    private List<Room> rooms;

    public void addRoom(Room room) {
        rooms.add(room);
        room.setSpace(this);
    }
}


