package com.orifkhon.ru_en;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Slovari {
@PrimaryKey
    @NonNull
    public String rus;
@NonNull
    public String eng;

    public String getRus() {
        return rus;
    }

    public void setRus(String text) {
        this.rus = text;
    }
public String getEng() {
        return rus;
    }

    public void setEng(String eng) {
        this.rus = eng;
    }
}
