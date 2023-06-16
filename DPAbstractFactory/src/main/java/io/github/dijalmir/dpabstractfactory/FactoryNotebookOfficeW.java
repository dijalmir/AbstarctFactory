package io.github.dijalmir.dpabstractfactory;

public class FactoryNotebookOfficeW implements AbstractFactory{

    @Override
    public Notebook criarNotebook() {
        return new NotebookOfficeW();
    }
}
