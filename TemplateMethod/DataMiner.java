package TemplateMethod;

public abstract class DataMiner {
    
    /**
     * @param path
     */
    public void mine(String path) {
        Object file = openFile(path);
        String rawData = extractData(file);
        String data = parseData(rawData);
        String analysis = analyzeData(data);
        sendReport(analysis);
        closeFile(file);
    }

    protected abstract Object openFile(String path);
    protected abstract String extractData(Object file);
    protected abstract String parseData(String rawData);
    protected abstract void closeFile(Object file);

    protected String analyzeData(String data) {
        System.out.println("Analyzing data...");
        return "Analysis generated from data: " + data;
    }

    protected void sendReport(String analysis) {
        System.out.println("Sending report...");
        System.out.println(analysis);
    }
}
