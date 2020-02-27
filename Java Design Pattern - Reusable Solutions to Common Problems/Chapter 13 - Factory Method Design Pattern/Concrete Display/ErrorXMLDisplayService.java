public class ErrorXMLDisplayService extends DisplayService {
    @Override
    public XMLParser getParser() {
        return new ErrorXMLParser();
    }
}