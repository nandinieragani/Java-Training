package com.hcltech.Excer8;

@Copyright("2024 Jay- ABC Technologies")
public class PRP {
    public void display() {
        System.out.println("This is the PRP class.");
    }

    public static void main(String[] args) {
        PRP prp = new PRP();
        prp.display();

        // Retrieve the annotation value at runtime
        if (PRP.class.isAnnotationPresent(Copyright.class)) {
            Copyright copyright = PRP.class.getAnnotation(Copyright.class);
            System.out.println("Copyright: " + copyright.value());
        }
    }
}
