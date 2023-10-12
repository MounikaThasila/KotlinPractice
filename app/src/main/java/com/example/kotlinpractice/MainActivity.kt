package com.example.kotlinpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        int[] nums = { 8, 7, 2, 5, 3, 1 };
//        int target = 10;
//
//        findPair(nums, target);

//        val textView =
//            findViewById<TextView>(R.id.connections_add_wifi_network_ssid_name_warning_text)
//        val editText = findViewById<EditText>(R.id.hotspot_name_et)
//
//        editText.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
//                val length: Int = editText.length()
//                val convert = length.toString()
//                textView.setText(convert)
//            }
//
//            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
//            override fun afterTextChanged(s: Editable) {}
//        })
    }

    fun findPair(nums: IntArray, target: Int) {
        // consider each element except the last
        for (i in 0 until nums.size - 1) {
            // start from the i'th element until the last element
            for (j in i + 1 until nums.size) {
                // if the desired sum is found, print it
                if (nums[i] + nums[j] == target) {
                    System.out.printf("Pair found (%d, %d)", nums[i], nums[j])
                    return
                }
            }
        }

        // we reach here if the pair is not found
        println("Pair not found")
    }




//        private fun showSoftKeyboard(view: View) {
//        if (view.requestFocus()) {
////            val inputMethodManager: InputMethodManager =
////                requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//////                requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
////            inputMethodManager.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
//
//            val inputMethodManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
//            inputMethodManager.toggleSoftInputFromWindow(
//                constraint_layout.applicationWindowToken,
//                InputMethodManager.SHOW_FORCED, 0
//            )
//        }
//    }
}




//
//        hotspot_name_et.setOnEditorActionListener(this)
//        hotspot_name_et.addTextChangedListener(object : TextWatcher {
//            override fun afterTextChanged(s: Editable?) {}
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
//
//            @SuppressLint("StringFormatMatches")
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//
//                connections_add_wifi_network_ssid_name_warning_text.text =
//                    getString(R.string.remote_text, s?.count().toString())
//            }
//        })
////        showSoftKeyboard(hotspot_name_et)
//    }
//

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
//}




//        lateinit var remoteEditText: EditText
//        lateinit var remoteText: TextView
//
//
//
//        remoteEditText.addTextChangedListener(object : TextWatcher {
//
//            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
//                val length: Int = remoteEditText.length()
//                val convert = length.toString()
//                remoteText.text = convert
//            }
//
//            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
//            override fun afterTextChanged(s: Editable) {}
//        })


        /*Explicit Intent*/
//        val tvId: TextView = findViewById(R.id.tvId)
//        val tvName: TextView = findViewById(R.id.tvName)
//
//        val bundle = intent.extras
//        if (bundle != null) {
//            tvId.text = "id = ${getString(R.id.tvId)}"
//            tvName.text = "Name = ${getString(R.id.tvName)}"
//        }

        /*How to open dialer in Android through Intent?*/
//        var dial_number = findViewById<Button>(R.id.Dial_number)
//        dial_number.setOnClickListener {
//            val intent = Intent(Intent.ACTION_DIAL)
//            intent.data = Uri.parse("tel:0123456789")  //The 'tel:' prefix is required
//            startActivity(intent)
//        }

/*How to open Camera through Intent and display captured image in kotlin*/

//        var pic_id = 123
//
//        var camera_open_id : Button = findViewById(R.id.camera_button)
//        var click_image_id : ImageView = findViewById(R.id.click_image)
//
//        camera_open_id.setOnClickListener(){
//            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//            startActivityForResult(intent,pic_id)
//
//        }
//        fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//            super.onActivityResult(requestCode, resultCode, data)
//            if (requestCode == pic_id) {
//                val photo: Bitmap = data?.extras?.get("data") as Bitmap
//                click_image_id.setImageBitmap(photo)
//            }
//        }


        //start reading here
        //start reading here
//        val intent = intent
//        if (intent.data != null) {
//            Log.d("intent received", intent.data.toString())
//            var phoneNumber = intent.data.toString() //contains tel:phone_no
//            phoneNumber = phoneNumber.substring(4)
//            Log.d("intent received", "Received phone number : $phoneNumber")
//            /// do what you like here
//        } else {
//            Log.d("intent received", "null intent received")
//        }

/*Implicit Intent*/

//        setupPermissions()

        // Calling using intent
//        var btn_call = findViewById<Button>(R.id.btn_call)
//        var et_number = findViewById<EditText>(R.id.et_number)
//        btn_call.setOnClickListener{
//            val intent = Intent(Intent.ACTION_DIAL)
//            intent.data = Uri.parse("tel:" + et_number.getText())
//            startActivity(intent)
//        }
//
//        // Call log
//        var btn_call_log = findViewById<Button>(R.id.btn_call_log)
//        btn_call_log.setOnClickListener(View.OnClickListener {
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.type = CallLog.Calls.CONTENT_TYPE
//            startActivity(intent)
//        })
//
//        //Contact
//        var btn_contact = findViewById<Button>(R.id.btn_contact)
//        btn_contact.setOnClickListener(View.OnClickListener {
//            val intent = Intent(Intent.ACTION_PICK)
//            intent.type = ContactsContract.Contacts.CONTENT_TYPE
//            startActivity(intent)
//        })
//
//        // browser
//        var btn_browser = findViewById<Button>(R.id.btn_browser)
//        btn_browser.setOnClickListener(View.OnClickListener {
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse("https://tutorial.eyehunts.com/")
//            startActivity(intent)
//        })
//
//        // Gallery
//        var btn_gallery = findViewById<Button>(R.id.btn_gallery)
//        btn_gallery.setOnClickListener(View.OnClickListener {
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse("content://media/external/images/media/")
//            startActivity(intent)
//        })
//
//        // camera
//        var btn_camera = findViewById<Button>(R.id.btn_camera)
//        btn_camera.setOnClickListener(View.OnClickListener {
//            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//            startActivity(intent)
//        })
//
//        // alarm
//        var btn_alarm = findViewById<Button>(R.id.btn_alarm)
//        btn_alarm.setOnClickListener(View.OnClickListener {
//            val intent = Intent(AlarmClock.ACTION_SHOW_ALARMS)
//            startActivity(intent)
//        })
//    }
//
//    private fun setupPermissions() {
//        val permission = ContextCompat.checkSelfPermission(this,
//            Manifest.permission.CALL_PHONE)
//
//        if (permission == PackageManager.PERMISSION_GRANTED) {
//            Log.i("noone", "Permission to Call has denied")
//            makeRequest()
//        }
//    }
//
//    private fun makeRequest() {
//        ActivityCompat.requestPermissions(this,
//            arrayOf(Manifest.permission.CALL_PHONE), CONTEXT_INCLUDE_CODE)
//    }


