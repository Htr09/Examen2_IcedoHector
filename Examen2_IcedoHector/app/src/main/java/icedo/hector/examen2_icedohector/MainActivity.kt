package icedo.hector.examen2_icedohector

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var alumnos = ArrayList<Alumno>()
    var adapter: AlumnosAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        listAlumnos()
    }
    fun listAlumnos(){
        alumnos.add()
    }

    class AlumnosAdapter : BaseAdapter{
        var context: Context? =null
        var alumnos = ArrayList<Alumno>()

        constructor(context: Context, alumnos: ArrayList<Alumno>){
            this.context=context
            this.alumnos=alumnos
        }

        override fun getCount(): Int {
            return alumnos.size
        }

        override fun getItem(position: Int): Any {
            return alumnos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {




            return vista
        }
    }


}


