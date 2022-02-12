package com.example.noteapp.Database;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.noteapp.Models.Notes;

import java.util.List;

@Dao
public interface MainDAO {
    @Insert(onConflict = REPLACE)
    void insert(Notes notes);

    @Query("SELECT * FROM notes ORDER BY ID DESC")
    List<Notes> getAll();

    @Query("SELECT * FROM notes WHERE ID=:id")
    Notes get(int id);

    @Query("UPDATE notes SET title = :title, notes = :notes ,date=:date WHERE ID=:id")
    void update(int id,String title,String notes,String date);

    @Query("UPDATE notes SET ID=:idNew WHERE ID=:id")
     void update(int id, int idNew);

    @Delete
    void delete(Notes  notes);

    @Query("UPDATE notes SET pinned = :pin WHERE ID = :id")
    void pin(int id,boolean pin);
}
