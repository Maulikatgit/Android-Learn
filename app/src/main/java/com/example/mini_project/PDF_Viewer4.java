package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;


public class PDF_Viewer4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("Assignment_5.pdf").load();

    }

}
