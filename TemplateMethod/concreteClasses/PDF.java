package TemplateMethod.concreteClasses;

import TemplateMethod.DataMiner;

public class PDF extends DataMiner {

    @Override
    protected Object openFile(String path) {
        System.out.println("Opening PDF file from '" + path + "'...");
        return "PDF file opened";
    }

    @Override
    protected String extractData(Object file) {
        System.out.println("Extracting data from PDF file '" + file + "'...");
        return "Raw PDF data";
    }

    @Override
    protected String parseData(String rawData) {
        System.out.println("Parsing PDF data...");
        return "Parsed PDF data";
    }

    @Override
    protected void closeFile(Object file) {
        System.out.println("Closing PDF file '" + file + "'...");
    }
    
}
