package com.fpt.myweb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "birthOfdate")
    private Date birthOfdate;

    @Column(name = "dateStart")
    private Date dateStart;

    // Role
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role; // chỗ ni trung với mapby bên User
    // Dia chi (village)
    @ManyToOne
    @JoinColumn(name = "village_id")
    private Village village;
    // new
    @OneToMany(mappedBy = "user")
    private List<New> news = new ArrayList<>();
    // daily_report
    @OneToMany(mappedBy = "user")
    private List<Daily_Report> daily_reports = new ArrayList<>();
    // doctor
    @OneToMany(mappedBy = "user")
    private List<Medical_Doctor> medical_doctors = new ArrayList<>();
    //staff
    @OneToMany(mappedBy = "user")
    private List<Medical_Staff> medical_staffs = new ArrayList<>();


}
