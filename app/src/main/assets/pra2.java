private String readFileFromAssets(String fileName) {
        String codeSnippet = "";

        try {
            InputStream inputStream = getAssets().open(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while ((line = reader.readLine()) != null) {
                codeSnippet += line + "\n";
            }
            reader.close();
            inputStream.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return codeSnippet;
        }
}