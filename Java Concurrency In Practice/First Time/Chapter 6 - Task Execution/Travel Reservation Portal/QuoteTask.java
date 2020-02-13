private class QuoteTask implements Callable<TravelQuote> {
    private final TravelCompany company;
    private final TravelInfo travelInfo;
    //...
    public TravelQuote call() throws Exception {
    return company.solicitQuote(travelInfo);
    }
}