package com.example.huixing.regexlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private EditText pass;
    private Button   sure;
    /**
     * 匹配由小写字母，数字，下划线和连字符组成的字符串
     */
    public String reGex = "^[a-z0-9_-]{3,15}$";
    /**
     * 匹配第三位是 小写字母  z 的字符串
     */
    public String reGex2 = "..z..";


    /**
     * 匹配一个字符后面跟着ar ，但是这个字符不能是c。
     */
    public String reGex3 = "[^c]ar";

    public String reGex4 = "[a-z]*";

    public String reGex5 = "*z";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pass = (EditText) findViewById(R.id.pass);
        sure = (Button) findViewById(R.id.btn_sure);
        sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = pass.getText().toString();
                Pattern pattern = Pattern.compile(reGex4);
                Matcher matcher = pattern.matcher(s);

                boolean b = matcher.matches();

                if (b){
                    Toast.makeText(MainActivity.this, "密码符合要求", Toast.LENGTH_SHORT).show();

                }else {

                    Toast.makeText(MainActivity.this, "不行", Toast.LENGTH_SHORT).show();

                }


            }
        });

    }
}
