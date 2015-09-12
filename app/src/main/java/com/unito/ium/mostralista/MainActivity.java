package com.unito.ium.mostralista;

import android.content.Intent;

import android.provider.ContactsContract;
import android.provider.ContactsContract.Intents;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void fai(View aView) {
        Intent intent = new Intent(this, ListViewLoader.class);
        startActivity(intent);
    }

    public void lista(View aView) {
        Intent intent = new Intent(this, ListViewAndroidExample.class);
        startActivity(intent);
    }

    public void intento(View aView) {
        // Creates a new Intent to insert a contact
        Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
// Sets the MIME type to match the Contacts Provider
        intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
        // Inserts an email address
        intent.putExtra(Intents.Insert.EMAIL, "aaa@gpip.com") //mEmailAddress.getText())
/*
 * In this example, sets the email type to be a work email.
 * You can set other email types as necessary.
 */
                .putExtra(Intents.Insert.EMAIL_TYPE, ContactsContract.CommonDataKinds.Email.TYPE_WORK)
// Inserts a phone number
                .putExtra(Intents.Insert.PHONE, "123456789")// mPhoneNumber.getText())
/*
 * In this example, sets the phone type to be a work phone.
 * You can set other phone types as necessary.
 */
                .putExtra(Intents.Insert.PHONE_TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_WORK);
        /* Sends the Intent
     */
        startActivity(intent);
    }
}
