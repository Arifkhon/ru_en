package com.orifkhon.ru_en;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {Slovari.class}, version = 1)
public abstract class SlovarDatabase extends RoomDatabase {
/**
 * DAO methods
 */
   public abstract SlovarDao slovarDao();
}
