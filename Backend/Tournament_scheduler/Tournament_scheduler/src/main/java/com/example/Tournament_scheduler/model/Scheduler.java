package com.example.Tournament_scheduler.model;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
@CrossOrigin("http://localhost:4200")
@Entity
@Table(name="Scheduler_input")
public class Scheduler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Team_1;
    private String Team_2;
    private String Team_3;
    private String Team_4;
    private String Team_5;
    private String Team_6;
    private Integer Number;
    private Date date;
    private String C1;
    private String C2;
    private String C3;
    private String C4;
    private String C5;
    private String C6;
    private String C7;
    private String C8;
    private String C9;
    private String C10;
    private String C11;
    private String C12;
    private String C13;
    private String C14;
    private String C15;

    public Scheduler(Integer id, String team_1, String team_2, String team_3, String team_4, String team_5, String team_6, Integer number, Date date, String c1, String c2, String c3, String c4, String c5, String c6, String c7, String c8, String c9, String c10, String c11, String c12, String c13, String c14, String c15) {
        this.id = id;
        Team_1 = team_1;
        Team_2 = team_2;
        Team_3 = team_3;
        Team_4 = team_4;
        Team_5 = team_5;
        Team_6 = team_6;
        Number = number;
        this.date = date;
        C1 = c1;
        C2 = c2;
        C3 = c3;
        C4 = c4;
        C5 = c5;
        C6 = c6;
        C7 = c7;
        C8 = c8;
        C9 = c9;
        C10 = c10;
        C11 = c11;
        C12 = c12;
        C13 = c13;
        C14 = c14;
        C15 = c15;
    }



    public Scheduler() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeam_1() {
        return Team_1;
    }

    public void setTeam_1(String team_1) {
        Team_1 = team_1;
    }

    public String getTeam_2() {
        return Team_2;
    }

    public void setTeam_2(String team_2) {
        Team_2 = team_2;
    }

    public String getTeam_3() {
        return Team_3;
    }

    public void setTeam_3(String team_3) {
        Team_3 = team_3;
    }

    public String getTeam_4() {
        return Team_4;
    }

    public void setTeam_4(String team_4) {
        Team_4 = team_4;
    }

    public String getTeam_5() {
        return Team_5;
    }

    public void setTeam_5(String team_5) {
        Team_5 = team_5;
    }

    public String getTeam_6() {
        return Team_6;
    }

    public void setTeam_6(String team_6) {
        Team_6 = team_6;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getC1() {
        return C1;
    }

    public void setC1(String c1) {
        C1 = c1;
    }

    public String getC2() {
        return C2;
    }

    public void setC2(String c2) {
        C2 = c2;
    }

    public String getC3() {
        return C3;
    }

    public void setC3(String c3) {
        C3 = c3;
    }

    public String getC4() {
        return C4;
    }

    public void setC4(String c4) {
        C4 = c4;
    }

    public String getC5() {
        return C5;
    }

    public void setC5(String c5) {
        C5 = c5;
    }

    public String getC6() {
        return C6;
    }

    public void setC6(String c6) {
        C6 = c6;
    }

    public String getC7() {
        return C7;
    }

    public void setC7(String c7) {
        C7 = c7;
    }

    public String getC8() {
        return C8;
    }

    public void setC8(String c8) {
        C8 = c8;
    }

    public String getC9() {
        return C9;
    }

    public void setC9(String c9) {
        C9 = c9;
    }

    public String getC10() {
        return C10;
    }

    public void setC10(String c10) {
        C10 = c10;
    }

    public String getC11() {
        return C11;
    }

    public void setC11(String c11) {
        C11 = c11;
    }

    public String getC12() {
        return C12;
    }

    public void setC12(String c12) {
        C12 = c12;
    }

    public String getC13() {
        return C13;
    }

    public void setC13(String c13) {
        C13 = c13;
    }

    public String getC14() {
        return C14;
    }

    public void setC14(String c14) {
        C14 = c14;
    }

    public String getC15() {
        return C15;
    }

    public void setC15(String c15) {
        C15 = c15;
    }
}
