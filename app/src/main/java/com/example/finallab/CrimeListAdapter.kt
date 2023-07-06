package com.example.finallab
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finallab.databinding.ListItemCrimeBinding

class CrimeListAdapter(private val crimes: List<Crime>, private val onClick: (Crime) -> Unit) : RecyclerView.Adapter<CrimeListAdapter.CrimeViewHolder>() {

    inner class CrimeViewHolder(private val binding: ListItemCrimeBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(crime: Crime) {
            binding.apply {
                crimeTitle.text = crime.title
                crimeDate.text = crime.date.toString()
                crimeSolved.isChecked = crime.isSolved
            }
            binding.root.setOnClickListener { onClick(crime) }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CrimeViewHolder {
        val binding = ListItemCrimeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CrimeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CrimeViewHolder, position: Int) {
        holder.bind(crimes[position])
    }

    override fun getItemCount(): Int = crimes.size
    fun submitList(it: Any) {

    }
}
