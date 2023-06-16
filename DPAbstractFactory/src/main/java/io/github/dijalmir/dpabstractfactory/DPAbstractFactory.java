package io.github.dijalmir.dpabstractfactory;

public class DPAbstractFactory {

    public static void main(String[] args) {
        AbstractFactory ngf = FactoryProvider.getFactory("NotebookOfficeW");
        Notebook ng = (Notebook)ngf.criarNotebook();
        ng.getSpecs();
    }
}
