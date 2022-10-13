package dev.pgm.practicealten322.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import dev.pgm.practicealten322.StudentDomain

class BaseViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(container)

class BaseItemCallback<student : StudentDomain> : DiffUtil.ItemCallback<student>() {
    override fun areItemsTheSame(oldItem: student, newItem: student) =
        oldItem.toString() == newItem.toString()

    override fun areContentsTheSame(oldItem: student, newItem: student) = oldItem == newItem
}


abstract class StudentAdapter(
    @IdRes val layoutId: Int,
    inline val bind: (item: StudentDomain, holder: BaseViewHolder, itemCount: Int) -> Unit,
) : ListAdapter<StudentDomain, BaseViewHolder>(BaseItemCallback<StudentDomain>()) {
    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        bind(getItem(position), holder, itemCount)
    }

    override fun getItemViewType(position: Int) = layoutId
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val root = LayoutInflater.from(parent.context).inflate(
            viewType, parent, false
        )
        return BaseViewHolder(root as ViewGroup)
    }

    override fun getItemCount() = currentList.size

}