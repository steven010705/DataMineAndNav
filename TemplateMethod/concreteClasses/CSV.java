package TemplateMethod.concreteClasses;

import TemplateMethod.DataMiner;

public class CSV extends DataMiner {

    @Override
    protected void closeFile(Object file) {
        System.out.println("Closing CSV file '" + file + "'...");
    }

    @Override
    protected String extractData(Object file) {
        System.out.println("Extracting data from CSV file '" + file + "'...");
        return "Raw CSV data";
    }

    @Override
    protected Object openFile(String path) {
        System.out.println("Opening CSV file from '" + path + "'...");
        return "CVS file opened";
    }

    @Override
    protected String parseData(String rawData) {
        System.out.println("Parsing CSV data...");
        return "Parsed CSV data";
    }
    
    


}
