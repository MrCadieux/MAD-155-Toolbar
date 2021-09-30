package com.example.mytoolbar3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class Favorite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.actionbuttons,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.action_favorite -> {
                Toast.makeText(this, "Favorite Selected", Toast.LENGTH_SHORT).show()
                intent = Intent(this, Favorite::class.java)
                startActivity(intent)
            }
            R.id.action_settings -> {
                Toast.makeText(this, "Settings Selected", Toast.LENGTH_SHORT).show()
                intent = Intent(this, Settings::class.java)
                //startActivity(intent)
            }
            R.id.action_games -> {
                Toast.makeText(this, "Games Selected", Toast.LENGTH_SHORT).show()
                intent = Intent(this, Games::class.java)
                startActivity(intent)
            }
            R.id.action_profile -> {
                Toast.makeText(this, "Profile Selected", Toast.LENGTH_SHORT).show()
                intent = Intent(this, Profile::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}