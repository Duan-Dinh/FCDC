package com.fpt.myweb.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Role extends BaseEntity{

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "role") // chỗ ni tên gióng với tên chỗ khởi tạo role
    private List<User> users = new ArrayList<>();



}
