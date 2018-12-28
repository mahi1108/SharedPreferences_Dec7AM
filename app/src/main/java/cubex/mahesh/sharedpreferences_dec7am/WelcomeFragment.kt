package cubex.mahesh.sharedpreferences_dec7am

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.welcome.*
import kotlinx.android.synthetic.main.welcome.view.*

class WelcomeFragment : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.welcome,container,false)


        var spf: SharedPreferences = activity!!.getSharedPreferences(
            "and7amdec", Context.MODE_PRIVATE)
        var uname_spf = spf.getString("uname","no value")

        v.welcome_msg.text = "Welcome :   $uname_spf"

        return v
    }

}