package com.example.data.data.di

import android.content.Context
import androidx.room.Room
import com.example.data.data.room.NoteDao
import com.example.data.data.room.NoteDatabase
import com.example.data.data.repository.NoteRepositoryImpl
import com.example.domain.domain.repository.NoteRepository
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