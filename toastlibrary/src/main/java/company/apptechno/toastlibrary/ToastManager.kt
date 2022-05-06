package company.apptechno.toastlibrary

import android.content.Context
import android.widget.Toast

class ToastManager {

    companion object{

        fun showToast(context:Context,text : String){

            Toast.makeText(context,text,Toast.LENGTH_SHORT).show()
        }
    }
}