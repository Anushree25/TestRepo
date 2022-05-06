package company.apptechno.toastapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import company.apptechno.toastlibrary.ToastManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastManager.showToast(this,"Hello")
    }
}