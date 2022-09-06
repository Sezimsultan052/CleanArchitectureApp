package com.example.cleanarchitectureapp.presentation.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanarchitectureapp.databinding.NoteItemBinding
import com.example.domain.domain.model.Note


class NoteAdapter(
    private val data: ArrayList<Note>,
    private val onItemClick: OnItemClick
) : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    fun getList(): List<Note?>? {
        return data
    }

    fun removeItem(position: Int){

        data.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, data.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder(NoteItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bind(data[position])

        holder.itemView.setOnLongClickListener{
            onItemClick.openAlertDialog(position)
            true
        }
    }

    override fun getItemCount(): Int {
       return data.size
    }


    inner class NoteViewHolder(val binding : NoteItemBinding)
        : RecyclerView.ViewHolder(binding.root){
            fun bind (note: Note){
                binding.tvItemNoteTitle.text = note.title
                binding.tvItemNoteText.text = note.text
            }
    }


}