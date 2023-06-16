package io.github.dijalmir.dpabstractfactory;

public class FactoryProvider {
    
    public static AbstractFactory getFactory(String choice) {
        if ("NotebookGamer".equalsIgnoreCase(choice)) {
            return new FactoryNotebookGamer();
        }
        else if("NotebookOfficeW".equalsIgnoreCase(choice)){
            return new FactoryNotebookOfficeW();
        }
        return null;
    }
    
}
