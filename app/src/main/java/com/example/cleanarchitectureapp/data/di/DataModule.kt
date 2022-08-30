package com.example.cleanarchitectureapp.data.di

import android.content.Context
import androidx.room.Room
import com.example.cleanarchitectureapp.data.room.NoteDao
import com.example.cleanarchitectureapp.data.room.NoteDatabase
import com.example.cleanarchitectureapp.domain.repository.NoteRepository
import com.example.cleanarchitectureapp.data.repository.NoteRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Singleton
    @Provides
    fun provideNoteDatabase(@ApplicationContext application: Context) =
        Room.databaseBuilder(
            application,
            NoteDatabase::class.java,
            "note_database"
        )
            .allowMainThreadQueries()
            .build()

    @Singleton
    @Provides
    fun provideNoteDao(noteDatabase: NoteDatabase) = noteDatabase.noteDao()

    @Provides
    fun provideNoteRepository(noteDao: NoteDao): NoteRepository {
       return NoteRepositoryImpl(noteDao)
    }

}