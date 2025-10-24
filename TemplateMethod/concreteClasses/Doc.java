package TemplateMethod.concreteClasses;

import TemplateMethod.DataMiner;

public class Doc extends DataMiner {

    @Override
    protected Object openFile(String path) {
        System.out.println("Opening DOC file from '" + path + "'...");
        return "DOC file opened";
    }

    @Override
    protected String extractData(Object file) {
        System.out.println("Extracting data from DOC file " + file + "'...");
        return "Raw DOC data";
    }

    @Override
    protected String parseData(String rawData) {
        System.out.println("Parsing DOC data...");
        return "Parsed DOC data";
    }

    @Override
    protected void closeFile(Object file) {
        System.out.println("Closing DOC file '" + file + "'...");
    }
    
}
