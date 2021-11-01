package com.fpt.myweb.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "New")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class New extends BaseEntity{

    @Column(name = "title", length = 100000)
    private String title;

    @Column(name = "decription", length = 100000)
    private String decription;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "isDelete", columnDefinition = "boolean default false")
    private boolean isDelete;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user ;

}
