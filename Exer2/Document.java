package com.hcltech.Exer2;

public class Document {
    private String text;

    // Constructor to initialize text
    public Document(String text) {
        this.text = text;
    }

    // Getter method for text
    public String getText() {
        return text;
    }

    // Setter method for text
    public void setText(String text) {
        this.text = text;
    }

    // Override toString method to return the text field
    @Override
    public String toString() {
        return text;
    }

    // Main method to test the Document class
    public static void main(String[] args) {
        Document doc = new Document("This is the initial text of the document.");
        System.out.println(doc);

        doc.setText("This is the updated text of the document.");
        System.out.println(doc);
    }
}
