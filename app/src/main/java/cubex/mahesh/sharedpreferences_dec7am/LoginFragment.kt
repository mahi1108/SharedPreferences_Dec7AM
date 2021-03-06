package cubex.mahesh.sharedpreferences_dec7am

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.login.view.*

class LoginFragment : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.login,container,false)

       v.register.setOnClickListener {

        var fManager = activity!!.supportFragmentManager
        var tx = fManager.beginTransaction()
        tx.replace(R.id.frag1,RegisterFragment())
        tx.commit()

       }

        v.login.setOnClickListener {

            var spf: SharedPreferences = activity!!.getSharedPreferences(
                "and7amdec", Context.MODE_PRIVATE)
            var uname_spf = spf.getString("uname","no value")
            var pass_spf = spf.getString("pass","no value")


            if(v.username.text.toString().equals(uname_spf) &&
                        v.pass.text.toString().equals(pass_spf)){

                var fManager = activity!!.supportFragmentManager
                var tx = fManager.beginTransaction()
                tx.replace(R.id.frag1,WelcomeFragment())
                tx.commit()


            }else{
                Toast.makeText(activity,
                    "Please give valid credentials...",
                    Toast.LENGTH_LONG).show()
            }


        }



        return v
    }

}