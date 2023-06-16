package io.github.dijalmir.dpabstractfactory;

public class FactoryNotebookGamer implements AbstractFactory {

    @Override
    public Notebook criarNotebook() {
        return new NotebookGamer();
    }
    
}
