package com.example.navigationdrawerdemo.ui.contact

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.navigationdrawerdemo.R
import com.example.navigationdrawerdemo.databinding.FragmentContactBinding
import com.example.navigationdrawerdemo.databinding.FragmentGalleryBinding
import com.example.navigationdrawerdemo.ui.gallery.GalleryViewModel

class ContactFragment : Fragment() {

    private var _binding: FragmentContactBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val contactViewModel =
            ViewModelProvider(this).get(ContactViewModel::class.java)

        _binding = FragmentContactBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val tvDirection: TextView = binding.tvContactDireccion
        val tvMail: TextView = binding.tvContactMail
        val tvPhone: TextView = binding.tvContactPhone
        tvDirection.text = "Calle Pino 14-D, Xochimilco, CDMX"
        tvMail.text = "francisco.garcia@ingenieria.unam.edu"
        tvPhone.text = "5569607716"

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}