package com.example.fragmentsdos

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.google.android.material.snackbar.Snackbar


class DialogFragment : DialogFragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        dialog!!.setTitle("Aviso")
        val view = inflater.inflate(R.layout.fragment_dialog, container, false)
        return view
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setMessage(R.string.Dialogo_confirmado_borrado)
            .setPositiveButton(R.string.Aceptar) {
                    dialog, id ->Toast.makeText(this.context, "Has borrado datos", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton(R.string.Aceptar){ dialog, id ->
                Toast.makeText(this.context, "askdñfalsdkjf",Toast.LENGTH_SHORT).show()
            }
            .create()
    }
}
