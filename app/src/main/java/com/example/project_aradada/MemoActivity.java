package com.example.project_aradada;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MemoActivity extends AppCompatActivity {

    EditText mMemoEdit = null;
    MemoFileManager mTextFileManager = new MemoFileManager(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);

        mMemoEdit = (EditText) findViewById(R.id.memo_edit);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            // 1. 파일에 저장된 메모 텍스트 파일 불러오기
            case R.id.save_btn: {
                String memoData = mMemoEdit.getText().toString();
                mTextFileManager.save(memoData);
                mMemoEdit.setText("");

                Toast.makeText(this, "저장 완료", Toast.LENGTH_LONG).show();
                break;
            }

            }
        }
    }




