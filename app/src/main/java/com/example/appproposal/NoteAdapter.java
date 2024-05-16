package com.example.appproposal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteViewHolder> {

    private Context context;
    private List<NoteModel> notesList;

    public NoteAdapter(Context context, List<NoteModel> notesList) {
        this.context = context;
        this.notesList = notesList;
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.note_item, parent, false);
        return new NoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        NoteModel note = notesList.get(position);
        holder.bind(note);
    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }

    class NoteViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView verseTextView, opinionTextView, applicationTextView, prayerTextView;

        NoteViewHolder(@NonNull View itemView) {
            super(itemView);
            verseTextView = itemView.findViewById(R.id.verseTextView);
            opinionTextView = itemView.findViewById(R.id.opinionTextView);
            applicationTextView = itemView.findViewById(R.id.applicationTextView);
            prayerTextView = itemView.findViewById(R.id.prayerTextView);
            itemView.setOnClickListener(this);
        }

        void bind(NoteModel note) {
            verseTextView.setText(note.getVerse());
            opinionTextView.setText(note.getOpinion());
            applicationTextView.setText(note.getApplication());
            prayerTextView.setText(note.getPrayer());
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if (position != RecyclerView.NO_POSITION) {
                NoteModel note = notesList.get(position);
                Intent intent = new Intent(context, EditNoteActivity.class);
                intent.putExtra("noteId", note.getId());
                intent.putExtra("verse", note.getVerse());
                intent.putExtra("opinion", note.getOpinion());
                intent.putExtra("application", note.getApplication());
                intent.putExtra("prayer", note.getPrayer());
                context.startActivity(intent);
            }
        }
    }
}
