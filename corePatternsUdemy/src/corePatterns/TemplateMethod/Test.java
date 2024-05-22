package corePatterns.TemplateMethod;

public class Test {

    public static void main(String[] args) {
        DataRenderer renderer = new XMLDataRenderer();

        renderer.render();
    }
}
