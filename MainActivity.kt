package fr.enfant_meme.naturecollection


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import fr.enfant_meme.naturecollection.fragments.HomeFragment

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
// injecter le fragment dans notre boite (fragment_container)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, HomeFragment())
        transaction.addToBackStack (null)
        transaction.commit()
    }
}