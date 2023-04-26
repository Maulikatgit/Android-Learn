package com.example.mini_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pra1 extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pra1);

        recyclerView = findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> codeSnippets = new ArrayList<>();
        codeSnippets.add("public class MainActivity extends AppCompatActivity {\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "    }\n" +
                "}");
        codeSnippets.add("private void setToolbarTitle(String title) {\n" +
                "    ActionBar actionBar = getSupportActionBar();\n" +
                "    if (actionBar != null) {\n" +
                "        actionBar.setTitle(title);\n" +
                "    }\n" +
                "}");
        codeSnippets.add("TextView textView = findViewById(R.id.text_view);\n" +
                "textView.setText(\"Hello, World!\");");

        CodeSnippetAdapter adapter = new CodeSnippetAdapter(codeSnippets);
        recyclerView.setAdapter(adapter);
    }

    private static class CodeSnippetAdapter extends RecyclerView.Adapter<CodeSnippetAdapter.CodeSnippetViewHolder> {

        private List<String> codeSnippets;

        public CodeSnippetAdapter(List<String> codeSnippets) {
            this.codeSnippets = codeSnippets;
        }

        @NonNull
        @Override
        public CodeSnippetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.code_snippet_item, parent, false);
            return new CodeSnippetViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull CodeSnippetViewHolder holder, int position) {
            String codeSnippet = codeSnippets.get(position);
            holder.codeSnippetTextView.setText(codeSnippet);
        }

        @Override
        public int getItemCount() {
            return codeSnippets.size();
        }

        private static class CodeSnippetViewHolder extends RecyclerView.ViewHolder {

            private TextView codeSnippetTextView;

            public CodeSnippetViewHolder(@NonNull View itemView) {
                super(itemView);
                codeSnippetTextView = itemView.findViewById(R.id.code_snippet);
            }
        }
    }
}
