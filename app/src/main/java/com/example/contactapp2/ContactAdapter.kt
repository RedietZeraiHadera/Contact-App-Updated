package com.example.contactapp2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactapp2.databinding.ContactListBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactAdapter(var contactList:List<ContactData>):RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
         return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
     val currentContact = contactList[position]
        val binding= holder.binding
        binding.tvname.text = currentContact.name
        binding.tvnumber.text = currentContact.phoneNumber
        binding.tvEmail.text = currentContact.emailAddress

        Picasso
            .get()
            .load(currentContact.image)
            .resize(80,80)
            .centerCrop()
            .transform(CropCircleTransformation())
//            .error(R.drawable.avatar)
            .into(binding.ivContact)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    class ContactViewHolder(var binding: ContactListBinding) : RecyclerView.ViewHolder(binding.root)

}