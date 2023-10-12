//package com.example.kotlinpractice
//
//import android.R
//import android.annotation.SuppressLint
//import android.content.Context
//import android.os.Bundle
//import android.text.Editable
//import android.text.TextWatcher
//import android.view.KeyEvent
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.view.inputmethod.EditorInfo
//import android.view.inputmethod.InputMethodManager
//import android.widget.TextView
//import androidx.fragment.app.Fragment
//import kotlinx.android.synthetic.main.fragment_keyboard.*
//
//
//class KeyboardFragment : Fragment(), TextView.OnEditorActionListener {
//
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.fragment_keyboard, container, false)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        hotspot_name_et.setOnEditorActionListener(this)
//        hotspot_name_et.addTextChangedListener(object : TextWatcher {
//            override fun afterTextChanged(s: Editable?) { }
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }
//            @SuppressLint("StringFormatMatches")
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//
//                connections_add_wifi_network_ssid_name_warning_text.text = getString(R.string.remote_text, s?.count().toString())
//            }
//        })
//        showSoftKeyboard(hotspot_name_et)
//    }
//
//    private fun showSoftKeyboard(view: View) {
//        if (view.requestFocus()) {
//            val inputMethodManager: InputMethodManager =
//                requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//            inputMethodManager.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
//        }
//    }
//
//    override fun onEditorAction(textView: TextView, actionId: Int, event: KeyEvent?): Boolean {
//        when (actionId) {
//            EditorInfo.IME_ACTION_NEXT, EditorInfo.IME_ACTION_DONE, EditorInfo.IME_ACTION_UNSPECIFIED -> {
///*                val ssId = textView.text.toString()
//
//                hideKeyboard(textView)
//                if (ssId != viewModel.hotspotName.value) {
//                    viewModel.validateNewHotspotName(textView.text.toString())
//                } else finishActivity(hotspot_name_et)*/
//            }
//        }
//        return true
//    }
//
//
//}
//
//
//
//
//
//
//
////class KeyboardFragment : BaseFragment(),TextView.OnEditorActionListener {
////    private lateinit var editText: EditText
////    lateinit var connections_add_wifi_network_ssid_name_warning_text :TextView
////
////    override fun onCreateView(
////        inflater: LayoutInflater, container: ViewGroup?,
////        savedInstanceState: Bundle?
////    ): View? {
////        return inflater.inflate(R.layout.fragment_keyboard, container, false)
////    }
////
////    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
////        super.onViewCreated(view, savedInstanceState)
////
////        showSoftKeyboard(editText)
////
////        editText.setOnEditorActionListener(this)
////        editText.addTextChangedListener(object : TextWatcher {
////            override fun afterTextChanged(s: Editable?) { }
////            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }
////            @SuppressLint("StringFormatMatches")
////            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
////
////                connections_add_wifi_network_ssid_name_warning_text.text =
////                    getString(
////                        remote_text,
////                        s?.count().toString())
////            }
////        })
////    }
////
////    private fun showSoftKeyboard(view: View) {
////        if (view.requestFocus()) {
////            val inputMethodManager: InputMethodManager =
////                requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
////            inputMethodManager.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
////        }
////    }
////
////    override fun onEditorAction(textView: TextView, actionId: Int, event: KeyEvent?): Boolean {
////        when (actionId) {
////            EditorInfo.IME_ACTION_NEXT, EditorInfo.IME_ACTION_DONE, EditorInfo.IME_ACTION_UNSPECIFIED -> {
//////                val ssId = textView.text.toString()
////
//////                hideKeyboard(textView)
//////                if (ssId != viewModel.hotspotName.value) {
//////                    viewModel.validateNewHotspotName(textView.text.toString())
//////                } else finishActivity(hotspot_name_et)
////            }
////        }
////        return true
////    }
////
////
////}