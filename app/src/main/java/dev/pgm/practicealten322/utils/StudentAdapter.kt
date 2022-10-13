package dev.pgm.practicealten322.utils

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.pgm.practicealten322.StudentDomain

class StudentAdapter(val items: List<StudentDomain>) :
    RecyclerView.Adapter<StudentAdapter.ViewHolder?>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
     return  ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = """${items[position].studentReference}
            |${items[position].fullName}
            |   ${items[position].age}
            |   ${items[position].course}
            |   ${items[position].note}
            | 
            |""".trimMargin()
    }

    override fun getItemCount(): Int = items.size
    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}