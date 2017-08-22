package com.rviannaoliveira.vbottomsheet

import android.annotation.SuppressLint
import android.app.Dialog
import android.support.design.widget.BottomSheetDialogFragment
import android.view.View

/**
 * Criado por rodrigo on 22/08/17.
 */

class VBottomSheetDialogFragment : BottomSheetDialogFragment(){

    @SuppressLint("RestrictedApi")
    override fun setupDialog(dialog: Dialog, style: Int) {
        super.setupDialog(dialog,  style)
        val contentView = View.inflate(context, R.layout.fragment_bottomsheet, null)
        dialog.setContentView(contentView)
    }
}
