package com.example.mygithubtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    private EditText inputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("Tess","OnCreate");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Tess","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Tess","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Tess","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Tess","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Tess","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("Tess","onRestart");
    }
    public void test1(View view){
        finish();
    }
    public void finish(){
        //super.finish(); 真正離開的地方在這邊，但這邊已經被遮起來了，所以要離開app時會離不開
        Toast.makeText(this,"One more", LENGTH_SHORT).show();
    }

    public void test2(View view){ //當user按下這顆按鈕，我們會讓他做的事情就是跳到page2
        Intent intent = new Intent(this,PageActivity2.class);
        //第一個參數是你現在activity的context
        startActivity(intent); //這邊呼叫startActivity，把intent帶過去
}