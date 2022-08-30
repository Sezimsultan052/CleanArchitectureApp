package com.example.cleanarchitectureapp.presentation.ui.main

//mainActivity


//    private val viewModel by lazy {
//        ViewModelProvider(this)[MainViewModel::class.java]
//    }
//    private lateinit var binding: ActivityMainBinding
//    private var notes = arrayListOf<Note>()
//    private lateinit var adapter: NoteAdapter
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        viewModel.getAllNotes()
//
//        adapter = NoteAdapter(this)
//        adapter.setData(notes)
//        binding.rvNote.adapter = adapter
////
////        var i = 0
////        binding.btnAdd.setOnClickListener {
////            i++
////            viewModel.addNote(Note(title = "$i", text = "$i"))
////        }
////
////        binding.btnDelete.setOnClickListener {
////            viewModel.deleteLastNote(notes[notes.size -1])
////        }
//        binding.btnAdd.setOnClickListener{
//            startActivity(Intent(this, FormActivity::class.java))
//        }
//
//        viewModel.notesState.subscribe { state ->
//            when (state) {
//                is UIState.Error -> {
//                    Toast.makeText(this@MainActivity, state.error, Toast.LENGTH_SHORT).show()
//                    binding.progressBar.isVisible = false
//                }
//                is UIState.Loading -> {
//                    binding.progressBar.isVisible = true
//                }
//                is UIState.Success -> {
//                    binding.progressBar.isVisible = false
//                    notes = state.data as ArrayList<Note>
//                   // binding.text.text = notes.toString()
//                }
//            }
//        }
//
//        viewModel.noteState.subscribe { state ->
//            when (state) {
//                is UIState.Error -> {
//                    Toast.makeText(this@MainActivity, state.error, Toast.LENGTH_SHORT).show()
//                    binding.progressBar.isVisible = false
//                }
//                is UIState.Loading -> {
//                    binding.progressBar.isVisible = true
//                }
//                is UIState.Success -> {
//                    binding.progressBar.isVisible = false
//                    viewModel.getAllNotes()
//                }
//            }
//        }
//
//
//   }



//    override fun openAlertDialog(pos: Int) {
//
//            val dialogBuilder = AlertDialog.Builder(this)
//            dialogBuilder.setMessage("Do you want to delete this item ?")
//
//                .setCancelable(false)
//                .setPositiveButton("YES") { dialog, id ->
//                    adapter.removeItem(pos)
//                    viewModel.deleteLastNote(notes[pos])
//                }
//                .setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, id ->
//                    dialog.cancel()
//                })
//
//
//            val alert = dialogBuilder.create()
//            alert.setTitle("AlertDialogExample")
//            alert.show()
//
//        }
//
//        override fun onClick(pos: Int) {
//
//        }
//
//    override fun sendWord(wordString: String) {
//        TODO("Not yet implemented")
//    }
