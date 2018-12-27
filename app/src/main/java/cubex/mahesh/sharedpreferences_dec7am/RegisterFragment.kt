package cubex.mahesh.sharedpreferences_dec7am

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.register.view.*

class RegisterFragment : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.register,container,false)

        v.submit.setOnClickListener {

            var spf:SharedPreferences = activity!!.getSharedPreferences(
                "and7amdec", Context.MODE_PRIVATE)
            var spe:SharedPreferences.Editor = spf.edit()
            spe.putString("uname",v.username.text.toString())
            spe.putString("pass",v.pass.text.toString())
            spe.putString("email",v.email.text.toString())
            spe.putLong("phoneno",v.mno.text.toString().toLong())
            spe.commit()

        }



        return v
    }

}