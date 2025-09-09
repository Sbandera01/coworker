package edu.unimagdalena.coworker.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "member_profiles")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class MemberProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 20)
    private String phone;

    @Column(length = 120)
    private String company;

    @OneToOne(optional = false)
    @JoinColumn(name = "member_id", nullable = false, unique = true)
    private Member member;
}


