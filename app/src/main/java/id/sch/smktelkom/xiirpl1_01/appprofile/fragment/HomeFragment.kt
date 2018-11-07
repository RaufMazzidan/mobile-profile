package id.sch.smktelkom.xiirpl1_01.appprofile.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

import id.sch.smktelkom.xiirpl1_01.appprofile.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false)
        val step = arguments?.getInt("step")
        return when (step) {
            1 -> inflater.inflate(R.layout.fragment_home, container, false)
            else -> inflater.inflate(R.layout.fragment_bio, container, false)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_next_bio)?.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.next_action, null)
        )


    }
}
