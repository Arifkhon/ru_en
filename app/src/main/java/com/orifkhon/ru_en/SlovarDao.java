package com.orifkhon.ru_en;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface SlovarDao {


    @Insert
    public void Dokhilkuni(Slovari slovari);
    @Query("SELECT rus FROM 'Slovari'")
    public List<Slovari> getRus();
    @Query("SELECT eng FROM 'Slovari'")
    public List<Slovari> getEng();

}
